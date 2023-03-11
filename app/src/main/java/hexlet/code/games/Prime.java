package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void primeGame() {
        String userName = Cli.greetings();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int count = 0;
        int maxCount = 3;
        while (count < maxCount) {
            int randomNumber = new Random().nextInt(0, 100);
            boolean correctAnswer = Prime.isSimple(randomNumber);

            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            Scanner scanner1 = new Scanner(System.in);
            String answer = scanner1.nextLine();

            if (correctAnswer) {
                String answerForCheck = "yes";
                if (answerForCheck.equalsIgnoreCase(answer)) {
                    System.out.println("Correct!");
                    count++;
                } else if (answer.equalsIgnoreCase("no")) {
                    System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                    System.out.println("Let's try again " + userName + "!");
                } else {
                    System.out.println("Incorrect input ;(");
                    break;
                }

            } else {
                String answerForCheck2 = "no";
                if (answerForCheck2.equalsIgnoreCase(answer)) {
                    System.out.println("Correct!");
                    count++;

                } else if (answer.equalsIgnoreCase("yes")) {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again " + userName + "!");
                } else {
                    System.out.println("Incorrect input ;(");
                    break;
                }

            }
        }
        Engine.endingString(count, userName);
    }
    public static boolean isSimple(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
