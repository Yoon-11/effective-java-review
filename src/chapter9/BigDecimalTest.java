package chapter9;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {
        public static void main(String[] args) {
            // BigDecimal 값 생성
            BigDecimal numerator = new BigDecimal("3");  // 분자
            BigDecimal denominator = new BigDecimal("10");  // 분모

            // 나눗셈 수행 (소수점 10자리까지 유지, 반올림 모드는 HALF_UP)
            BigDecimal result = numerator.divide(denominator, 5, RoundingMode.HALF_UP);

            // 출력
            System.out.println("Result: " + result);

        }
    }
