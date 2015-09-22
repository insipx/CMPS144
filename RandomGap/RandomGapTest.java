import java.util.*;
/*
Andrew Plaza
Who did you help?


How did you help them?


Who helped you?


How did they help you


*/

public class RandomGapTest {

   private Integer range;

   private Integer[] Uniform;

   
// Add attribute(s) to collect gap test data

   ArrayList<Integer> Gap;
   
   /*
   * RandomGapTest Constructor
   */
   public RandomGapTest(Integer range){
      this.range = range;
      Gap = new ArrayList<Integer>();
      for(int i = 0; i < range; i++){
    	  Gap.add(i, 0);
      }
      
   }

   public void RunTest(Integer Num){
	   
	   
	   for (int repeat = 0; repeat < Num; repeat++){
	   
	   ArrayList<Integer> testArray = new ArrayList<Integer>();
	      
	   Random rand = new Random();
	   
	   //create the test array for random numbers
	   for (int i=0; i< range; i++){
		   testArray.add(rand.nextInt(range));
	       }
	   
	   //Loop through Gap in order to see how many gaps occur in the testArray
	   for (int i = 0; i < Gap.size(); i++){
		   boolean foundNum = false; 
		   //this loops through the range to see if any gaps occur. This should measure frequency of gaps
		   for(int j = 0; j < testArray.size(); j++ ){
	 		  
			   
			   //WHAT I HAVE TO DO
			   //first find number
			   //then check if i==j
			   //because rn i==j for the first time does not find a gap, it just finds the first occurrence of a number
			   //Gap.set(i, Gap.get(i)+ 1);
	    		  if (testArray.get(i) == j && foundNum == false)  {
	    			  foundNum = true;
	    		  }
	    		  else if (testArray.get(i) == j && foundNum == true){
	    			  Gap.set(i, Gap.get(i) + 1);
	    		  }
	    		  
	    		
	    	  }  
	    	  
	      }
   }
}
   public ArrayList<Integer> GetGapData(){
      return this.Gap;
   }

   



}
