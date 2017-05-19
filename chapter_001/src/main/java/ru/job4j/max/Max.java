package ru.job4j.max;

/**
 * class Max максимум из двух чисел.
 *
 * @author Pavel Ivanov (pavel.ivanov.060988@gmail.com)
 * @version $Id$
 * @since 19.05.2017
 */

public class Max {
    /**
     * Max. максимум из двух чисел
     * @param first - первый аргумент
	 * @param second - второй аргумент
	 * @method max определет максимум из двух чисел
	 * @return result - результат
     */

    public int max(int first, int second) {
        return (first < second ? second : first);
    }
}