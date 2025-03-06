package chapter9.Calculation;

/** 아이템 62 : 다른 타입이 적절하다면 문자열 사용을 피하라
 * 문자열은 열거 타입을 대신하기에 적합하지 않다. 열거 타입은 enum 사용
 * 혼합 타입을 대신하기에 적합하지 않다. (여러 요소가 혼합된 데이터를 하나의 문자열로 표현하는 것)
 */

public class StringUsage {
    public static void main(String[] args) {
        String age = "25";
        String height = "180";

        int realAge = Integer.parseInt(age);
        int realHeight = Integer.parseInt(height);

        System.out.println("나이 + 5년 후: " + (realAge + 5));
        System.out.println("키 + 10cm 후: " + (realHeight + 10));

        if (age == "25") { // 문자열 비교는 equals()로 해야함
            System.out.println("나이는 25살입니다.");
        } else {
            System.out.println("나이가 다릅니다."); // 예상치 못한 결과 발생 가능
        }

        int agee = 25;
        int heightt = 180;

        System.out.println("나이 + 5년 후: " + (agee + 5));
        System.out.println("키 + 10cm 후: " + (heightt + 10));

        if (agee == 25) {
            System.out.println("나이는 25살입니다.");
        } else {
            System.out.println("나이가 다릅니다.");
        }

        }


    }


