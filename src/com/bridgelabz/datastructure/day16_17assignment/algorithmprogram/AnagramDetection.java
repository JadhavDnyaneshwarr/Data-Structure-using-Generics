package com.bridgelabz.datastructure.day16_17assignment.algorithmprogram;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {

    public static boolean anagramDetection(String string1, String string2){
        if (string1.length() != string2.length()){
            return false;
        }
        else {
            char[] alphabetString1 = string1.toCharArray();
            char[] alphabetString2 = string2.toCharArray();
            Arrays.sort(alphabetString1);
            Arrays.sort(alphabetString2);
            for (int i = 0; i < alphabetString1.length; i++){
                if(alphabetString1[i] != alphabetString2[i]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any first word: ");
        String string1 = sc.next();
        System.out.println("enter any second word: ");
        String string2 = sc.next();
        System.out.println(anagramDetection(string1, string2));
    }
}
