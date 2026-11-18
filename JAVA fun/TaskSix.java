import java.util.Scanner;

public class EvenScoresAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int count = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter score " + i + ": ");
            int score = input.nextInt();
            if (score % 2 == 0) {
                total = total + score;
                count = count + 1;
            }
        }

        if (count > 0) {
            double average = (double) total / count;
            System.out.println("Average of even scores: " + average);
        } else {
            System.out.println("There were no even scores.");
        }
    }
}
