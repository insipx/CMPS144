/*
NAME:
If you worked with someone:
	List individuals:
	
	What was your contribution:


If you helped someone, for each person, list who and how you helped.




If someone helped you, for each person, list who and how you helped.




*/
   import java.io.*;
   import java.util.*;

/**
* An array implementation of the Hunt interface
*
*/
    public class ArrayHunt implements Hunt{
      private SteppingStone[] path = new SteppingStone[150];
      private int size;
      private int start;
   	
       public void initialize(String fileName) throws IOException {
       	// Sets up a buffer and links the file to the buffer
         BufferedReader buffer = new BufferedReader(new FileReader(fileName));
      	// Reads the first line, which contains a number, translate the string to a number and places it in start
         this.start = Integer.valueOf(buffer.readLine()).intValue();
      	// index keep track of the array position being filled
         int index = 0;
      	// Loop until the buffer runs out of records
         while (buffer.ready()){
         	// Place the buffer contents into a string tokenizer using the tab token
            StringTokenizer token = new StringTokenizer(buffer.readLine(), "\t");
         	// first token is a char, second in an int, use them to construct a SteppingStone
            SteppingStone Stone = new SteppingStone(token.nextToken(), Integer.valueOf(token.nextToken()));
         	// Place the stone in the array
            this.path[index] = Stone;
         	// increment the array index
            index++;
         }
      	// index is the count of the number of SteppingStones placed in the path
         this.size = index;
      }
   
       public String toString(){
         String answer = "";
      	// for each SteppingStone
         for(int i=0; i < this.size; i++){
         	// Place string representation of first SteppingStone into the answer
            if(answer == "") answer = this.path[i].toString();
            // Append all other SteppingStones with a dash in between
            else answer += " - "+this.path[i].toString();
         }
      	// Return the string representation
         return answer;
      }
   
       public String hunt(){
         String answer = "";
         //make the starting point, in this case the first number in the hunt_tokens file
         SteppingStone currentStep = path[start];
         
         int direction = this.start + currentStep.getDirection();
         
         //a while loop which will stop when the direction of the current step is 0
         while (currentStep.getDirection() != 0){
        	 //append the symbol to the answer
        	 answer += currentStep.getSymbol();
        	 //get the next step
        	 currentStep = path[direction];
        	 //figure out what the next direction will be
        	 direction = direction + currentStep.getDirection();
        	 
        	 
         }
         //since our while loop ends at value 0, we still need to append the symbol in dir 0
         //the if case just makes sure we are appending dir 0, and not some other direction
         //it's more for the safety and well-being of my mind than the impeccable continuity of the program 
         if(currentStep.getDirection() == 0){
        	 answer+= currentStep.getSymbol();
         }

         return answer;
      }
   
   }
