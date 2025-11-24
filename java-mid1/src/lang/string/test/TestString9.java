package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {

        String email = "hello@example.com";

        // split을 통해 이메일의 ID 부분과 도메인 부분을 분리해라
        String[] split = email.split("@");
        System.out.println("id : " + split[0]);
        System.out.println("domain : " + split[1]);
    }
}
