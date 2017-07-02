package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 * Тест метода paint класса Board
 * @author Pavel Ivanov (pavel.ivanov060988@gmail.com)
 * @version 1.0
 * @since 02.07.2017
 */
public class BoardTest {
	/**
	* @method тест, проверяющий формирование доски 3 на 3.
	*/
	@Test
	public void whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {
		Board board = new Board();
		String result = board.paint(3, 3);
		final String line = System.getProperty("line.separator");
		String expected = String.format("x x%s x %sx x%s", line, line, line);
		assertThat(result, is(expected));
 }

	/**
	* @method тест, проверяющий формирование доски 5 на 4.
	*/
	@Test
	public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows() {
		Board board = new Board();
		String result = board.paint(5, 4);
		final String line = System.getProperty("line.separator");
		String expected = String.format("x x x%s x x %sx x x%s x x %s", line, line, line, line);
		assertThat(result, is(expected));
	}
}
