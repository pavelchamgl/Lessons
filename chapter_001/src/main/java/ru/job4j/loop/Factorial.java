package ru.job4j.loop;
/**
 * class Factorial Вычисляет факториал.
 * @author Pavel Ivanov (pavel.ivanov060988@gmail.com)
 * @version 1.0
 * @since 28.06.2017
 */
public class Factorial {
	/**
	* method calc Вычисляет факториал.
	* @param n целое число
	* @return возвращаем значение факториала
	*/
	public int calc(int n) {
		int factorial = 1;
		if (n >= 0) {
			for (int i = 1; i <= n; i++) {
				factorial *= i;
			}
		}
		return factorial;
	}
}