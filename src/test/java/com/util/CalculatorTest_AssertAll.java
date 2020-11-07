package com.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


/**
* 1、增加断言
*2、使用junit5的addertAll断言，增加脚本的容错性
* */

class CalculatorTest_AssertAll {
    @Test
    void addtest(){
        int addtest01 = Calculator.add(4,2);
        int addtest02 = Calculator.add(5,2);
        int addtest03 = Calculator.add(6,2);
        assertAll("计算结果",
                ()-> assertEquals(6,addtest01),
                ()-> assertEquals(6,addtest02),
                ()-> assertEquals(6,addtest03)
        );

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