package com.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] unsorted = {4, 5, 1, 0};
        int[] answerKey = {0, 1, 4, 5};
        Random rand = new Random();
        int[] sorted = Main.quicksort(unsorted, rand);
    }
    public static int[] quicksort(int[] arr, Random rand)
    {
        return quicksort(arr, 0, arr.length - 1, rand);
    }
    private static int[] quicksort(int[] arr, int l, int r, Random rand)
    {
        if(r - l < 1)
        {
            return arr;
        }
        int pivot = arr[rand.nextInt(l, r)];
        int lowestRightIndex = r;
        int highestLeftIndex = l;
        for(int i = l; i <= lowestRightIndex; i++)
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
        arr = quicksort(arr, l, highestLeftIndex - 1, rand);
        arr = quicksort(arr, lowestRightIndex + 1, r, rand);
        return arr;
    }
}