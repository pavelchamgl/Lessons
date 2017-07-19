package ru.job4j.array;

/**
 * class Turn переворачивает массим.
 *
 * @author Pavel Ivanov (pavel.ivanov.060988@gmail.com)
 * @version 1.0
 * @since 19.07.2017
 */

public class Turn {
 /**
 * @method Метод переворота массива.
 * @param array исходный массив
 * @return перевернутый массив
 */

	public int[] back(int[] array) {
		for (int index = 0; index < array.length / 2; index++) {
				int tmp = array[index];
				array[index] = array[array.length - index - 1];
				array[array.length - index - 1] = tmp;
		}
		return array;
	}
}