package com.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class QuickSortTest {
    @Test
    @DisplayName("Test Quicksort1")
    public void quicksortTest1()
    {
        Random rand = new Random();
        int[] unsorted = {4, 5, 1, 0, 6, 3, 2, 1};
        int[] answerKey = {0, 1, 1, 2, 3, 4, 5, 6};
        int[] sorted = Main.quicksort(unsorted, rand);
        System.out.println(Arrays.toString(sorted));
        assertTrue(sorted.length == answerKey.length);
        assertArrayEquals(answerKey, sorted);
    }
    @Test
    @DisplayName("Test Quicksort2")
    public void quicksortTest2()
    {
        Random rand = new Random();
        int[] unsorted = {0};
        int[] answerKey = {0};
        int[] sorted = Main.quicksort(unsorted, rand);
        System.out.println(Arrays.toString(sorted));
        assertTrue(sorted.length == answerKey.length);
        assertArrayEquals(answerKey, sorted);
    }
    @Test
    @DisplayName("Test Quicksort3")
    public void quicksortTest3()
    {
        Random rand = new Random();
        int[] unsorted = {0, 1, 2, 3, 4};
        int[] answerKey = {0, 1, 2, 3, 4};
        int[] sorted = Main.quicksort(unsorted, rand);
        System.out.println(Arrays.toString(sorted));
        assertTrue(sorted.length == answerKey.length);
        assertArrayEquals(answerKey, sorted);
    }
    @Test
    @DisplayName("Large + Random Test")
    public void quicksortTest4()
    {
        Random rand = new Random();
        for(int run = 0; run < 10000; run++) {
            int[] unsorted = new int[10000];
            for(int i = 0; i < unsorted.length; i++) {
                unsorted[i] = rand.nextInt(0, 10000);
            }
            int[] sorted = Main.quicksort(unsorted, rand);
            System.out.println(Arrays.toString(sorted));
            int last = -1;
            for(int i = 0; i < sorted.length; i++) {
                assertTrue(sorted[i] >= last);
                last = sorted[i];
            }
        }
    }
}
