package Scanner.Ex;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true)
        {
            System.out.print("상품의 가격을 입력하세요. (-1을 입력하면 종료됩니다.) : ");
            int price = input.nextInt();

            if (price == -1)
            {
                break;
            }

            System.out.print("구매하려는 수량을 입력하세요. : ");
            int quantitiy = input.nextInt();

            System.out.println("총 비용 : " + price * quantitiy);
        }
    }
}
