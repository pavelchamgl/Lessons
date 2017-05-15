package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Pavel Ivanov (mailto:pavel.ivanov060988@gmail.com)
* @version $Id$
* @since 15.05.2017
*/
public class CalculateTest {
/**
* Test add.
*/
@Test
public void whenAddOneToOneThenTwo() {
ByteArrayOutputStream out = new ByteArrayOutputStream();
System.setOut(new PrintStream(out));
Calculate.main(null);
assertThat(
out.toString(),
is(
String.format(
"Hello World%s",
System.getProperty("line.separator")
)
)
);
}
}