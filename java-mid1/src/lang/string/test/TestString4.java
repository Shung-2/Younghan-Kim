package lang.string.test;

public class TestString4 {

    public static void main(String[] args) {

        String str = "hello.txt";

        // substring()을 사용하여 hello 부분과 .txt 부분을 분리해라
        String back = str.substring(5);
        String front = str.substring(0, 5);

        System.out.println("front : " + front);
        System.out.println("back : " + back);
    }
}
