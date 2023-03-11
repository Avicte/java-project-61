package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        int gameNumber = scanner.nextInt();

        switch (gameNumber) {
            case 0 -> { }
            case 1 -> Cli.greetings();
            case 2 -> Even.randomEven();
            case 3 -> Calc.randomCalc();
            case 4 -> GCD.division();
            case 5 -> Progression.progression();
            case 6 -> Prime.primeGame();
            default -> System.out.println("Invalid game number.");
        }
    }
}
