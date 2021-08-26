package com.bridgelabz;

public class InsertionSort {
    public void insertionSort(int arr[]) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            int item = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > item) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = item;
        }
    }


    // Method for printing insertion array
    static void printArray(int arr[]) {
        int length = arr.length;
        for (int i = 0; i < length; i++)
            System.out.println(arr[i] + "");
    }

    public static void main(String args[]) {
        int arr[] = {65, 34, 23, 51, 16};
        System.out.println("Arry After Sorting:");
        InsertionSort inssort = new InsertionSort();
        // calling sort method
        inssort.insertionSort(arr);
        // Calling printArray method
        printArray(arr);
    }
}