package com.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] unsorted = {4, 5, 1, 0};
        int[] answerKey = {0, 1, 4, 5};
        int[] sorted = Main.quicksort(unsorted);
    }
    public static int[] quicksort(int[] arr)
    {
        return quicksort(arr, 0, arr.length - 1);
    }
    private static int[] quicksort(int[] arr, int l, int r)
    {
        if(r - l < 1)
        {
            return arr;
        }
        int pivot = arr[l];
        int lowestRightIndex = r;
        int highestLeftIndex = l;
        for(int i = l + 1; i <= lowestRightIndex; i++)
        {
            if(arr[i] > pivot)
            {
                int temp = arr[i];
                arr[i] = arr[lowestRightIndex];
                arr[lowestRightIndex] = temp;
                lowestRightIndex--;
                i--;
            }
            else if (arr[i] < pivot)
            {
                int temp = arr[i];
                arr[i] = arr[highestLeftIndex];
                arr[highestLeftIndex] = temp;
                highestLeftIndex++;
            }
        }
        arr = quicksort(arr, l, highestLeftIndex - 1);
        arr = quicksort(arr, lowestRightIndex + 1, r);
        return arr;
    }
}