package ivan.java.design.practice.producer_consumer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Consumer {

	private final ItemQueue queue;

	private final String name;

	public Consumer(String name, ItemQueue queue) {
		this.name = name;
		this.queue = queue;
	}

	public void consume() throws InterruptedException {

		Item item = queue.take();
		log.info("Consumer [{}] consume item [{}] produced by [{}]", name,
				item.getId(), item.getProducer());

	}
}
