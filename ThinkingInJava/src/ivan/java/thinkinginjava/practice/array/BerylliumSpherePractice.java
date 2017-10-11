package ivan.java.thinkinginjava.practice.array;

import java.util.Arrays;

public class BerylliumSpherePractice {

	public static BerylliumSphere[] createBerylliumSphereArray(int n) {

		if (n <= 0) {
			throw new IllegalArgumentException("Array length should more than zero.");
		}

		BerylliumSphere[] berylliumSphereArray = new BerylliumSphere[n];
		
		for (int i = 0; i < n; i++) {
			berylliumSphereArray[i] = new BerylliumSphere();
		}

		return berylliumSphereArray;
	}

	public static void main(String[] args) {
		BerylliumSphere[] array = createBerylliumSphereArray(5);
		System.out.println(Arrays.toString(array));
	}
}
