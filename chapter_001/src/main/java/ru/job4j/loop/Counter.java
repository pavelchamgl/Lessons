package ru.job4j.loop;
/**
 * class Counter Подсчет суммы чётных чисел в диапазоне.
 * @author Pavel Ivanov (pavel.ivanov.060988@gmail.com)
 * @version 1.0
 * @since 28.05.2017
 */
public class Counter {
	/**
	* method add Подсчет суммы чётных чисел в диапазоне.
	* @param start - первое число диапозона
	* @param finish - второе число диапозона
	* @return возвращаем сумму
	*/
	public int add(int start, int finish) {
		int result = 0;
		for (int i = start; i <= finish; i++) {
			if (i % 2 == 0) {
				result = result + i;
			}
		}
		return result;
	}
}