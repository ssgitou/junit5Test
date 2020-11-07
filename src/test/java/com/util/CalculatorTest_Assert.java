package com.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
* 1、增加断言
*
* */

class CalculatorTest_Assert {
    @Test
    void addtest(){
        int addtest = Calculator.add(4,2);
        System.out.println("addtest = " + addtest);
        assertEquals(6,addtest);
    }

    @Test
    void subtracttest(){
        int subtracttest = Calculator.subtract(4,2);
        System.out.println("subtracttest = " + subtracttest);
        assertEquals(2,subtracttest);
    }
    @Test
    void multiplytest(){
        int multiplytest = Calculator.multiply(4,2);
        System.out.println("multiplytest = " + multiplytest);
        assertEquals(8,multiplytest);

    }
    @Test
    void dividetest(){
        int dividetest = Calculator.divide(4,2);
        System.out.println("dividetest = " + dividetest);
        assertEquals(2,dividetest);
    }
    @Test
    void counttest() throws InterruptedException {
        int counttest = Calculator.count(1);
        counttest = Calculator.count(1);
        counttest = Calculator.count(2);
        System.out.println("counttest = " + counttest);

    }


}