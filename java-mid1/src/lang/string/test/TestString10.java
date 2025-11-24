package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {

        String fruits = "apple,banana,mango";

        // split()을 사용하여 fruits를 분리하고,
        // join()을 사용해서 분리한 문자들을 하나로 합쳐라.
        String result = String.join("→", fruits.split(","));
        System.out.println("result : " + result);
    }
}
