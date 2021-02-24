package com.example.demo;

import com.example.demo.service.Calculator;

public class Lommeregner {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        //System.out.println(cal.add(17, 25)); // 42
        //System.out.println(cal.add(2, 2)); // 4
        System.out.println(cal.isPrime(10));

        System.out.println(cal.primeFactorization(10));
    }
}
