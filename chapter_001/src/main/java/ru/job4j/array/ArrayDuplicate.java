package ru.job4j.array;

import java.util.Arrays;

/**
 * class ArrayDuplicate Удаление дубликатов в массиве.
 *
 * @author Pavel Ivanov (pavel.ivanov.060988@gmail.com)
 * @version 1.0
 * @since 26.07.2017
 */

public class ArrayDuplicate {
 /**
 * @method Метод  уберает все дубликаты строк из массива.
 * @param array исходный массив
 * @return возвращаем массив без дубликатов
 */

	public String[] remove(String[] array) {
		int arrayLength = array.length;
		for (int index = 0; index < arrayLength; index++) {
			for (int comparable = index + 1; comparable < arrayLength; comparable++) {
				if (array[index].equals(array[comparable])) {
					array[comparable] = array[arrayLength - 1];
					arrayLength--;
					comparable--;
				}
			}
		}
		return Arrays.copyOf(array, arrayLength);
	}
}