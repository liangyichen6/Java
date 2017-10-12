package ivan.java.thinkinginjava.practice.collection;

public class CollectionDataGeneration {

	public static void main(String[] args) {
		
		System.out.println(CollectionData.list(new RandomGenerator.String(9), 10));
	}
}
