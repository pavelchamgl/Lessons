package ru.job4j.array;
/**
 * class RotateArray Поворот квадратного массива.
 *
 * @author Pavel Ivanov (pavel.ivanov.060988@gmail.com)
 * @version 1.0
 * @since 25.07.2017
 */

public class RotateArray {
 /**
 * @method Метод поворачивает двумерный массив по часовой стрелке.
 * @param array исходный массив
 * @return возвращаем массив, повёрнутый на 90 градусов по часовой стрелке
 */

	public int[][] rotate(int[][] array) {
		for (int a = 0; a < array.length / 2; a++) {
			for (int b = a; b < array.length - 1 - a; b++) {
				int tmp = array[a][b];
				array[a][b] = array[array.length - b - 1][a];
				array[array.length - b - 1][a] = array[array.length - a - 1][array.length - b - 1];
				array[array.length - a - 1][array.length - b - 1] = array[b][array.length - a - 1];
				array[b][array.length - a - 1] = tmp;
			}
		}
		return array;
	}
}
