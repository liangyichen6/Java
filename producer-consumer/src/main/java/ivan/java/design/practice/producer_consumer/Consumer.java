package ivan.java.design.practice.producer_consumer;

public class Consumer {

	private final ItemQueue queue;

	private final String name;

	public Consumer(String name, ItemQueue queue) {
		this.name = name;
		this.queue = queue;
	}

	public void consume() throws InterruptedException {

		Item item = queue.take();
	}
}
