package ru.job4j.profession;
/**
 * Class Teacher.
 *
 * @author Pavel Ivanov (pavel.ivanov.060988@gmail.com)
 * @version 1
 * @since 17.10.2017
 */
public class Teacher extends Profession {
    /**
     * Constructor class Teacher.
	 * @param name имя профессионала
	 * @param qualification кфалификация профессионала
	 * @param specialization специализация профессионала
	 * @param experience опыт профессионала
	 * @param working название учреждения
     */
    public Teacher(String name, String qualification, String specialization, String experience, String working) {
        super(name, qualification, specialization, experience, working);
    }
    /**
     * Method toEducate.
     * @param people имя студента
     * @return значение
     */
    public String toEducate(People people) {
        return "Учитель " + this.getSpecialization() + " " + this.getName() + " учит студента " + people.getName();
    }
}