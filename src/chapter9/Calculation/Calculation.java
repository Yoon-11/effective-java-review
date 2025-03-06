package chapter9.Calculation;

import chapter9.PrintFormattedTime;

import java.math.BigDecimal;

/** 아이템 60 : 정확한 답이 필요하다면 float과 double은 피하라
 * float, double 타입은 넓은 범위의 수를 빠르고 정밀하고 '근사치'로 계산, 따라서 금융 관련 계산 x
 * 금융 계산에서는 BigDecimal, int, long 사용
 *
 * BigDecimal 성능은 느리지만 더 정확함
 *
 * 성능 중요, 숫자가 너무 크지 않다면 int or long 사용
 */

public class Calculation {
    public static void main(String[] args) {
        badDoubleCalculation();
        goodBigDecimalCalculation();
    }

    // double 타입으로 계산
    public static void badDoubleCalculation() {
        long startTime = System.nanoTime();

        double result = 0.0;
        for (int i = 0; i < 1_000_000; i++) {
            result += 0.1;
        }
        System.out.println("result = " + result);

        long endTime = System.nanoTime();
        PrintFormattedTime.printTime("Bad Double Calculation Execution Time: " ,endTime - startTime);
    }


    // BigDecimal로 계산
    public static void goodBigDecimalCalculation() {
        long startTime = System.nanoTime();

        BigDecimal result = BigDecimal.ZERO;
        for (int i = 0; i < 1_000_000; i++) {
            result = result.add(BigDecimal.valueOf(0.1));
        }
        System.out.println("result = " + result);

        long endTime = System.nanoTime();
        PrintFormattedTime.printTime("Good BigDecimal Calculation Execution Time: " ,endTime - startTime);
    }

}
