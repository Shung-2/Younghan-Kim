package lang.string.test;

public class TestString5 {

    public static void main(String[] args) {

        String str = "hello.txt";
        String ext = ".txt";

        // indexOf와 substring을 통해 파일명과 확장자를 분리해서 출력하라
        int index = str.indexOf(ext);
        String front = str.substring(0, index);
        String back = str.substring(index);
        System.out.println("front : " + front);
        System.out.println("back : " + back);
    }
}
