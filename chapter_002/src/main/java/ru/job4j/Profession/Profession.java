package ru.job4j.profession;
/**
 * class Profession.
 *
 * @author Pavel Ivanov (pavel.ivanov.060988@gmail.com)
 * @version 1
 * @since 17.10.2017
 */
public class Profession {
	/**
	 * Profession.
	 * @param name хранит имя человека
	 */
	 private String name;
	/**
	 * @param qualification хранит кфалификацию профессионала
	 */
	 private String qualification;
	/**
	 * @param specialization хранит специализацию профессионала
	 */
	 private String specialization;
	/**
	 * @param experience хранит опыт человека в данной профессии
	 */
	 private String experience;
	/**
	 * @param working хранит в каком учереждении работает профессионал
	 */
	 private String working;
	/**
	 * @method Метод записи данных в поля класса People.
	 * @param name имя профессионала
	 * @param qualification кфалификация профессионала
	 * @param specialization специализация профессионала
	 * @param experience опыт профессионала
	 * @param working название учреждения
	 */
	 public Profession(String name, String qualification, String specialization, String experience, String working) {
		 this.name = name;
		 this.qualification = qualification;
		 this.specialization = specialization;
		 this.experience = experience;
		 this.working = working;
	}
	/**
	 * @method возвращает name.
	 * @param name
	 * @return значение
	 */
	 public String getName() {
		return name;
	}
	/**
	 * @method возвращает name.
	 * @param qualification
	 * @return значение
	 */
	 public String getQualification() {
		return qualification;
	}
	/**
	 * @method возвращает name.
	 * @param specialization
	 * @return значение
	 */
	 public String getSpecialization() {
		return specialization;
	}
	/**
	 * @method возвращает name.
	 * @param experience
	 * @return значение
	 */
	 public String getExperience() {
		return experience;
	}
	/**
	 * @method возвращает name.
	 * @param working
	 * @return значение
	 */
	 public String getWorking() {
		return working;
	}
}