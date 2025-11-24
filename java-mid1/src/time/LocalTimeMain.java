package time;

import java.time.LocalTime;

public class LocalTimeMain {

    public static void main(String[] args) {


        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(12, 30, 10);

        System.out.println("현재 시간 : " + nowTime);
        System.out.println("지정 시간 : " + ofTime);

        LocalTime ofTimeP = ofTime.plusSeconds(10);
        System.out.println("지정 시간 + 10sec : " + ofTimeP);
    }
}
