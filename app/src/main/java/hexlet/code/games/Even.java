package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;


public class Even {
    public static void randomEven() {
        String userName = Cli.greetings();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int count = 0;
        int maxCount = 3;
        while (count < maxCount) {
            int randomNumber = new Random().nextInt(1, 100);

            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");

            Scanner scanner1 = new Scanner(System.in);
            String answer = scanner1.nextLine();

            if (randomNumber % 2 == 0) {
                switch (answer) {
                    case "yes":
                        System.out.println("Correct!");
                        count++;
                        break;
                    case "no":
                        System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                        System.out.println("Let's try again " + userName + "!");
                        break;
                    default:
                        System.out.println("Incorrect input ;(");
                        break;
                }
            } else {
                switch (answer) {
                    case "no":
                        System.out.println("Correct!");
                        count++;
                        break;
                    case "yes":
                        System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                        System.out.println("Let's try again " + userName + "!");
                        break;
                    default:
                        System.out.println("Incorrect input ;(");
                        break;
                }
            }
        }
        Engine.endingString(count, userName);
    }
}