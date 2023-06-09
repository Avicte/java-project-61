package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Progression {
    static final int MAX_COUNT = 3;
    static final int MAX_RANDOM = 100;
    static final int MAX_RANDOM_INCREASE = 5;
    static final int MAX_RANDOM_LENGTH = 10;
    public static void progression() {
        String userName = Cli.greetings();

        System.out.println("What number is missing in the progression?");

        int count = 0;
        while (count < MAX_COUNT) {

            int randomLengthOfProgression = new Random().nextInt(MAX_RANDOM_INCREASE, MAX_RANDOM_LENGTH);
            int[] randomProgression = new int[randomLengthOfProgression];
            int initialValue = new Random().nextInt(1, MAX_RANDOM);
            int randomIncrease = new Random().nextInt(1, MAX_RANDOM_INCREASE);
            randomProgression[0] = initialValue;

            for (var i = 1; i < randomProgression.length; i++) {
                randomProgression[i] = randomProgression[i - 1] + randomIncrease;
            }

            int randomIndex = new Random().nextInt(0, randomProgression.length - 1);
            String[] stringProgression = new String[randomProgression.length];

            for (var i = 0; i < stringProgression.length; i++) {
                stringProgression[i] = Integer.toString(randomProgression[i]);
            }

            String correctAnswer = stringProgression[randomIndex];
            stringProgression[randomIndex] = "..";
            String question = Arrays.toString(stringProgression).replaceAll("\\[|]", "").replaceAll("\\,", "");

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            Scanner scanner1 = new Scanner(System.in);
            int answer = scanner1.nextInt();

            if (correctAnswer.equals(Integer.toString(answer))) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }

        }
        Engine.endingString(count, userName);
    }
}
