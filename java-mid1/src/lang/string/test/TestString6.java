package lang.string.test;

public class TestString6 {

    public static void main(String[] args) {

        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        // str에서 key로 주어지는 문자를 찾고, 찾은 문자의 수를 출력해라.
        // indexOf()를 반복문과 함께 사용할 것.
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == key.charAt(0)) {
                int index = str.indexOf(key, i);
                if (index != -1) {
                    System.out.println("index : " + index);
                }
            }
        }
    }
}
