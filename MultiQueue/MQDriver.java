
   import java.io.*;
   import scranton.queue.Queue;
   import scranton.queue.QueueViaStandard;
   import java.util.*;

    class MQDriver {
   
       public static void main(String args[]) throws IOException {
         final int n = 5;
         Queue<String>[] q = new QueueViaStandard[n];
         for(int i=0; i< n; i++) q[i] = new QueueViaStandard<String>();
         BufferedReader inBuf = new BufferedReader(new FileReader("MultiQ.txt"));
         while (inBuf.ready()){
            StringTokenizer Token = new StringTokenizer(inBuf.readLine(), "\t");
            String sym = Token.nextToken();
            int num = Integer.parseInt(Token.nextToken());
            if(sym.equals("#")){
               // System.out.print the contents of the "num" queue



            } 
            else {
               // Place the "sym" into "num" queue



            }
         }
      }
   }