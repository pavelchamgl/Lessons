package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * Тест метода is класса Point
 * @author Pavel Ivanov (mailto:pavel.ivanov060988@gmail.com)
 * @version 1.0
 * @since 21.05.2017
 */
public class PointTest {
	/**
	* @method Метод проверки нахожения точки на функции
	*/
	@Test
    public void searchCondition() {
		Point pointXY = new Point(3, 18);
		//pointXY.point(3, 18);
		assertThat(pointXY.is(5, 3), is(true));
	}
}