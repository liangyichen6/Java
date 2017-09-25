package ivan.java.design.practice.producer_consumer;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import org.junit.Test;

public class ProducerTest {

	@Test(timeout = 6000)
	public void testProduce() throws Exception {
		final ItemQueue queue = mock(ItemQueue.class);
		final Producer producer = new Producer("producer", queue);

		producer.produce();

		verify(queue).put(any(Item.class));

		verifyNoMoreInteractions(queue);
	}
}
