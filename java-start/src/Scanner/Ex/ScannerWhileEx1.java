package Scanner.Ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true)
        {
            System.out.print("이름을 입력하세요. ('종료'를 입력하면 종료됩니다.) : ");
            String name = input.nextLine();

            if (name.equals("종료"))
            {
                break;
            }

            System.out.print("나이를 입력하세요. : ");
            int age = input.nextInt();
            input.nextLine();

            System.out.println("입력한 이름 : " + name + ", 나이 : " + age);
        }
    }
}
