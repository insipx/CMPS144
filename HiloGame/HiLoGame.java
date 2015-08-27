/*
Name:

Who did you help?


How did you help them?


Who helped you?


How were you helped?


*/
   import java.util.*;
   import javax.swing.*;
	

    public class HiLoGame {
    
       public static void HiLo(){
         Random r = new Random();
         int Lo = 1;
         int Hi = 100;
         int Target = r.nextInt(Hi-Lo+1)+1; // Picks a numner from 1 to 100.
         System.out.println(Target);
         int NoOfGuesses = 0;
         int Guess = -1;
         String Title = "Hi Lo Game";
         String data = JOptionPane.showInputDialog(null, "The number is between "+Lo+" and "+Hi+"\nMake your guess.", Title, 1);
         Guess = new Integer(data);
         while((Guess!=Target)&&(NoOfGuesses!=8)){
            if(Guess != Target){
               if(Guess < Lo){
                  // Insert code to handle this situation


               } 
               else if (Guess > Hi){
                  // Insert code to handle this situation


               } 
               else if (Guess < Target){
                  // Insert code to handle this situation


               } 
               else {
                  // Insert code to handle this situation


               }
            }
            NoOfGuesses++;
            Guess = new Integer(data);
         }
         if(Guess == Target)
                  // Insert code to handle this situation


         else
                  // Insert code to handle this situation


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
               null,
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
