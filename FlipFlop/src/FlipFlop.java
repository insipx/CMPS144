/*
Name: Andrew Plaza

Who did you help?


How did you help them?


Who helped you?


How were you helped?


*/
import java.util.*;
import javax.swing.*;

public class FlipFlop {

   public static void FlipFlop(Integer a, Integer b, Integer Max){
   /*
   * Complete this method, meaningfully formatted
   * Include in-line comments that explain each line of code
   */
	 //Start the iteration at 1 and iterate until i hits the number set as "Max".  
	   for (int i =1; i <= Max;i++){
		   
		  //if a divides into i an even number of times (with a remainder of 0) and b divides into i an even number of times (with a remainder of 0) print FlipFlop.
		  //This specific case needs to be checked for first, because otherwise only "Flip" or "Flop" alone would be printed, instead of "FlipFlop" since both a and b divide into it.
		  if ( i% a == 0 && i % b ==0){
			  System.out.println("FlipFlop");
		   }
		  //if a divides into i evenly print flip
		  else if (i % a == 0){
			  System.out.println("Flip");
		  }
		  //if b divides into i evenly print flop
		  else if (i%b == 0){
			  System.out.println("Flop");
		  }
		  //if nothing divides into i evenly just print i itself
		  else{
			  System.out.println(i);
		  }
		   
	   }
   }


   public static void main (String[] arg){
      Integer a;
      Integer b;
      Integer max;
      String Title = "FlipFlop Assignment";
      String data = JOptionPane.showInputDialog(null, "Enter your first number", Title, 1);
      a = new Integer(data);
      data = JOptionPane.showInputDialog(null, "Enter your second number", Title, 1);
      b = new Integer(data);
      data = JOptionPane.showInputDialog(null, "Enter the upper bound", Title, 1);
      max = new Integer(data);
      FlipFlop(a, b, max);
   }
   
}