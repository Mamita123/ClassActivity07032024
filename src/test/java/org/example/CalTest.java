package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class CalTest extends TestCase {

    @Test
    public void testAdd() {
        double num1 = 10;
        double num2 = 20;
        double expectedResult = 30;

        double result = Cal.add(num1, num2);

        assertEquals(expectedResult, result);}






}

