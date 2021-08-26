package com.bridgelabz;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no. of string");
        int n = scn.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the array elements: ");
            arr[i] = scn.next();
        }
        //sorting the array in ascending order
        for (int j = 0; j < arr.length - 1; j++) {
            for (int k = 0; k < arr.length - j - 1; k++) {
                if (arr[k].compareTo(arr[k + 1]) > 0) {
                    String temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }
            }
        }
        // print the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

