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

   //private Integer[] Uniform;

   
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
	   
	   ArrayList<Integer> testArray = new ArrayList<Integer>();

	   Random rand = new Random();
	   
	   //create the test array for random numbers
	   for (int i=0; i< Num; i++){
		   testArray.add(rand.nextInt(range));
	       }
	 
	   ArrayList<Integer> count = new ArrayList<Integer>();
	   
	   //for counting numbers
///	   for(int i =0; i< Num; i++){
		   ///count.add(0);
//	   }
	   
	   for (int i = 0; i < testArray.size(); i++){
		   
		   for (int j = 0; j < range; j++){
			   
			   
			   if(j == testArray.get(i)){
				   
				   
				   
				   int k = i+1;
				 try{
					   while(j != testArray.get(k)){
					   
						   k++;
					   
					   }
				 }catch(Exception e){
					 
				 }
					   		if((k-i) > range -1){
					   			Gap.set(0, Gap.get(0) +1 );
					   		}
					   		else{
					   			Gap.set((k-i), Gap.get(k-i) + 1);
					   		}
				   
			   
				 
				   
			   }
			   
			   
			   
		   } 
		   
		   
		   
	   }
	   
	  
	   
	   	
	   
	   
	   
	   
	   

	   
   
}
   


   public ArrayList<Integer> GetGapData(){
      return this.Gap;
   }

   



}
