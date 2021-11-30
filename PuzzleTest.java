import java.util.ArrayList;
import java.util.Random;

public class PuzzleTest{

    public static void main(String[] args) {
        PuzzleJava puzzleBot = new PuzzleJava();

        // 1.
        ArrayList<Object> randomRolls = new ArrayList<Object>();
        puzzleBot.getTenRolls(randomRolls);
        
        // 2.
        puzzleBot.getRandomLetter();

        // 3. 
        puzzleBot.generatePassword();

        puzzleBot.getNewPasswordSet(4);
    }

}