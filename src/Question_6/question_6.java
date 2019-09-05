package Question_6;

import java.util.Scanner;
import java.util.Arrays;

public class question_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers of cells n: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of array " + i + ": ");
            a[i] = scanner.nextInt();
        }
        double sum = 0;
        for (double i = 2; i < n; i++) {
            if ((i % 2 == 0) || ((Math.sqrt(i)) % 1 == 0)||(i%5==0)) {
            } else {
                sum = sum + a[(int) i];
            }
        }
        System.out.println(sum + a[2] + a[5]); // сумма чисел, порядковые номера которых - простые числа.
    }
}


