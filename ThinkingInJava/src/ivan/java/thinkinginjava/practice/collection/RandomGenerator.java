package ivan.java.thinkinginjava.practice.collection;

import java.util.Random;

import ivan.java.thinkinginjava.practice.util.Generator;

public class RandomGenerator {

	public static Random rd = new Random(47);

	public static class Boolean implements Generator<java.lang.Boolean> {
		@Override
		public java.lang.Boolean next() {
			// TODO Auto-generated method stub
			return rd.nextBoolean();
		}
	}

	public static class Byte implements Generator<java.lang.Byte> {
		@Override
		public java.lang.Byte next() {
			return (byte) rd.nextInt();
		}
	}

	public static class Character implements Generator<java.lang.Character> {
		@Override
		public java.lang.Character next() {
			return CountingGenerator.chars[rd.nextInt(CountingGenerator.chars.length)];
		}
	}

	public static class Integer implements Generator<java.lang.Integer> {
		private int mod = 1000;

		public Integer() {
		}

		public Integer(int mod) {
			this.mod = mod;
		}

		@Override
		public java.lang.Integer next() {

			return rd.nextInt(mod);
		}

	}

	public static class String extends CountingGenerator.String {

		{
			cg = new Character();
		}

		public String() {
		}

		public String(int length) {
			super(length);
		}
	}

	public static class Short implements Generator<java.lang.Short> {
		@Override
		public java.lang.Short next() {
			return (short) rd.nextInt();
		}
	}

	public static class Long implements Generator<java.lang.Long> {
		private int mod = 10000;

		public Long() {

		}

		public Long(int mod) {
			this.mod = mod;
		}

		@Override
		public java.lang.Long next() {
			return new java.lang.Long(rd.nextInt(mod));
		}
	}

	public static class Float implements Generator<java.lang.Float> {
		public java.lang.Float next() {
			// Trim all but the first two decimal places:
			int trimmed = Math.round(rd.nextFloat() * 100);
			return ((float) trimmed) / 100;
		}
	}

	public static class Double implements Generator<java.lang.Double> {
		public java.lang.Double next() {
			long trimmed = Math.round(rd.nextDouble() * 100);
			return ((double) trimmed) / 100;
		}
	}
}
