package ru.job4j.loop;
/**
 * class Board Строит шахматную доску в псевдографике.
 * @author Pavel Ivanov (pavel.ivanov.060988@gmail.com)
 * @version 1.0
 * @since 02.07.2017
 */
public class Board {
	/**
	 * method paint Строит шахматную доску в псевдографике.
	 * @param width  ширина
	 * @param height высота
	 * @return готовый вариант доски
	 */
	public String paint(int width, int height) {
		StringBuilder board = new StringBuilder();
		String newLine = System.getProperty("line.separator");
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				board.append((x + y) % 2 == 0 ? "x" : " ");
			}
			board.append(newLine);
		}
		return board.toString();
	}
}