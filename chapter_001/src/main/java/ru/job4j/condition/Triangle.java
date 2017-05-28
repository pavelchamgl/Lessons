package ru.job4j.condition;
/**
 * class Triangle вычисление площади треугольника.
 * @author Pavel Ivanov (pavel.ivanov.060988@gmail.com)
 * @version 1.0
 * @since 26.05.2017
 */
public class Triangle {
	/**
	* @param точка "а" класса Point с описанием координат x и y
	*/
	private Point a;
	/**
	* @param точка "b" класса Point с описанием координат x и y
	*/
	private Point b;
	/**
	* @param точка "c" класса Point с описанием координат x и y
	*/
	private Point c;
	/**
	* method метод записи точек в поле класса Triangle.
	* @param a - точка a
	* @param b - точка b
	* @param c - точка c
	*/
		public Triangle(Point a, Point b, Point c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
		/**
		* method distance метод определения расстояния между точеками.
		* @param a - координаты первой точки
		* @param b - координаты второй точки
		* @return расстояние междуточками
		*/
		public double distance(Point a, Point b) {
			return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
		}
		/**
		* method метод вычисления площади треугольника по трём точкам с контролем.
		* невозможности построить треугольник с заданными точками координатами.
		* perimeter - расчет периметра треугольника
		* @return area - площадь треугольника
		*/
		public double area() {
			double distanceAB = distance(a, b);
			double distanceAC = distance(a, c);
			double distanceBC = distance(b, c);
			double perimeter = (distanceAB + distanceAC + distanceBC) / 2;
			double area = Math.sqrt(perimeter * (perimeter - distanceAB) * (perimeter - distanceAC) * (perimeter - distanceBC));
				if (area == 0) {
				System.out.println("Невозможно построить треугольник с заданными координатами!");
				}
			return area;
		}
}