/*
NAME:
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
     	// index keep track of the array position being filled
        int index = 0;
     	// Loop until the buffer runs out of records
        while (buffer.ready()){
        	// Place the buffer contents into a string tokenizer using the tab token
           StringTokenizer token = new StringTokenizer(buffer.readLine(), "\t");
        	// first item is a char, second is an int, make them into a stepping stone object
           SteppingStone stone = new SteppingStone(token.nextToken(), Integer.valueOf(token.nextToken()));
        	// Place the stone in the array
            this.left.push(stone);
            
        	// increment the index, so we know how many stepping stones there are
           index++;
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
		while(move!=0){

			




		}
		return answer;
	}


}
