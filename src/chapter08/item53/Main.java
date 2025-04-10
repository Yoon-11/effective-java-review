package chapter08.item53;

public class Main {
    static int min1(int firstArg, int... remainingArgs) {
        int min = firstArg;
        for (int arg : remainingArgs)
            if (arg < min)
                min = arg;
        return min;
    }

    // 잘못된 예 (인수 없이도 호출 가능 → 런타임 에러)
    static int min2(int... args) {
        if (args.length == 0)
            throw new IllegalArgumentException("인수가 1개 이상 필요합니다.");
        int min = args[0];
        for (int i = 1; i < args.length; i++)
            if (args[i] < min)
                min = args[i];
        return min;
    }


    public static void main(String[] args) {
//        min1();   // 컴파일 오류
        System.out.println("min1(1,2) = " + min1(1, 2));

        System.out.println(min2()); // 런타임 오류
        System.out.println(min2(3, 4, 5));

    }
}
