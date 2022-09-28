package UnitTests;

import static org.junit.Assert.*;

public class NumbersTest {

    @org.junit.Test
    public void sum() {
        Numbers numbers = new Numbers();
        int actual = numbers.sum(5);
        int expected = 20;
        assertEquals(expected, actual);
    }
}