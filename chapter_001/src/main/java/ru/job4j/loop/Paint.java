package ru.job4j.loop;
/**
 * class Paint Строит пирамиду в псевдографике.
 * @author Pavel Ivanov (pavel.ivanov.060988@gmail.com)
 * @version 1.0
 * @since 03.07.2017
 */
public class Paint {
	/**
	 * method piramid рисует пирамиду из символа ^ и пробелов.
	 * @param h высота пирамиды
	 * @return получившаяся пирамида
	 */
	public  String piramid(int h) {
		int width = h * 2 - 1;
		StringBuilder piramid = new StringBuilder();
		String newLine = System.getProperty("line.separator");
		for (int y = 0; y < h; y++) {
			int widthLevel = y * 2 + 1;
			int left = (width - widthLevel) / 2;
			int right = width - left;
			for (int x = 0; x < width; x++) {
				piramid.append((left <= x && x < right) ? "^" : " ");
			}
			piramid.append(newLine);
		}
		return piramid.toString();
	}
}