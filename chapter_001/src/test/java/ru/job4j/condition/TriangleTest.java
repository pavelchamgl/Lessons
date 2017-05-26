package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * Test.
 * Тест метода is класса Triangle
 * @author Pavel Ivanov (mailto:pavel.ivanov060988@gmail.com)
 * @version 1.0
 * @since 26.05.2017
 */
public class TriangleTest {
	/**
	* @method Проверка площади треугольника
	*/
	@Test
    public void testForArea() {
		Point a = new Point(1, 2);
		Point b = new Point(3, 4);
		Point c = new Point(6, 1);
		double except = 5.999999999999996;
		Triangle trian = new Triangle(a, b, c);
		assertThat(trian.area(), closeTo(except, 0.01));
	}
	/**
	* @method Проверка площади треугольника равной нулю.
	*/
	@Test
    public void whenTheAreaIsZeroThenTheResultIsZero() {
		Point a = new Point(0, 0);
		Point b = new Point(0, 0);
		Point c = new Point(0, 0);
		double except = 0;
		Triangle trian = new Triangle(a, b, c);
		assertThat(trian.area(), closeTo(except, 0.01));
	}
}