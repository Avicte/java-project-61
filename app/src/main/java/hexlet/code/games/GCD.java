package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;

public class GCD {
    static final int maxCount = 3;
    static final int maxRandom = 100;
    public static void division() {
        String userName = Cli.greetings();

        System.out.println("Find the greatest common divisor of given numbers.");

        int count = 0;
        while (count < maxCount) {
            int randomNumber1 = new Random().nextInt(1, maxRandom);
            int randomNumber2 = new Random().nextInt(1, maxRandom);

            int min = Math.min(randomNumber1, randomNumber2);

            System.out.println("Question: " + randomNumber1 + " " + randomNumber2);
            System.out.print("Your answer: ");
            Scanner scanner1 = new Scanner(System.in);
            int answer = scanner1.nextInt();

            int minDivision = 1;
            for (var i = 1; i <= min; i++) {
                if (randomNumber1 % i == 0) {
                    if (randomNumber2 % i == 0) {
                        minDivision = i;
                    }
                }
            }
            if (minDivision == answer) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + minDivision + "'.");
                System.out.println("Let's try again " + userName + "!");
                break;
            }
        }
        Engine.endingString(count, userName);
    }
}

