package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {

    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        System.out.println("Year = " + dt.get(ChronoField.YEAR));
        System.out.println("MOY = " + dt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("DOM = " + dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println("HOD = " + dt.get(ChronoField.HOUR_OF_DAY));
        System.out.println("MOH = " + dt.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("SEC = " + dt.get(ChronoField.SECOND_OF_MINUTE));

        // 편의 메서드 제공
        System.out.println("Year = " + dt.getYear());
        System.out.println("MOY = " + dt.getMonthValue());
        System.out.println("DOM = " + dt.getDayOfMonth());
        System.out.println("HOD = " + dt.getHour());
        System.out.println("MOH = " + dt.getMinute());
        System.out.println("SEC = " + dt.getSecond());

        // 편의 메서드 없음
        System.out.println("MOD = " + dt.get(ChronoField.MINUTE_OF_DAY));
        System.out.println("MOD = " + dt.get(ChronoField.SECOND_OF_DAY));
    }
}
