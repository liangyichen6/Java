package ivan.java.design.practice.producer_consumer;

import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class CosumerTest {

	private static final int ITEM_COUNT = 5;

	@Test
	public void testConsume() throws Exception {
		final ItemQueue queue = spy(new ItemQueue());
		for (int id = 0; id < ITEM_COUNT; id++) {
			queue.put(new Item("producer", id));
		}

		reset(queue);

		final Consumer consumer = new Consumer("consumer", queue);

		for (int id = 0; id < ITEM_COUNT; id++) {
			consumer.consume();
		}

		verify(queue, times(ITEM_COUNT)).take();
	}
}
