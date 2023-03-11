package hexlet.code;

public class Engine {
    static final int maxCount = 3;

    public static void endingString(int count, String userName) {
        if (count == maxCount) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Game Over, " + userName + "!");
        }
    }
}
