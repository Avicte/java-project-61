package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    static final int EVEN_GAME = 2;
    static final int CALC_GAME = 3;
    static final int GCD_GAME = 4;
    static final int PROGRESSION_GAME = 5;
    static final int PRIME_GAME = 6;
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        int gameNumber = scanner.nextInt();

        switch (gameNumber) {
            case 0 -> { }
            case 1 -> Cli.greetings();
            case EVEN_GAME -> Even.randomEven();
            case CALC_GAME -> Calc.randomCalc();
            case GCD_GAME -> GCD.division();
            case PROGRESSION_GAME -> Progression.progression();
            case PRIME_GAME -> Prime.primeGame();
            default -> System.out.println("Invalid game number.");
        }
    }
}
