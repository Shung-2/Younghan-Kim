package Array;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int min = 0;
        int max = 0;

        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        num = scanner.nextInt();
        int[] array = new int[num];

        System.out.println(num + "개의 정수를 입력하세요:");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = scanner.nextInt();
        }

        min = max = array[0];

        for (int i = 0; i < array.length; i++)
        {
            if (min < array[i])
            {

            }
            else
            {
                min = array[i];
            }
        }

        for (int i = 0; i < array.length; i++)
        {
            if (max < array[i])
            {
                max = array[i];
            }
        }

        System.out.println("가장 작은 정수 : " + min);
        System.out.println("가장 큰 정수 : " + max);
    }
}
