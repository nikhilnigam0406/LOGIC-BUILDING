import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            int product = 1;

            while (n > 0) {
                int digit = n % 10;   // get last digit
                product *= digit;     // multiply
                n = n / 10;           // remove last digit
            }

            System.out.println("Product of digits = " + product);
        }
    }
}