package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class isSupportedMain2 {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        boolean supported = now.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println("supported : " + supported);
        if (supported) {
            int minite = now.get(ChronoField.SECOND_OF_MINUTE);
            System.out.println(minite);
        }
        // int minute = now.get(ChronoUnit.SECONDS);
        // System.out.println(minute);

    }
}
