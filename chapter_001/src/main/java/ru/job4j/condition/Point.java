package ru.job4j.condition;

/**
 * class Класс программы положение точки.
 *
 * @author Pavel Ivanov (pavel.ivanov.060988@gmail.com)
 * @version 1
 * @since 21.05.2017
 */

public class Point {
	/**
	 * Point.
	 * @param x описание точки в системе координат
	 */
	private int x;
	/**
	 * @param y описание точки в системе координат
	 */
	private int y;
	/**
	 * @method Метод записи координат x и y в поле класса Point.
	 * @param x координата X
	 * @param y координата Y
	 */
		public void point(int x, int y) {
      this.x = x;
      this.y = y;
  }
/**
*Метод возарвщает X.
*@return X
*/
	public int getX() {
    return this.x;
  }
/**
* Метод возарвщает Y.
*@return Y
*/
	public int getY() {
    return this.y;
  }
/**
* @method Метод проверки находитс ли точка на функции.
* @param a значение а для функции y(x)=a*x+b
* @param b значение b для функции y(x)=a*x+b
* @return true или false
*/
	public boolean is(int a, int b) {
	return this.y == a * this.x + b;
	}
}