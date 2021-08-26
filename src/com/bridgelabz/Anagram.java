package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String first = scn.nextLine();
        System.out.println("Enter the last string: ");
        String last = scn.nextLine();
        int len1 = first.length();
        int len2 = last.length();

        // Comparison
        if (len1 == len2) {
            char[] first1 = first.toCharArray();
            Arrays.sort(first1);

            char[] last1 = last.toCharArray();
            Arrays.sort(last1);

            if (Arrays.equals(first1, last1)) {
                System.out.println("The two strings are Anagram.");
            } else {
                System.out.println("The two strings are not Anagram.");
            }
        } else {
            System.out.println("The two strings are not of same length");
        }
    }
}
