package ru.job4j.array;

/**
 * class BubbleSort Сортировка массива методом перестановки (пузырьком).
 *
 * @author Pavel Ivanov (pavel.ivanov.060988@gmail.com)
 * @version 1.0
 * @since 20.07.2017
 */

public class BubbleSort {
 /**
 * @method Сортирует массив методом перестановки (пузырьком).
 * @param array исходный массив
 * @return возвращаем массив, отсортированный по возрастанию
 */

	public int[] sort(int[] array) {
		int temp;
		for (int i = array.length - 1; i >= 0; i--) {
			for (int index = 0; index < i; index++) {
				if (array[index] > array[index + 1]) {
					temp = array[index];
					array[index] = array[index + 1];
					array[index + 1] = temp;
				}
			}
		}
		return array;
	}
}