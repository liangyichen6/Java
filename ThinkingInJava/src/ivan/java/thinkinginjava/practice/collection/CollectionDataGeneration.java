package ivan.java.thinkinginjava.practice.collection;

import java.util.ArrayList;

import ivan.java.thinkinginjava.practice.util.Generator;

public class CollectionDataGeneration {

	public static void main(String[] args) {
		
		System.out.println(new ArrayList<String>(CollectionData.list(new Generator(9),10        )))
	}
}
