import java.util.Scanner;

public class EvenScoresSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        for (int counter = 1; counter <= 10; counter++) {
            System.out.print("Enter score " + counter + ": ");
            int score = input.nextInt();
            if (score % 2 == 0) {
                total = total + score;
            }
        }

        System.out.println("Sum of even scores: " + total);
    }
}
