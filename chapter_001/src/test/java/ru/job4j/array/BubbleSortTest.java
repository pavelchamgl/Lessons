package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * Тест метода sort класса BubbleSort
 * @author Pavel Ivanov (mailto:pavel.ivanov060988@gmail.com)
 * @version 1.0
 * @since 20.07.2017
 */
public class BubbleSortTest {
	/**
	* @method Метод проверки сортировки массива {1, 5, 4, 2, 3, 1, 7, 8, 0, 5}
	*/
	@Test
	public void whenSortArrayWithTenElementsThenSortedArray() {
		int[] arrayTest = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
		int[] expectArray = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
		BubbleSort bubbleSort = new BubbleSort();
		int[] resultArray = bubbleSort.sort(arrayTest);
		assertThat(resultArray, is(expectArray));
	}
}

