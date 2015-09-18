/*
Name:

Who did you help?


How did you help them?


Who helped you?


How were you helped?


*/
import java.util.*;
import javax.swing.*;

public class FibonacciArrayList {

   public static ArrayList<Integer> Fibonacci (Integer Max){
   /*
   * Complete this method, meaningfully formatted
   * Include in-line comments that explain each line of code
   */
      ArrayList<Integer> A = new ArrayList<Integer>();



      return A;
   }


   public static void main (String[] arg){
      Integer max;
      String Title = "Fibonacci ArryList Assignment";
      String data = JOptionPane.showInputDialog(null, "Enter the upper bound", Title, 1);
      max = new Integer(data);
      ArrayList<Integer> A = Fibonacci(max);
      System.out.println("There are " + A.size()+ " Fibonacci numbers less than "+max);
      /*
      * Add the code to complete the display of answers
      */
      
      
   }
   
}