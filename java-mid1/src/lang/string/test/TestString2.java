package lang.string.test;

public class TestString2 {

    public static void main(String[] args) {

        String[] arr = {"Hello", "java", "jvm", "spring", "jpa"};
        int result = 0;

        // length()를 사용해서 arr 배열에 들어있는 모든 문자열의 길이 합을 구하기
        for (String s : arr) {
            System.out.println("arr[i] : " + s.length());
            result += s.length();
        }
        System.out.println("result : " + result);
    }
}
