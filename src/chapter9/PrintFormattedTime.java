package chapter9;

import java.text.DecimalFormat;

public class PrintFormattedTime {
    public static void printTime(String label, long time) {
        DecimalFormat formatter = new DecimalFormat("#,###");
        System.out.println(label + ": " + formatter.format(time) + " ns");
    }
}
