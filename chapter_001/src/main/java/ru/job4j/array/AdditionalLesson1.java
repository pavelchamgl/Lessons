package ru.job4j.array;

/**
 * class AdditionalLesson проверка отсортированности массива.
 *
 * @author Pavel Ivanov (pavel.ivanov.060988@gmail.com)
 * @version 1.0
 * @since 20.08.2017
 */

public class AdditionalLesson1 {
	/**
	* @param массив целых чисел
	*/
	private int[] array;
	/**
	 * @method Метод записи входящего массива в поле класса AdditionalLesson.
	 * @param arr воходящий массив
	 */
	public AdditionalLesson1(int[] arr) {
		this.array = arr;
	}
	/**
	* @method проверяет отсортирован ли массив и если отсортирован то как имеено.
	* @return возвращает результат
	*/
	public String sortAscending() {
		/**
		* @param coincidence хранит в себе кол-во совпадений в массиве
		*/
		int coincidence = 0;
		/**
		* @param numberOfIterations хранит в себе кол-во итераций/длину массива
		*/
		int numberOfIterations = array.length - 1;
		for (int i = 0; i < numberOfIterations; i++) {
			if (array[i] <= array[i + 1]) {
				coincidence++;
			} else {
				coincidence--;
			}
		}
		if ((coincidence == numberOfIterations) && (array[0] <= array[numberOfIterations])) {
			return "Массив отсортирован по возрастанию";
		} else if ((coincidence == -(numberOfIterations)) && (array[0] >= array[numberOfIterations])) {
			return "Массив отсортирован по убыванию";
		} else {
			return "Массив не отсортирован";
		}
	}
}