import java.util.*;

public class BerkeleyAlgorithm {

    public static void main(String[] args) {

        int[] clocks = {10, 12, 13, 11, 14};

        int master = clocks[0];

        System.out.println("Initial Clock Times:");

        for (int i = 0; i < clocks.length; i++) {
            System.out.println("Clock " + i + ": " + clocks[i]);
        }

        // Calculate differences from master clock
        int sum = 0;

        for (int clock : clocks) {
            sum += clock;
        }

        int average = sum / clocks.length;

        System.out.println("\nAverage Time: " + average);

        // Calculate adjustments
        System.out.println("\nAdjustments:");

        for (int i = 0; i < clocks.length; i++) {

            int adjustment = average - clocks[i];

            System.out.println(
                "Clock " + i + " adjustment: " + adjustment
            );

            clocks[i] += adjustment;
        }

        // Final synchronized clocks
        System.out.println("\nSynchronized Clocks:");

        for (int i = 0; i < clocks.length; i++) {
            System.out.println("Clock " + i + ": " + clocks[i]);
        }
    }
}
