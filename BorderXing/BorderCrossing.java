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
         NodeInfo start = G.refNode(A);
         Q.insert(start);
         while (!Q.isEmpty() & !Finished){
            // Complete the code
         
            M.displayElement(Current.getName(), C[Current.getColor()], frame);
            // Complete the code
         
         }
         NodeInfo Node = G.refNode(B);
         while(Node!=null){
            // Complete the code
         
            M.displayElement(Node.getName(), C[Node.getColor()], frame);
            // Complete the code
         
         }
         // Code to color the states in the path your found
         
      }
   	
   }
