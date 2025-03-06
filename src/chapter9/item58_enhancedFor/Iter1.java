package chapter9.item58_enhancedFor;

import chapter9.PrintFormattedTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 우리에게 필요한건 원소
 * for 문 : 쓰이는 요소들이 많아지면 오류가 생길 가능성이 높아진다. 인덱스가 없는 컬렉션에서는 불가능
 * for-each : 반복자와 인덱스 변수를 사용하지 않아 코드가 깔끔해지고 오류가 날일도 없다.
 *
 * 하지만, 특정 인덱스 값을 변경하거나 연산이 필요하다면 for-each 는 적절하지 않다. 단순조회에서 강력!
 * 요소에 직접 접근할 수 있어서 성능도 좋다.
 *
 * for-each를 사용할 수 있는지 먼저 고민
 */

public class Iter1 {
    public static void main(String[] args) {
        badForLoop();
        goodForEachLoop();

    }

    public static void badForLoop() {
        List<Integer> list = new ArrayList<>();
//        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10_000_000; i++) {
            list.add(i);
        }

        long startTime = System.nanoTime();

        long sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        long endTime = System.nanoTime();
        PrintFormattedTime.printTime("Bad For Loop Execution Time: " , endTime - startTime);
        System.out.println("Final Sum: " + sum);
    }

    public static void goodForEachLoop() {
        List<Integer> list = new ArrayList<>();
//        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10_000_000; i++) {
            list.add(i);
        }

        long startTime = System.nanoTime();

        long sum = 0;
        for (int num : list) {
            sum += num;
        }

        long endTime = System.nanoTime();
        PrintFormattedTime.printTime("Good For-Each Loop Execution Time: " , endTime - startTime);
        System.out.println("Final Sum: " + sum);
    }

}
