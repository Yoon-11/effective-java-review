package chapter9.item59_library;

import chapter9.PrintFormattedTime;

import java.util.Arrays;
import java.util.Random;

/** 아이템 59 : 라이브러리를 익히고 사용하라
 * 내가 구현하는 것보다 이미 나와있는 라이브러리가 최고다.
 */
public class Library {
    public static void main(String[] args) {
        badSorting();
        goodSorting();
    }

    public static void badSorting() {
        int[] arr = new Random().ints(10_000).toArray();

        long startTime = System.nanoTime();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        long endTime = System.nanoTime();
        PrintFormattedTime.printTime("Bad Sorting Execution Time: " ,endTime - startTime);
    }

    public static void goodSorting() {
        int[] arr = new Random().ints(10_000).toArray();

        long startTime = System.nanoTime();

        Arrays.sort(arr);

        long endTime = System.nanoTime();
        PrintFormattedTime.printTime("Good Sorting Execution Time: " ,endTime - startTime);
    }



}
