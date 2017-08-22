package ru.job4j.control;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 * Тест метода contains класса VerifyingWords
 * @author Pavel Ivanov (mailto:pavel.ivanov060988@gmail.com)
 * @version 1.0
 * @since 22.08.2017
 */
public class VerifyingWordsTest {
    /**
     * @method проверка когда слово находится в слове.
     */
    @Test
    public void whenwordIsInTheWordThenTrue() {
        String origin = "Привет";
        String sub = "иве";
        boolean expect = true;
        VerifyingWords virifying = new VerifyingWords();
        assertThat(virifying.contains(origin, sub), is(expect));
    }
    /**
     * @method проверка когда слово НЕ находится в слове.
     */
    @Test
    public void whenNoWordInWordThenFalse() {
        String origin = "Привет";
        String sub = "абг";
        boolean expect = false;
        VerifyingWords virifying = new VerifyingWords();
        assertThat(virifying.contains(origin, sub), is(expect));
    }
    /**
     * @method проверка когда слово частично находится в слове.
     */
    @Test
    public void whenWordsPartiallyInTheWordThenFalse() {
        String origin = "Привет";
        String sub = "иту";
        boolean expect = false;
        VerifyingWords virifying = new VerifyingWords();
        assertThat(virifying.contains(origin, sub), is(expect));
    }
}