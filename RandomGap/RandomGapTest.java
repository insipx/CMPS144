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
    	  System.out.println("This is the range" + i);
      }
      
   }

   public void RunTest(Integer Num){
	   
	   
	   for (int repeat = 0; repeat < Num; repeat++){
	   
	   ArrayList<Integer> testArray = new ArrayList<Integer>();
	      
	   	  Random rand = new Random();
	      for (int i=0; i< range; i++){
	    	  testArray.add(rand.nextInt(range));
	      }
	   //Loop through Gap in order to see how many gaps occur in the testArray
	   for (int i = 0; i < Gap.size(); i++){
		
		   
		   //this loops through the range to see if any gaps occur. This should measure frequency of gaps
		   for(int j = 1; j < testArray.size(); j++ ){
	 		  
	    		  if (testArray.get(i) == j){
	    			  Gap.set(i, Gap.get(i)+ 1);
	    		  }
	    		
	    	  }  
	    	  
	      }
   }
}
   public ArrayList<Integer> GetGapData(){
      return this.Gap;
   }

   



}
