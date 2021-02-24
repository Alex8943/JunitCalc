package com.example.demo.service;

import java.util.ArrayList;

public class Calculator {

    //Add 2 numbers
    public int add(int x, int y) {
        return x + y;
    }


    public ArrayList<Integer> primeFactorization(int num) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int n = 2; n < num; n++) {
            boolean status = true;
            int i = 2;
            while (i <= n / 2) {
                if (n % i == 0) {
                    status = false;
                    break;
                }
                i++;
            }
            if (status) {
                arrayList.add(n);
            }
        }
        return arrayList;
    }

    public boolean isPrime(int num) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        boolean status = true;
        int i = 2;
        while (i <= num / 2) {
            if (num % i == 0) {
                status = false;
                break;
            }
            i++;
        }
        if (status) {
            arrayList.add(num);
        }
        return status;
    }
}/*
        return arrayList;
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
    */
