package hexlet.code;

public class Engine {

    public static void endingString(int count, String userName) {
        if (count == 3) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Game Over, " + userName + "!");
        }
    }
}
