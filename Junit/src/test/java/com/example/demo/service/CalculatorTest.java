package com.example.demo.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator c;
    @BeforeEach
    void setUp() {
        //Arange
        //Initialiser calculator
        c = new Calculator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
        //Act
        int result = c.add(2,2);
        //Assert
        assertEquals(4, result);

    }

    @Test
    void  add2(){
        //Act
        int result = c.add(17,25);

        //Assert
        assertEquals(42, result);
    }


    @Test
    void isPrimeTest() {
        boolean result = c.isPrime(113);

        assertEquals(false, result);
    }
}