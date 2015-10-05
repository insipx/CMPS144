/**
* NAME: Andrew Plaza
*
* Who did you help, and how?
*
*
*
* Who helped you, and how?
*
*for reference:
*n!/((n-r)!r!)
*/

   public class Combinations {
   
      private int counter;
   
      public Combinations(){this.counter = 0;}
   
      public void reset(){this.counter = 0;}
   
      public int viewCounter(){ return this.counter;}
   
      public Integer Combo(Integer n, Integer r){
         
    	 this.counter++;  
         
    	
    	 //because r cannot be larger than n, so this subtracts from the factorial, if r is larger than n
    	 if(n < r){ 
    		return -1;
            }
    	//If we reach this we know our recursion is finished and know the answer
    	 else if (r ==0 || r ==n) return 1;
    	
    	 else{
   		 //this is the recursive version of n!/(n-r)!r!
    		 return Combo(n-1, r-1) + Combo(n-1, r);
    	 }
			
      
      }
      
   
   
   }