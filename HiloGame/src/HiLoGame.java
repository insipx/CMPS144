/*
Name: Andrew Plaza

Who did you help?


How did you help them?


Who helped you?


How were you helped?



ASSIGNMENT DESCRIPTION
Complete HiLoGame.java that allows a person to play agains the computer and guess the number selected by the computer. The message placed in the pop up menus displays the current range of values. It starts with 1 and 100, inclusive. After each guess, the Lo Hi range is properly adjusted to precisely indicate the exact range of possible numbers. There are several places where the code must be completed:

    Two places when the person makes a guess outside the range, let them now, and let them quess again.
    Let them know when they must guess LOWER, adjust the range and let them guess again.
    Let then know when they must guess HIGHER, adjust the range and let them guess again.
   In the if-else structure outside the game loop display one of two pop-up displays to indicate that they have succeeded or failed along with information about the number of guesses and the number that was sought
   Keep track of the number of guesses so that the loop will terminate once they have reached the number of guesses.
   Also, make sure that your message to the player precisely describes the correct range with words, and/or mathematical symbols.


*/
   import java.util.*;
   import javax.swing.*;
	

    public class HiLoGame {
    
       public static void HiLo(){
         Random r = new Random();
         int Lo = 1;
         int Hi = 100;
         int Target = r.nextInt(Hi-Lo+1)+1; // Picks a number from 1 to 100.
         System.out.println(Target);
         int NoOfGuesses = 0;
         int Guess = -1;
         String Title = "Hi Lo Game";
         String data = JOptionPane.showInputDialog(null, "The number is between "+Lo+" and "+Hi+" (inclusive) \nMake your guess.", Title, 1);
         Guess = new Integer(data);
         while((Guess!=Target)&&(NoOfGuesses!=8)){
            if(Guess != Target){
               if(Guess < Lo){
                 //Give an error message if a user guesses out of range
            	JOptionPane.showMessageDialog(null,"You chose a number not in range, guess again", "You chose a number not in range, guess again", JOptionPane.ERROR_MESSAGE);
               } 
               else if (Guess > Hi){Guess = new Integer(data);
              //give an error message if a user guesses out of range
        	   JOptionPane.showMessageDialog(null,"You chose a number not in range, guess again", "You chose a number not in range, guess again", JOptionPane.ERROR_MESSAGE);  
               } 
               else if (Guess < Target){
                  //set the Low value to guess, since the user guessed too low. This will adjust the range.
            	   Lo = Guess;
            	   JOptionPane.showMessageDialog(null, "You're a bit low. Try Again", "You're a bit low, try again", JOptionPane.INFORMATION_MESSAGE);
               } 
               else {
            	   //set the high value to guess, since the user guessed too high, and this will adjust the range.
                   Hi = Guess;
            	   JOptionPane.showMessageDialog(null, "You're a bit high. Try again", "You're a bit high, try again", JOptionPane.INFORMATION_MESSAGE);
               }
            }
            NoOfGuesses++;
            //prompt the user to guess again.
            data = JOptionPane.showInputDialog(null, "The number is between "+Lo+" and "+Hi+" (inclusive) \nMake your guess.", Title, 1);
            Guess = new Integer(data);
         }
         if(Guess == Target){
        	// The normal user wouldn't understand if they had "0" guesses, or an amount of guesses that wouldn't make sense if they started counting from 1, 
        	 // like everyone *but* computer scientists do. Therefore, add one to the guess count so it's more understandable
        	 NoOfGuesses += 1; 
        	 JOptionPane.showMessageDialog(null, "You guessed correctly! It took you "+ NoOfGuesses +" guesses to correctly guess " + Target + ". You Win! :-)", "You guessed correctly! It took you "+ NoOfGuesses +" to guess correctly. You Win! :-)", JOptionPane.INFORMATION_MESSAGE);
           
      }
         else{
        	 
        	 // The normal user wouldn't understand if they had "0" guesses, or an amount of guesses that wouldn't make sense if they started counting from 1, 
        	 // like everyone *but* computer scientists do. Therefore, add one to the guess count so it's moreS
        	 JOptionPane.showMessageDialog(null, "You're out of guesses! You Lose :-(. The correct guess was " + Target + ". You guessed incorrectly " +NoOfGuesses + " times ","You're out of guesses! You Lose :-(",JOptionPane.INFORMATION_MESSAGE);
    	 }
         
         
  }
   
       public static void main(String argv[]){
         String[] commands = {
               "Play Hi Lo",
               "Exit"
               };
         int choice = -1;
         String Title = "Play The Hi Lo Game";
         choice = JOptionPane.showOptionDialog(
            null,
            "Do you want to play Hi Lo against the computer?",
            Title,
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            commands,
            commands[commands.length-1]
            );
         while(choice != commands.length-1) {
            HiLo();
            choice = JOptionPane.showOptionDialog(
               null, //leave this here
               "Do you want to play Hi Lo against the computer?",
               Title,
               JOptionPane.YES_NO_CANCEL_OPTION,
               JOptionPane.QUESTION_MESSAGE,
               null,
               commands,
               commands[commands.length-1]
               );
         }
      }
   	 
   }
