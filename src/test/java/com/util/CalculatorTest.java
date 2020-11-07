package com.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void addtest(){
        int addtest = Calculator.add(1,1);
        System.out.println("addtest = " + addtest);
    }

    @Test
    void subtracttest(){
        int subtracttest = Calculator.subtract(1,1);
        System.out.println("subtracttest = " + subtracttest);
    }
    @Test
    void multiplytest(){
        int multiplytest = Calculator.multiply(1,1);
        System.out.println("multiplytest = " + multiplytest);
    }
    @Test
    void dividetest(){
        int dividetest = Calculator.divide(1,1);
        System.out.println("dividetest = " + dividetest);
    }
    @Test
    void counttest() throws InterruptedException {
        int counttest = Calculator.count(1);
        counttest = Calculator.count(1);
        counttest = Calculator.count(2);
        System.out.println("counttest = " + counttest);

    }


}