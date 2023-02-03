package com.bridgelabz.datastructure.day16_17assignment.algorithmprogram;

import java.util.ArrayList;

public class PrimeNumber {
    public static boolean checkPalindromeNumber(int primeNumber){
        int o = primeNumber;
        int temp;
        int reverse = 0;
        while (primeNumber != 0){
            temp = primeNumber % 10;
            reverse = (reverse * 10) + temp;
            primeNumber = primeNumber / 10;
        }
        if (reverse == o){
            return true;
        }
        return false;
    }
    public static void checkPrime(int range){
        ArrayList<Integer> primeNumber = new ArrayList<>();
        ArrayList<Integer> palindromeNumber = new ArrayList<>();
        int flag = 0;
        int[] arrayOfPrime = new int[range];
        for (int i = 2; i < range; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag++;
                    break;
                } else {
                    flag = 0;
                }
            }
            if (flag == 0) {
                //System.out.println(i + " ");
                primeNumber.add(i);
                //Checking Palindrome Number
                if (i > 10 && checkPalindromeNumber(i) == true) {
                    palindromeNumber.add(i);
                }
            }
        }
        System.out.println("prime Number: " + primeNumber);
        System.out.println("palindrome Number: " + palindromeNumber);
    }
    public static void main(String[] args) {
        System.out.println("The Prime Number from 1 to 1000");
        int range = 1000;
        checkPrime(range);
    }
}
