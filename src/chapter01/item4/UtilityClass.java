package chapter01.item4;

public class UtilityClass {
    private UtilityClass() {
        throw new AssertionError(); // 실수로 내부에서 호출 방지
    }

    public static int add(int a, int b) {

        return a + b;
    }

    public UtilityClass testMethod() {
       return new UtilityClass();
    }


    public static void main(String[] args) {
        UtilityClass utilityClass = new UtilityClass();
        System.out.println("utilityClass.testMethod().getClass() = " + utilityClass.testMethod().getClass());
    }
}
