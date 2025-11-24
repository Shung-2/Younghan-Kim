package Array;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0, num = 0;

        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        num = scanner.nextInt();

        int[] array = new int[num];

        System.out.println(num + "개의 정수를 입력하세요:");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        double avg = (double)sum / array.length;
        System.out.println("점수 총합 : " + sum);
        System.out.println("점수 평균 : " + avg);
    }
}
