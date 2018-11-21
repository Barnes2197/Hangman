package hangman;

import java.util.Scanner;
import java.util.Random;

public class Hangman {

    public static void main(String[] args) {
        new Hangman();
    }

    public Hangman() {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        String words[] = {"game", "illustration", "java", "class", "albatross"};
        int pickWord = rnd.nextInt(words.length);
        String question = words[pickWord];
        boolean game[] = new boolean[question.length()];
        /*int pickWord = rnd.nextInt(words.length);
        String question = words[pickWord];
        boolean game[] = new boolean[question.length()];
        boolean gameOver = false;*/

        for (int i = 0; i < game.length; i++) {
            game[i] = false;
        }

        int counter = 0;
        int winCounter = 0;

        while (counter < 5) {
            //Displaying empty spaces for so you know the number of spaces
            for (int i = 0; i < game.length; i++) {
                if (game[i] == true) {
                    System.out.print(question.charAt(i));
                } else {
                    System.out.print("_" + " ");
                }

            }

            System.out.println("");

            System.out.println("Enter a letter: ");
            char guess = in.next().charAt(0);
            //Used to set a letter to true if you guess it right
            for (int i = 0; i < game.length; i++) {
                if (guess == question.charAt(i)) {
                    game[i] = true;
                }
            }

            counter++;//Used to give the user 9 tries
            winCounter = 0;//Sets the WinCounter to 0 so it won't start a higher number the next loop
            for (int i = 0; i < game.length; i++) {
                if (game[i] == true) {
                    winCounter++;
                }
            }
            if (winCounter == game.length) {
                break;
            }

        }
        if (counter >= 5) {
            System.out.println("You ran out of guesses");
        } else {
            System.out.println("You won");
        }

    }

}
