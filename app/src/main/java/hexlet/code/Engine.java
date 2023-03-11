package hexlet.code;

public class Engine {
    static final int MAX_COUNT = 3;
    public static void endingString(int count, String userName) {
        if (count == MAX_COUNT) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Game Over, " + userName + "!");
        }
    }
}
