package time.test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {

    public static void main(String[] args) {


        LocalDateTime dt = LocalDateTime.of(2024, 1, 1, 0, 0, 0);

        for (int i = 0; i < 5; i++)
        {
            // LocalDateTime after = dt.plusWeeks(2 * i);
            LocalDateTime after = dt.plus(2 * i, ChronoUnit.WEEKS);
            System.out.println("after = " + after);
        }

    }
}
