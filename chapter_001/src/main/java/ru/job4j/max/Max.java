package ru.job4j.max;

/**
 * class Max максимум из двух чисел.
 *
 * @author Pavel Ivanov (pavel.ivanov.060988@gmail.com)
 * @version $Id$
 * @since 26.05.2017
 */

public class Max {
    /**
     * Max. максимум из двух чисел
     * @param first - первый аргумент
	 * @param second - второй аргумент
	 * @method max определет максимум из двух чисел
	 * @return return - результат
     */

    public int max(int first, int second) {
        return (first < second ? second : first);
    }
	    /**
     * Max. максимум из трех чисел
     * @param first - первый аргумент
	 * @param second - второй аргумент
	 * @param third - третий аргумент
	 * @method max определет максимум из трех чисел
	 * @return return - результат
     */

	public int max(int first, int second, int third) {
		return max(first, max(second, third));
	}
}