package Array;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         int[][] students = new int[4][3];
         String[] subjects = new String[] {"국어", "영어", "수학"};
         int[] sums = new int[4];

         for (int i = 0; i < students.length; i++)
         {
             System.out.println(i + 1 + "번 학생의 성적을 입력하세요.");
             for (int j = 0; j < subjects.length; j++)
             {
                 System.out.print(subjects[j] + " 점수 : " );
                 students[i][j] = scanner.nextInt();
                 sums[i] += students[i][j];
             }
         }

         for (int i = 0; i < students.length; i++)
         {
             System.out.println(i + 1 + "번 학생의 총점 : " + sums[i] + ", 평균 : " + (double)sums[i] / subjects.length);
         }
    }
}
