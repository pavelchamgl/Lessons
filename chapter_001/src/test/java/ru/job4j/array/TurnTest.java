package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * Тест метода back класса Turn
 * @author Pavel Ivanov (mailto:pavel.ivanov060988@gmail.com)
 * @version 1.0
 * @since 19.07.2017
 */
public class TurnTest {
	/**
	* @method Метод проверки переворота массива {2, 6, 1, 4}
	*/
	@Test
	public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
		int[] arrayTest = {2, 6, 1, 4};
		int[] expectArray = {4, 1, 6, 2};
		Turn turn = new Turn();
		int[] resultArray = turn.back(arrayTest);
		assertThat(resultArray, is(expectArray));
	}

	/**
	* @method Метод проверки переворота массива {1, 2, 3, 4, 5}
	*/
	@Test
	public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
		int[] arrayTest = {1, 2, 3, 4, 5};
		int[] expectArray = {5, 4, 3, 2, 1};
		Turn turn = new Turn();
		int[] resultArray = turn.back(arrayTest);
		assertThat(resultArray, is(expectArray));
	}
}