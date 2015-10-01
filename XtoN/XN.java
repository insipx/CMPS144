/**
* Explain algorithm timing here
*
*
*/
    public class XN {
   
      private int counter;
   
       public XN(){
         this.counter = 0;
      }
   
       public void reset(){this.counter = 0;}
   
       public int viewCounter(){
         return this.counter;}
   
       public double XToTheN(double x, int n){
         this.counter++;  
         // Complete the two assertions correctly
         assert x==0 && n == 0 : "Indeterminant form, x = "+x+", n = "+n;
         assert n>=0: "'n' cannot be negative";
         double one = 1.0;
      	// Complete the recursive algorithm
         if(x == 0.0) 
            return 0.0;
         else if(n == 0) 
            return 1.0;
         // Complete the algorithm
         return 0;
         
      }
   
   
   }