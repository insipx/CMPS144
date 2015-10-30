/*
NAME: Andrew Plaza
If you worked with someone: 
	List individuals:
	
	What was your contribution:


If you helped someone, for each person, list who and how you helped them.




If someone helped you, for each person, list who and how they helped you.




*/
import java.io.*;
import java.util.*;

public class StackHunt implements Hunt {
	private Stack<SteppingStone> left = new Stack<SteppingStone>();
	private Stack<SteppingStone> right = new Stack<SteppingStone>();
	private int start;
	
	public void initialize(String fileName) throws IOException {
        // Put the stones in the left stack as you read create them
       	// Sets up a buffer and links the file to the buffer
        BufferedReader buffer = new BufferedReader(new FileReader(fileName));
     	// Reads the first line, which contains a number, translate the string to a number and places it in start
        this.start = Integer.valueOf(buffer.readLine()).intValue();
     	
     	// Loop until the buffer runs out of records
        while (buffer.ready()){
        	// Place the buffer contents into a string tokenizer using the tab token
           StringTokenizer token = new StringTokenizer(buffer.readLine(), "\t");
        	// first item is a char, second is an int, make them into a stepping stone object
           SteppingStone stone = new SteppingStone(token.nextToken(), Integer.valueOf(token.nextToken()));
        	// Place the stone in the stack
            this.left.push(stone);
            
        	
        }
        // put all items from left stack into right stack, so we can start from the first item
       // "Slinky" the stones from the left stack to the right stack.
      //  The left stack should be empty and the right stack should have all the stones
     //  and the top stone is the first stone on the walk.
        while(!left.empty()){
        	this.right.push(this.left.pop());
        }
	
	}
	
	public String toString(){
		int count = 0;
		while(!this.left.empty()){
			this.right.push(this.left.pop());
			count++;
		}
		String ans = this.right.toString();
		while(count!=0){
			this.left.push(this.right.pop());
			count--;
		}
		return ans;
	}
	
	public String hunt(){
		String answer = "";
		int move = this.start;
//stop when we reach a direction of 0
		while(move != 0){
			
			//if the move necessitates moving backward,
			if(move < 0){
				//we need to move backward, so we get the values we pushed into the left stack by popping it
				//and push it back into the right stack
				for(int i = 0; i > move; i--){
					right.push(left.pop());
				}	
		    } else {
		    	//else we are moving forwad and are popping values from the right stack, 
		    	//pushing them into the left stack
				for(int i = 0; i < move; i++){
					left.push(right.pop());
				}
			}

			//add the string to the answer
			answer += right.peek().getSymbol();
			//get the next move
			move = right.peek().getDirection();
			
		}
		//return our answer
		return answer;
	}


}
