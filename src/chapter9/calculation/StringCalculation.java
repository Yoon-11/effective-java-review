package chapter9.calculation;

import chapter9.PrintFormattedTime;

/** 아이템 63 : 문자열 연결은 느리니 주의하라
 * 성능을 신경써야하고 많은 문자열을 연결할 때는 문자열 연결 연산자(+)를 피하자.
 * 그럴때는 StringBuilder의 append() 사용
 *
 */
public class StringCalculation {
    public static void main(String[] args) {
        badStringConcatenation();
        goodStringBuilder();
    }

    public static void badStringConcatenation() {
        long startTime = System.nanoTime();

        String str = "";
        for (int i = 0; i < 100_000; i++) {
            str += i; // 새로운 문자열이 매번 생성됨 (비효율적)
        }

        long endTime = System.nanoTime();
        PrintFormattedTime.printTime("Bad String Concatenation Execution Time: " ,endTime - startTime);
        System.out.println("Final String Length: " + str.length());
    }

    public static void goodStringBuilder() {
        long startTime = System.nanoTime();

        StringBuilder sb = new StringBuilder(6_000_000);
        for (int i = 0; i < 100_000; i++) {
            sb.append(i);
        }

        long endTime = System.nanoTime();
        PrintFormattedTime.printTime("Good StringBuilder Execution Time: " ,endTime - startTime);
        System.out.println("Final String Length: " + sb.length());
    }


}
