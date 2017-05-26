package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
* Тестирование метода max класса Max
* @author Pavel Ivanov (mailto:pavel.ivanov060988@gmail.com)
* @version $Id$
* @since 26.05.2017
*/
public class MaxTest {
	/**
	* Test.
	* Метода max
	* Максимум из двух чисел
	*/

	@Test
	public void whenTheValuesAreTenAndTwoThenMaximumOfTen() {
		Max value = new Max();
		int result = value.max(10, 2);
		int expected = 10;
		assertThat(result, is(expected));
	}
		/**
	* Test.
	* Метода max
	* Максимум из трех чисел
	*/

	@Test
	public void whenTheValuesAreOneTwoAndFiveThenMaximumOfFive() {
		Max value = new Max();
		int result = value.max(1, 2, 5);
		int expected = 5;
		assertThat(result, is(expected));
	}
}