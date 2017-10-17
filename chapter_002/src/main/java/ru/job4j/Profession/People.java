package ru.job4j.profession;
/**
 * class People.
 *
 * @author Pavel Ivanov (pavel.ivanov.060988@gmail.com)
 * @version 1
 * @since 17.10.2017
 */
public class People {
	/**
	 * People.
	 * @param name хранит в себе имя человека
	 */
	 private String name;

	/**
	 * @method Метод записи имени в поле класса People.
	 * @param name имя
	 */
    public People(String name) {
        this.name = name;
    }
	/**
	 * @method возвращает name.
	 * @param name
	 * @return значение
	 */
    public String getName() {
        return name;
	}
}