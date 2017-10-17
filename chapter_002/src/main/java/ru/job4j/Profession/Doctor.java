package ru.job4j.profession;
/**
 * Class Doсtor.
 *
 * @author Pavel Ivanov (pavel.ivanov.060988@gmail.com)
 * @version 1
 * @since 17.10.2017
 */
public class Doctor extends Profession {
    /**
     * Constructor class Doctor.
	 * @param name имя профессионала
	 * @param qualification кфалификация профессионала
	 * @param specialization специализация профессионала
	 * @param experience опыт профессионала
	 * @param working название учреждения
     */
    public Doctor(String name, String qualification, String specialization, String experience, String working) {
        super(name, qualification, specialization, experience, working);
    }
    /**
     * Method healPeople.
     * @param people имя пациетна
     * @return значение
     */
    public String healPeople(People people) {
        return "Доктор " + this.getSpecialization() + " " + this.getName() + " лечит пациента " + people.getName();
    }
}