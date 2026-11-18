import java.util.Scanner;

public class SumEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();
            if (number % 2 == 0) {
                total = total + number;
            }
        }

        System.out.println("Sum of even indexes: " + total);
    }
}
