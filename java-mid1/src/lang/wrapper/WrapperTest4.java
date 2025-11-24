package lang.wrapper;

public class WrapperTest4 {

    public static void main(String[] args) {

        String str = "100";

        // String str을 Integer로 변환해서 출력해라
        // Integer를 int로 변환해서 출력해라.
        // int를 Integer로 변환해서 출력해라.
        // 오토 박싱, 언박싱을 사용해서 풀어야 한다.
        Integer i1 = Integer.valueOf(str);
        int i2 = i1;
        Integer i3 = i2;
        System.out.println("i1 : " + i1);
        System.out.println("i2 : " + i2);
        System.out.println("i3 : " + i3);
    }
}
