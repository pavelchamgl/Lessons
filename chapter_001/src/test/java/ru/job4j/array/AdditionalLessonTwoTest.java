package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 * Тест метода combineArrays класса AdditionalLessonTwo
 * @author Pavel Ivanov (mailto:pavel.ivanov060988@gmail.com)
 * @version 1.0
 * @since 21.08.2017
 */

public class AdditionalLessonTwoTest {
    /**
     * @method проверки объдинения двух массивов {1, 2, 4, 6, 8, 11} и {0, 3, 5}
     * отсортированых по возрастанию.
     */
    @Test
    public void whenSortArrayNotSortedThenTrue() {
        int[] arrayOne = {1, 2, 4, 6, 8, 11};
        int[] arrayTwo = {0, 3, 5};
        int[] expect = {0, 1, 2, 3, 4, 5, 6, 8, 11};
        AdditionalLessonTwo additionalLesson = new AdditionalLessonTwo(arrayOne, arrayTwo);
        assertThat(additionalLesson.combineArrays(), is(expect));
    }
}