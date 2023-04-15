import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read in the value of n from the user
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        // Compute the sum of all integers from 1 to n
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // Output the result
        System.out.println("The sum of all integers from 1 to " + n + " is " + sum + ".");
    }
}
