package chapter4.item22;

/**
 *  아이템 22 : 인터페이스는 타입을 정의하는 용도로만 사용하라.
 */

/**
 * 아래의 경우는 상수를 인터페이스로 사용한 경우 -> Bad
 */
public class UseConstInterface implements Const{
    public static void main(String[] args) {
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        UseConstInterface u = new UseConstInterface();
        double result = u.addConst(100);
        System.out.println("result = " + result);
    }

    public double addConst(double x) {
        return x + C + D + F;
    }
}



