package chap05;

// import helpers.GameHelper;   // ⟵ remove this line

import java.util.Scanner;       // (optional—you're not using Scanner, so you can remove this too)

public class Game {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();   // same package, no import needed

        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(locations);

        boolean isAlive = true;
        while (isAlive) {                       // small tidy-up
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}
