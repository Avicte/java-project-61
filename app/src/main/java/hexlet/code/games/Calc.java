package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;



public class Calc {
    static final int maxCount = 3;
    static final int maxRandom = 100;
    public static void randomCalc() {

        String userName = Cli.greetings();

        System.out.println("What is the result of the expression?");

        char[] operations = {'+', '-', '*'};

        int count = 0;
        while (count < maxCount) {

            int randomNumber = new Random().nextInt(1, maxRandom);
            int randomNumber2 = new Random().nextInt(1, maxRandom);

            int randomIndex = new Random().nextInt(operations.length);
            char operator = operations[randomIndex];

            int correctAnswer = Calc.operationVariations(randomNumber, randomNumber2, operator);

            System.out.println("Question: " + randomNumber + " " + operator + " " + randomNumber2);
            System.out.print("Your answer: ");
            Scanner scanner1 = new Scanner(System.in);
            int answer = scanner1.nextInt();

            if (correctAnswer == answer) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again " + userName + "!");
                break;
            }
        }
        Engine.endingString(count, userName);
    }

    public static int operationVariations(int number1, int number2, char operator) {
        return switch (operator) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            default -> throw new IllegalStateException("Invalid operator: " + operator);
        };
    }
}

