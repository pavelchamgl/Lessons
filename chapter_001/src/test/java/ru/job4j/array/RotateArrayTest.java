package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * Тест метода rotate класса RotateArray
 * @author Pavel Ivanov (mailto:pavel.ivanov060988@gmail.com)
 * @version 1.0
 * @since 25.07.2017
 */
public class RotateArrayTest {
	/**
	* @method Метод проверяющий поворот массива размером 3 на 3.
	*/
	@Test
	public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
		int[][] arrayTest = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] expectArray = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
		RotateArray rotateArray = new RotateArray();
		int[][] resultArray = rotateArray.rotate(arrayTest);
		assertThat(resultArray, is(expectArray));
	}

	/**
	* @method Метод проверяющий поворот массива размером 2 на 2.
	*/
	@Test
	public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
		int[][] arrayTest = {{1, 2}, {4, 5}};
		int[][] expectArray = {{4, 1}, {5, 2}};
		RotateArray rotateArray = new RotateArray();
		int[][] resultArray = rotateArray.rotate(arrayTest);
		assertThat(resultArray, is(expectArray));
	}
}