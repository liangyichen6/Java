package ivan.java.thinkinginjava.practice.collection;

import java.util.Random;

import ivan.java.thinkinginjava.practice.util.Generator;

public class RandomGenerator {

	public static Random rd = new Random(47);

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

	public static class String implements Generator<java.lang.String> {

		@Override
		public java.lang.String next() {
			// TODO Auto-generated method stub
			return null;
		}

	}
}
