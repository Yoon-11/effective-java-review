package chapter9.item57_localVariable;

import chapter9.PrintFormattedTime;

/**
 * 지역변수의 범위를 가장 강력한 기법은 '가장 처음 쓰일때 선언하기'
 * 먼 부분에서 미리 선언부터 해두면 가독성 떨어지고, 정작 사용하는 시점엔 초깃값이 기억나지 않을 수도 있음
 *
 * 거의 모든 지역변수는 선언과 동시에 초기화
 * 메서드를 작게 유지하고 한가지 기능에 집중시켜 지역변수 범위 최소화
 */

public class LocalVariable {
    public static void main(String[] args) {
        BadExample.badScope();
        GoodExample.goodScope();
    }
}

class BadExample {
    static int sum = 0;

    /*



     */
    public static void badScope() {
        long startTime = System.nanoTime();

        for (int i = 0; i < 10_000_000; i++) {
            sum += i;
        }

        long endTime = System.nanoTime();
        PrintFormattedTime.printTime("Bad Scope Execution Time: " , endTime - startTime);
    }
}

class GoodExample {
    public static void goodScope() {
        long startTime = System.nanoTime();

        int sum = 0;
        for (int i = 0; i < 10_000_000; i++) {
            sum += i;
        }

        long endTime = System.nanoTime();
        PrintFormattedTime.printTime("Good Scope Execution Time: " , endTime - startTime);
    }

}


