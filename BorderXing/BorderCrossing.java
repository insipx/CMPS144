  /* NAME: ANDREW PLAZA
   * 
   */
   
   import java.io.*;
   import java.util.*;
   import java.awt.*;
   import javax.swing.*;
   import java.awt.event.*;
   import scranton.visual.*;
   import scranton.queue.*;

   public class BorderCrossing{
   
      Grapher G;
      JMap M;
      VJFrame frame;
      Color[] C = {Color.white, Color.red, Color.yellow, Color.green, Color.blue};
   	
      public BorderCrossing(Grapher G, JMap M){
         this.G = G;
         this.M = M;
         this.frame = new VJFrame("Border Crossing on U.S. Map");
      
         ArrayList<String> Seq = G.getSeq();
         for(Integer i = Seq.size()-1; i >= 0; i--){
            String id = Seq.get(i);
            System.out.println(id);
            NodeInfo N = G.refNode(id);
            N.setColor(0);
            M.displayElement(N.getName(), C[N.getColor()], frame);
         }
      
      }
   	
      public void go(String A, String B){
      
         QueueViaStandard<NodeInfo> Q = new QueueViaStandard<NodeInfo>();
         Integer counter = 0;
         Integer backup = 0;
         Boolean Finished = false;
         //Is THIS the root???????
         NodeInfo start= G.refNode(A);
         NodeInfo Node = G.refNode(B);
         start.setColor(1);
         Node.setColor(2);
         M.displayElement(start.getName(), C[start.getColor()], frame);
         M.displayElement(Node.getName(), C[Node.getColor()], frame);
         Q.insert(start);
         start.inQ();
         while (!Q.isEmpty() & !Finished){
            // Complete the code
            start = Q.remove();
            //start.setColor(3);
            //M.displayElement(start.getName(), C[start.getColor()], frame);
            for(int i = 0; i < start.noOfNeighbors(); i++){
            	if (start.getNeighbor(i).getQ() != true){
            		//mark the neighbor as 'used' or in the queue
            		start.getNeighbor(i).inQ();
            		//set the parent neighbor 
            		start.getNeighbor(i).setParent(start);     
            		//insert the neighbor into the queue
            		Q.insert(start.getNeighbor(i));
            		//color the map blue
            		//start.getNeighbor(i).setColor(4);
                    //M.displayElement(start.getName(), C[start.getNeighbor(i).getColor()], frame);
                    
            		//if we reach the state we are looking for stop looking 
            		//Color the neighbors
            		start.getNeighbor(i).setColor(3);
                    M.displayElement(start.getNeighbor(i).getName(), C[start.getNeighbor(i).getColor()], frame);
            		if(start.getNeighbor(i) == Node){
                    	Finished = true;
                    	
                    }
                    //color thenode green
            		
            	}
            	
                
            	
            }
            
        //1 = red
            //3 == green
            //color red
            start.setColor(1);
            M.displayElement(start.getName(), C[start.getColor()], frame);   
            
            
         }
        
     	
    	
       
       
         //another node, this one points to B, the one i chose to be the end-point or Node we are trying to get to from the start
         
         //I chose to color the path blue
        
        while(Node != null){
       	 	 Node.setColor(4);
       	 	 M.displayElement(Node.getName(), C[Node.getColor()], frame);
        	 Node = Node.getParent();

             
        }

         
   	
      }
   }
