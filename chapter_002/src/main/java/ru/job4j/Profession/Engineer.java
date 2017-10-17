package ru.job4j.profession;
/**
 * Class Engineer.
 *
 * @author Pavel Ivanov (pavel.ivanov.060988@gmail.com)
 * @version 1
 * @since 17.10.2017
 */
public class Engineer extends Profession {
    /**
     * Constructor class Engineer.
	 * @param name имя профессионала
	 * @param qualification кфалификация профессионала
	 * @param specialization специализация профессионала
	 * @param experience опыт профессионала
	 * @param working название учреждения
     */
    public Engineer(String name, String qualification, String specialization, String experience, String working) {
        super(name, qualification, specialization, experience, working);
    }
    /**
     * Method decisionTask.
     * @param people имя заказчика
     * @return значение
     */
    public String decisionTask(People people) {
        return "Инженер " + this.getSpecialization() + " " + this.getName() + " решил бизнес задачу " + people.getName() + " и создал мобильное приложение";
    }
}