import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();

            int sum = 0;

            for (int i = 1; i <= n; i += 2) {
                sum += i;
            }

            System.out.println("Sum of odd numbers = " + sum);
        }
    }
}