package com.bridgelabz;

public class PrimeNumbers {
    public static void main(String[] args) {

        // the limit upto 1000 to print the prime numbers
        int limit = 1000;

        System.out.println("Printing prime numbers!");
        for (int num = 2; num <= limit; num++) {
            // print prime numbers only
            if (isPrimeNumber(num)) {
                System.out.println(num);
            }
        }

    }

    public static boolean isPrimeNumber(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false; // if number is divisible then its not a prime number
            }
        }
        return true; // if no divisible found then the number is prime number
    }

}

