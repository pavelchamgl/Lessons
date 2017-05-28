package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 * Тест метода add класса Counter
 * @author Pavel Ivanov (mailto:pavel.ivanov060988@gmail.com)
 * @version 1.0
 * @since 28.05.2017
 */
public class CounterTest {
	/**
	* @method проверки подсчет суммы чётных чисел в диапазоне.
	*/
	@Test
	public void whenSumEvenNumbersFromOneToTenThenThirty() {
		Counter sum = new Counter();
		//int result = summ.add(1, 10);
		int expected = 30;
		assertThat(sum.add(1, 10), is(expected));
	}
}