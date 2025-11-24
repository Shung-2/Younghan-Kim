package lang.string.test;

public class TestString11 {

    public static void main(String[] args) {

        String str = "Hello Java";

        // revser()를 통해 str 문자열을 반대로 뒤집어라
        String sb = new StringBuilder(str).reverse().toString();
        System.out.println("sb : " + sb);
    }
}
