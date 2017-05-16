package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Pavel Ivanov (mailto:pavel.ivanov060988@gmail.com)
* @version $Id$
* @since 15.05.2017
*/
public class CalculatorTest {
/**
* Test add.
*/
@Test
public void whenAddTenPlusTwoThenTwelve() {
        Calculator calc = new Calculator();
        calc.add(10, 2);
        double result = calc.getResult();
        double expected = 12;
        assertThat(result, is(expected));
    }

/**
* Test substruct.
*/
@Test
public void whenAddTenSubstructTwoThenEight() {
        Calculator calc = new Calculator();
        calc.substruct(10, 2);
        double result = calc.getResult();
        double expected = 8;
        assertThat(result, is(expected));
    }

/**
* Test div.
*/
@Test
public void whenAddTenDivTwoThenFive() {
        Calculator calc = new Calculator();
        calc.div(10, 2);
        double result = calc.getResult();
        double expected = 5;
        assertThat(result, is(expected));
    }

/**
* Test multiple.
*/
@Test
public void whenAddTenMultipleTwoThenTwenty() {
        Calculator calc = new Calculator();
        calc.multiple(10, 2);
        double result = calc.getResult();
        double expected = 20;
        assertThat(result, is(expected));
    }
}