package ru.job4j.profession;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * Class Profession test
 * @author Pavel Ivanov (mailto:pavel.ivanov060988@gmail.com)
 * @version 1.0
 * @since 20.08.2017
 */
public class ProfessionTest {
    /**
     * Тестовый метод класса Teacher.
     */
    @Test
    public void thenTeacherToEducateStudent() {
        Teacher teacher = new Teacher("Андрей", "Точные науки", "математик", "10 лет", "МГУ");
        String result = teacher.toEducate(new People("Ваня"));
        String expect = "Учитель математик Андрей учит студента Ваня";
        assertThat(result, is(expect));
    }

    /**
     * Тестовый метод класса Engineer.
     */
    @Test
    public void thenEngineerDecisionTaskDevice() {
        Engineer engineer = new Engineer("Петр", "инжинер", "разработчик ПО", "11 лет", "job4j");
        String result = engineer.decisionTask(new People("Коли"));
        String expect = "Инженер разработчик ПО Петр решил бизнес задачу Коли и создал мобильное приложение";
        assertThat(result, is(expect));
    }

    /**
     * Тестовый метод класса Doctor.
     */
    @Test
    public void tnetDoctorHealPeople() {
        Doctor doctor = new Doctor("Павел", "врач", "терапевт", "5 лет", "МЦБ");
        String result = doctor.healPeople(new People("Ольга"));
        String expect = "Доктор терапевт Павел лечит пациента Ольга";
        assertThat(result, is(expect));
    }
}