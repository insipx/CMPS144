/*
* NAME: Andrew Plaza
* 
* Collaborated on it with Sean Batzel
*
*
* Who did you help?
*
*
* How?
*
*
* Who helped you?
*
*
* How?
*
*
*/

/*
* NOTE:  Only place code in the class constructor and methods:
* RollDice, set, getSum, roll, results
*/
import java.util.*;

public class RollDice{
   
   /*
   * Attribute: An array to hold 
   */
   private Integer[] stats;
   
   /*
   * Attribute to hold an instance of a pair of dice
   */
   private Dice pair;
   
   //create a private variable to hold the sum for the set method
   private int sum;
   
   /*
   * Constructor:  Initialize the object
   * Specifically initialze the stats and Pair attributes
   */
   
   	
   public RollDice(){

   }
   
   /*
   * Perform the action of rolling a the pair of dice
   */
   public void set(){
	   pair = new Dice();
	   pair.roll();   
   }
   
   /*
   * Return the sum of the pair of dice
   */
   public Integer getSum(){
	   for (int i = 0; i < stats.length; i++){
		   
		   sum += stats[i];
	   }
	   return sum; 
   }
   
   /*
   * Rolls the object's pair of dice the prescribed number
   * of times and records the results in the stats array
   */
   public void roll(Integer num){
	   
	   stats = new Integer[num];
	   
	   for(int i = 0; i < num; i++){
		   
		   //roll (or "set") the die
		   set();
		   //get the dies
		   int die1 = pair.get(1);
		   int die2 = pair.get(2);
		   //add the dies and add the "result" to the array
		   stats[i] = die1 + die1;
		   
	   }
	   
	   
      }      
   
   
   /*
   * return the stats array.
   */
   public Integer[] results(){
	return stats; 
   }   

}