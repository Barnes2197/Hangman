package hangman;
import java.util.Scanner;
import java.util.Random;

public class Hangman {

    
    public static void main(String[] args) 
    {
        new Hangman();
    }
    
    public Hangman()
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        String words[] = {"game", "illustration","java", "class", "albatross"};
        int pickWord = rnd.nextInt(words.length);
        String question = words[pickWord];
        boolean game[] = new boolean[question.length()];
        /*int pickWord = rnd.nextInt(words.length);
        String question = words[pickWord];
        boolean game[] = new boolean[question.length()];
        boolean gameOver = false;*/
                       
        for(int i = 0; i < game.length;i++)
        {
            game[i] = false;
        }
        int counter = 0;
        int winCounter = 0;
        String hangman;
        
        while(counter < 9){
            
           switch(counter)
        {
            case 1:
                hangman = "\n" + "\n|" + "\n|" + "\n|" + "\n|" + "\n|" + "\n|_______________________\n";
                break;
            case 2:
                hangman = "\n_________" + "\n|" + "\n|" + "\n|" + "\n|" + "\n|" + "\n|_______________________\n";
                break;
            case 3:
                hangman =  "\n_________" + "\n|                   |" + "\n|" + "\n|" + "\n|" + "\n|" + "\n|_______________________\n";
                break;
            case 4:
                hangman =  "\n_________" + "\n|                   |" + "\n|                  O" + "\n|" + "\n|" + "\n|" + "\n|_______________________\n";
                break;
            case 5:
                hangman =  "\n_________" + "\n|                   |" + "\n|                  O" + "\n|                   |" + "\n|" + "\n|" + "\n|_______________________\n";
                break;
            case 6:
                hangman =  "\n_________" + "\n|                   |" + "\n|                  O" + "\n|               ---|" + "\n|" + "\n|" + "\n|_______________________\n";
                break;
            case 7:
                hangman =  "\n_________" + "\n|                   |" + "\n|                  O" + "\n|               ---|---" + "\n|" + "\n|" + "\n|_______________________\n";
                break;
            case 8:
                hangman = "\n_________" + "\n|                   |" + "\n|                  O" + "\n|               ---|---" + "\n|                  /" + "\n|                /" + "\n|_______________________\n";
                break;
            case 9:
                hangman = ("Incorrect" + "\n_________" + "\n|                   "
                        + "|" + "\n|                  O" + "\n|               "
                        + "---|---" + "\n|                  /\\" + "\n|      "
                        + "          /    \\" + "\n|____________________"
                        + "___" + "\nSorry, you lost.\nThe stick man is Dead!"
                        + "\nThe answer word was: \"" + question + "\"");
                
                                                          
            
            for(int i  = 0; i < game.length;i++)
            {
                if(game[i] == true)
                    System.out.print(question.charAt(i));
                else
                    System.out.print("_" + " ");
                
            }
            
            System.out.println("");
            
            System.out.println("Enter a letter: ");
            char guess = in.next().charAt(0);
            
            for(int i = 0; i < game.length;i++)
            {
               if(guess == question.charAt(i))
               {
                   game[i] = true;
               }
            }
            
            counter++;
            winCounter = 0;
            for(int i = 0; i < game.length;i++)
            {
                if(game[i] == true)
                    winCounter++;
            }
            if(winCounter == game.length)
                break;
            
           }
        }
        if(counter >= 9)
            System.out.println("You ran out of guesses");
        else
            System.out.println("You won");
        
        
        
        
        
        
        
        
        }   
    }
    
    
     

