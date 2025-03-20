package chapter09.item61_primitiveAndWrapper;

import chapter09.PrintFormattedTime;

/** 아이템 61 : 박싱된 기본 타입보다는 기본 타입을 사용하라
 * 기본 타입과 래퍼 클래스 중에 하나를 선택해야 한다면 가능하면 기본 타입 선택
 * 래퍼 클래스에서 == 연산자로 비교한다면 식별성 비교가 이뤄지는데, 의도한 결과가 아닐 가능성이 크다.
 *
 * 꼭 필요할때만 래퍼 클래스를 쓰자
 */
public class Type {
    public static void main(String[] args) {
        primitive();
        boxed();
    }

    public static void primitive() {
        long startTime, endTime;

        startTime = System.nanoTime();

        long sum1 = 0;
        for (int i = 0; i < 100_000_000; i++) {
            sum1 += i;
        }
        endTime = System.nanoTime();
        PrintFormattedTime.printTime("Primitive Type Execution Time", endTime - startTime);

    }

    public static void boxed() {
        long startTime, endTime;

        startTime = System.nanoTime();

        Long sum2 = 0L;
        for (int i = 0; i < 100_000_000; i++) {
            sum2 += i;
        }
        endTime = System.nanoTime();
        PrintFormattedTime.printTime("Primitive Type Execution Time", endTime - startTime);

    }

}

