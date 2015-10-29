  //WORKED WITH
//Sean Batzel
//Jack Prendergast
//Joe Lalanto
//Kristin curry
//DJ nowels
	
   import java.io.*;
   import java.util.*;
   import java.awt.*;
   import javax.swing.*;
   import java.awt.event.*;
   import scranton.visual.*;

   public class Greedy{
   
      Grapher G;
      JMap M;
      VJFrame frame;
      Color[] C = {Color.white, Color.red, Color.yellow, Color.green, Color.blue};
      Stack<NodeInfo> Valid, Working;
   	
      public Greedy(Grapher G, JMap M){
         this.G = G;
         this.M = M;
         this.frame = new VJFrame("Greedy Algorithm on U.S. Map");
         Valid = new Stack<NodeInfo>();
         Working = new Stack<NodeInfo>();
      
         ArrayList<String> Seq = G.getSeq();
         for(Integer i = Seq.size()-1; i >= 0; i--){
            String id = Seq.get(i);
            System.out.println(id);
            NodeInfo N = G.refNode(id);
            Working.push(N);
            N.setColor(0);
            M.displayElement(N.getName(), C[N.getColor()], frame);
         }
      
      }
   	
      public void go(){

         while(!Working.empty()){
         	// work on the item at the top of the working stack
            NodeInfo Current = Working.peek();   
            
    
            //set i to the current color -1
            int i = Current.getColor() - 1;
            
            //Start from the fourth color
            if(i<0) i = 4;
            	//iterate through each color
            	//while the color is greater than or equal to 0 keep going
            	while(i >= 0){
            		
            		//set the color
            		Current.setColor(i);
            		//color the map
            		M.displayElement(Current.getName(), C[Current.getColor()], frame);
            		//if it's a valid coloring, we got it! 
            		if(Current.validColoring()){
            			
            			break;
            		}
            		//else we don't and just color the map
            		else{
            			M.displayElement(Current.getName(), C[Current.getColor()], frame);
            		}
            		
            		//increment the color, subtracting one
            		i--;
            	}
            	//if the color falls through to 0, we have a problem
            	if(Current.getColor() ==0){
            		//put it on the working stack, we need to backup/do some more coloring work
            		Working.push(Valid.pop());
            		
            		
            	}else{
            		//we got it right and can push it to the valid stack
            		Valid.push(Working.pop());
            		//make sure to color the state
            		M.displayElement(Current.getName(), C[Current.getColor()], frame);
            		
            	}
            	//color the state
            	M.displayElement(Current.getName(), C[Current.getColor()], frame);
            	 	            
 	
         }
      }
   	
   }
