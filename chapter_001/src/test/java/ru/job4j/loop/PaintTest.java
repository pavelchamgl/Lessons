package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 * Тест метода piramid класса Point
 * @author Pavel Ivanov (pavel.ivanov060988@gmail.com)
 * @version 1.0
 * @since 03.07.2017
 */
public class PaintTest {
	/**
	* @method тест метода piramid, проверяющий формирование треугольника с высотой 2.
	*/
	@Test
	public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
		Paint paint = new Paint();
		String result = paint.piramid(2);
		final String line = System.getProperty("line.separator");
		String expected = String.format(" ^ %s^^^%s", line, line);
		assertThat(result, is(expected));
	}

	/**
	* @method тест метода piramid, проверяющий формирование треугольника с высотой 3.
	*/
	@Test
	public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
		Paint paint = new Paint();
		String result = paint.piramid(3);
		final String line = System.getProperty("line.separator");
		String expected = String.format("  ^  %s ^^^ %s^^^^^%s", line, line, line);
		assertThat(result, is(expected));
	}
}