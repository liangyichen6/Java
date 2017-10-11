package ivan.java.thinkinginjava.practice.collection;

import ivan.java.thinkinginjava.practice.util.Generator;

public class Government implements Generator<String> {
	String[] foundation = ("Strange women lying in ponds "
			+ "distributing swords is no basis for a system of government").split(" ");

	private int index;

	@Override
	public String next() {
		return foundation[index++];
	}

}
