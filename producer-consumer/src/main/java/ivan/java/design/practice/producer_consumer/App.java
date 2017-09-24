package ivan.java.design.practice.producer_consumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ItemQueue queue = new ItemQueue();

		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 2; i++) {

			final Producer producer = new Producer("Producer_" + i, queue);
			executorService.submit(() -> {
				while (true) {
					producer.produce();
				}
			});
		}

		for (int i = 0; i < 3; i++) {
			final Consumer consumer = new Consumer("Consumer_" + i, queue);
			executorService.submit(() -> {
				while (true) {
					consumer.consume();
				}
			});
		}

		executorService.shutdown();

		try {
			executorService.awaitTermination(10, TimeUnit.SECONDS);
			executorService.shutdown();
		} catch (InterruptedException e) {

		}
	}
}
