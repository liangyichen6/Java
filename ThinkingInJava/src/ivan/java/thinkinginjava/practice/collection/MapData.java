package ivan.java.thinkinginjava.practice.collection;

import java.util.LinkedHashMap;

import ivan.java.thinkinginjava.practice.util.Generator;

public class MapData<K, V> extends LinkedHashMap<K, V> {

	public MapData(Generator<Pair<K, V>> gen, int quantity) {
		for (int i = 0; i < quantity; i++) {
			Pair<K, V> p = gen.next();
			put(p.key, p.value);
		}
	}

	public MapData(Generator<K> genK, Generator<V> genV, int quantity) {
		for (int i = 0; i < quantity; i++) {
			put(genK.next(), genV.next());
		}
	}

	public MapData(Generator<K> genK, V value, int quantity) {
		for (int i = 0; i < quantity; i++) {
			put(genK.next(), value);
		}
	}

	public MapData(Iterable<K> genK, Generator<V> genV) {
		for (K key : genK) {
			put(key, genV.next());
		}
	}

	public static <K, V> MapData<K, V> map(Generator<Pair<K, V>> gen, int quantity) {
		return new MapData<K,V>(gen,quantity);
	}

}
