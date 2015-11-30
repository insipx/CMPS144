  /* NAME: ANDREW PLAZA
	* HELPED: Zach, nafi, Sean, dj
	* collaborated with Sean
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
         //make starting node red
         start.setColor(1);
         //make end node yellow
         Node.setColor(2);
         //display them on the map
         M.displayElement(start.getName(), C[start.getColor()], frame);
         M.displayElement(Node.getName(), C[Node.getColor()], frame);
         //insert the starting node into the que
         Q.insert(start);
         //mark it as used/"in queue"
         start.inQ();
         //while the queue still has elements
         while (!Q.isEmpty() & !Finished){
            // remove the first element and set start equal to it
            start = Q.remove();
            	//for every neighbor of the node
            for(int i = 0; i < start.noOfNeighbors(); i++){
            	//if the neighbor hasn't been used, in this case it means that "inQ" is false
            	if (start.getNeighbor(i).getQ() != true){
            		//mark the neighbor as 'used' or in the queue
            		start.getNeighbor(i).inQ();
            		//set the parent neighbor 
            		start.getNeighbor(i).setParent(start);     
            		//insert the neighbor into the queue
            		Q.insert(start.getNeighbor(i));
            		
            		//if we reach the state we are looking for stop looking 
            		//Color the neighbors green
            		start.getNeighbor(i).setColor(3);
                    M.displayElement(start.getNeighbor(i).getName(), C[start.getNeighbor(i).getColor()], frame);
                    //if start is equal to the end "Node" that means we got the tree to the state we are looking for
            		if(start.getNeighbor(i) == Node){
            			//we are finished, so we can set the variable to true, so we stop getting neighbors
                    	Finished = true;
                    	
                    }

            		
            	}
            	
                
            	
            }
            //color the which are not 'working' red, this way the green neighbors are all the nodes that are on the end of the tree IE the working neighbors
            start.setColor(1);
            M.displayElement(start.getName(), C[start.getColor()], frame);   
            
            
         }
        
     	
    	
       
       
         
         
         //I chose to color the path blue
        //find the shortest path by getting the parent of the end node, and the parent of that node, until there are no parents left
         //this means we reached the start node and have succesfullly worked our way up the tree
         //finding the shortest distance
        while(Node != null){
        	//color the path blue
       	 	 Node.setColor(4);
       	 	 M.displayElement(Node.getName(), C[Node.getColor()], frame);
       	 	 //Get the parent node
        	 Node = Node.getParent();

             
        }

         
   	
      }
   }
