package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String greetings() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("What is your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
