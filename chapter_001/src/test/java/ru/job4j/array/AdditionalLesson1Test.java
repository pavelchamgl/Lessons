package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 * Тест метода sort класса AdditionalLesson
 * @author Pavel Ivanov (mailto:pavel.ivanov060988@gmail.com)
 * @version 1.0
 * @since 20.08.2017
 */
public class AdditionalLesson1Test {
	/**
	* @method проверки отсортирован ли массив {0, 2, 3, 4, 5, 6, 7, 8, 9, 0}
	*/
	@Test
	public void whenSortArrayNotSortedThenTrue() {
		int[] arrayTest = {0, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		String expect = "Массив не отсортирован";
		AdditionalLesson1 additionalLesson = new AdditionalLesson1(arrayTest);
		assertThat(additionalLesson.sortAscending(), is(expect));
	}
	/**
	 * @method проверки отсортирован ли массив по убыванию {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
	 */
	@Test
	public void whenSortArrayAscendingThenTrue() {
		int[] arrayTest = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		String expect = "Массив отсортирован по убыванию";
		AdditionalLesson1 additionalLesson = new AdditionalLesson1(arrayTest);
		assertThat(additionalLesson.sortAscending(), is(expect));
	}
	/**
	 * @method проверки отсортирован ли массив по возрастанию {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
	 */
	@Test
	public void whenSortArrayDescendinglyThenTrue() {
		int[] arrayTest = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		String expect = "Массив отсортирован по возрастанию";
		AdditionalLesson1 additionalLesson = new AdditionalLesson1(arrayTest);
		assertThat(additionalLesson.sortAscending(), is(expect));
	}

}