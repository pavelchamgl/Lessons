package ru.job4j;

/**
 * class Calculator Элементарный калькулятор.
 * Сложение, вычитание, деление и умножение
 *
 * @author Pavel Ivanov (pavel.ivanov.060988@gmail.com)
 * @version $Id$
 * @since 16.05.2017
 */

public class Calculator {
    /**
     * Calculator. Элементарный калькулятор
     * @param first - первый аргумент
	 * @param second - второй аргумент
	 * @method add - Сложене
	 * @method substruct - вычитание
	 * @method div - деление
	 * @method multiple - умножение
     */
		private double result;

			/**
			 * Сложене.
			 * @param first - первый аргумент
			 * @param second - второй аргумент
			 */

		public void add(double first, double second) {
			this.result = first + second;
		}

			/**
			 * @method substruct - Сложене
			 * @param first - первый аргумент
			 * @param second - второй аргумент
			 */

		public void substruct(double first, double second) {
			this.result = first - second;
		}

			/**
			 * @method div - Сложене
			 * @param first - первый аргумент
			 * @param second - второй аргумент
			 */

		public void div(double first, double second) {
			this.result = first / second;
		}

			/**
			 * @method multiple - Сложене
			 * @param first - первый аргумент
			 * @param second - второй аргумент
			 */

		public void multiple(double first, double second) {
			this.result = first * second;
		}

			/**
			 * @method getResult - Результат
			 * @return result - результат
			 */

		public double getResult() {
			//Результат
			return this.result;
		}
}