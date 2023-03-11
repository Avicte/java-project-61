package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;


public class Even {
    static final int MAX_COUNT = 3;
    static final int MAX_RANDOM = 100;
    public static void randomEven() {
        String userName = Cli.greetings();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int count = 0;
        while (count < MAX_COUNT) {
            int randomNumber = new Random().nextInt(1, MAX_RANDOM);

            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");

            Scanner scanner1 = new Scanner(System.in);
            String answer = scanner1.nextLine();

            if (randomNumber % 2 == 0) {
                String answerForCheck = "yes";
                if (answerForCheck.equalsIgnoreCase(answer)) {
                    System.out.println("Correct!");
                    count++;
                } else if (answer.equalsIgnoreCase("no")) {
                    System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                    System.out.println("Let's try again, " + userName + "!");
                    break;
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
                    System.out.println("Let's try again, " + userName + "!");
                    break;
                } else {
                    System.out.println("Incorrect input ;(");
                    break;
                }
            }
        }
        Engine.endingString(count, userName);
    }
}
