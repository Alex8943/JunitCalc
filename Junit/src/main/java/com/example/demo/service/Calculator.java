package com.example.demo.service;

public class Calculator {

    //Add 2 numbers
    public int add(int x, int y){
        return x+y;
    }

    public boolean isPrime(int num){
        boolean status = false;
        for (int i = 2; i <= num; i++) {
            if (num%i == 0 && num > i){
                return status;
            } else if (i == num){

                return status = true;
            }
        }
        return status;
    }
}
