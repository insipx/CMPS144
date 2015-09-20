/*
Name: Andrew Plaza

Who did you help?


How did you help them?


Who helped you?


How were you helped?


*/
import java.util.*;
import javax.swing.*;

public class FibonacciArrayList {

   public static ArrayList<Integer> Fibonacci (Integer Max){

	   
      ArrayList<Integer> A = new ArrayList<Integer>();

      //we know that the first 2 fibonacci numbers have to be 1
      	int a = 1;
        int b = 1;
        //we don't know the third value, so we will just leave it at 0 for now
      	int c = 0;
        //add the first two numbers to the list
      	A.add(a);
      	A.add(b);
      	
      	//I only want to calculate the fib numbers which are less than the upper bound(Max), so the program should stop if the latest fib number is > than Max
      	while (c < Max){
      		c = a +b;
      		//We see that although the latest fib number is less than max, this will still calculate the next number which is greater than Max. Therefore make sure that c is less than the upper bound
      		if (c < Max){
      			A.add(c);
      		}
      		else{
      			//if it' is more than upper bound don't do anything
      		}
      		//progress the fibonacci sequence by setting the values a and b to the next numbers in the sequence
      		a = b;
      		b = c;	
      	}

      return A;
   }


   public static void main (String[] arg){
      Integer max;
      String Title = "Fibonacci ArryList Assignment";
      String data = JOptionPane.showInputDialog(null, "Enter the upper bound", Title, 1);
      max = new Integer(data);
      ArrayList<Integer> A = Fibonacci(max);
      System.out.println("There are " + A.size()+ " Fibonacci numbers less than "+max);
      //let's inform the user that the numbers being printed out are the fibonacci numbers
      System.out.println("The Numbers Are: \n");
      //iterate through the ArrayList A, one by one, printing each number out to the user
      for (int i = 0; i< A.size(); i++){
       System.out.println(A.get(i));	  
      }
      
     
      
   }
   
}