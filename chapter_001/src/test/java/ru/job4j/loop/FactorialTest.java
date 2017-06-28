package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 * Тест метода calc класса Factorial
 * @author Pavel Ivanov (pavel.ivanov060988@gmail.com)
 * @version 1.0
 * @since 28.06.2017
 */
public class FactorialTest {
	/**
	* @method проверки вычисления факториала из 5.
	*/
	@Test
	public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
		Factorial factorial = new Factorial();
		int expected = 120;
		assertThat(factorial.calc(5), is(expected));
	}

	/**
	* @method проверки вычисления факториала из 0.
	*/
	@Test
	public void whenCalculateFactorialForZeroThenOne() {
		Factorial factorial = new Factorial();
		int expected = 1;
		assertThat(factorial.calc(0), is(expected));
	}
}