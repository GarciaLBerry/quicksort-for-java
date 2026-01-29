package com.example;

import org.apache.poi.ss.formula.functions.DMin;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class QuickSortTest {
    @Test
    @DisplayName("Test Quicksort1")
    public void quicksortTest1()
    {
        int[] unsorted = {4, 5, 1, 0, 6, 3, 2, 1};
        int[] answerKey = {0, 1, 1, 2, 3, 4, 5, 6};
        int[] sorted = Main.quicksort(unsorted);
        System.out.println(Arrays.toString(sorted));
        assertTrue(sorted.length == answerKey.length);
        assertArrayEquals(answerKey, sorted);
    }
    @Test
    @DisplayName("Test Quicksort2")
    public void quicksortTest2()
    {
        int[] unsorted = {0};
        int[] answerKey = {0};
        int[] sorted = Main.quicksort(unsorted);
        System.out.println(Arrays.toString(sorted));
        assertTrue(sorted.length == answerKey.length);
        assertArrayEquals(answerKey, sorted);
    }
    @Test
    @DisplayName("Test Quicksort3")
    public void quicksortTest3()
    {
        int[] unsorted = {0, 1, 2, 3, 4};
        int[] answerKey = {0, 1, 2, 3, 4};
        int[] sorted = Main.quicksort(unsorted);
        System.out.println(Arrays.toString(sorted));
        assertTrue(sorted.length == answerKey.length);
        assertArrayEquals(answerKey, sorted);
    }
}
