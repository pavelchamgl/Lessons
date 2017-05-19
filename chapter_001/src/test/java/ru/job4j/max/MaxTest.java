package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
* Тестирование метода max класса Max
* @author Pavel Ivanov (mailto:pavel.ivanov060988@gmail.com)
* @version $Id$
* @since 1.05.2017
*/
public class MaxTest {
	/**
	* Test.
	* Метода метода max
	*/

	@Test
	public void whenTheValuesAreTenAndTwoThenMaximumOfTen() {
		Max value = new Max();
		int result = value.max(10, 2);
		int expected = 10;
		assertThat(result, is(expected));
	}
}