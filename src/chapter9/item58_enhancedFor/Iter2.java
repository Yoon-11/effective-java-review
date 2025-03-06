package chapter9.item58_enhancedFor;

import chapter9.PrintFormattedTime;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iter2 {
    public static void main(String[] args) {
        badIteratorLoop();
        goodForEachLoop();
    }

    public static void badIteratorLoop() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            numbers.add(i);
        }

        long startTime = System.nanoTime();

        long sum = 0;
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
        }

        long endTime = System.nanoTime();
        PrintFormattedTime.printTime("Bad Iterator Loop Execution Time: " ,endTime - startTime);
        System.out.println("Final Sum: " + sum);
    }

    public static void goodForEachLoop() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            numbers.add(i);
        }

        long startTime = System.nanoTime();

        long sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        long endTime = System.nanoTime();
        PrintFormattedTime.printTime("Good For-Each Loop Execution Time: " ,endTime - startTime);
        System.out.println("Final Sum: " + sum);
    }


}
