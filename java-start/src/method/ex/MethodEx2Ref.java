package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {

        String message = "Hello, world!";

        printMessage(message, 3);
        printMessage(message, 5);
        printMessage(message, 7);
    }

    public static void printMessage(String message, int loop)
    {
        for (int i = 0; i < loop; i++)
        {
            System.out.println(message);
        }
    }
}
