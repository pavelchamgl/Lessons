package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * Тест метода remove класса ArrayDuplicate
 * @author Pavel Ivanov (mailto:pavel.ivanov060988@gmail.com)
 * @version 1.0
 * @since 26.07.2017
 */
public class ArrayDuplicateTest {
	/**
	* @method Метод проверяющий удалене дубликатов строк из массива.
	*/
	@Test
	public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
		String[] arrayTest = {"Привет", "Мир", "Привет", "Супер", "Мир"};
		String[] expectArray = {"Привет", "Мир", "Супер"};
		ArrayDuplicate array = new ArrayDuplicate();
		String[] resultArray = array.remove(arrayTest);
		assertThat(resultArray, is(expectArray));
	}
}