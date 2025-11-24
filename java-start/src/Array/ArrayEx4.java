package Array;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int sum = 0;

        System.out.println("5개의 정수를 입력하세요:");
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
