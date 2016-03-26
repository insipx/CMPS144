   import java.util.*;
   import java.io.*;
	
   import java.awt.*;
   import scranton.visual.*;

   public class WordFinder extends Thread{
   
      WordSearch W;
		WSViewer F;
      Color color;
   
      public WordFinder(WordSearch W, WSViewer F, Color c){
         this.W = W;
			this.F = F;
         this.color = c;
      }
   	
      public void run(){
         String word = W.getWord(color);
         while (!word.equals("")){
         
            boolean found = false;
            Direction d;
         	
            ArrayList<Coordinate> L = W.H.get(word.substring(0,1));
         	
            for(int c=0; (c<L.size()) && (!found); c++){
               int i = L.get(c).r;
               int j = L.get(c).c;
            //loop through all the coordinates, this is the loop that cuts the exhaustive loops out. Turns two loops into 1 loop
            	//search in all 8 directions
			for(Directions Dir=new Directions(); (!found) && (Dir.hasNext());){
				
				d=(Direction)Dir.next();
				//set found to true or false, true if the word is found false if not
				found= W.match(i,j,word,d);

				//If it is found, display it, and write to the console
				if(found){
					 W.displayWord(i,j, word, d,color );
					 //F.cellBack does some voodoo which messes up the colors, so I just removed it. It works better that way. It's pretty that way.
					// F.cellBack(i, j, Color.black, color);
					 F.cellContent(i, j, W.mat[i][j], Color.black);
					 System.out.println(word + "found at ("+ i + ","+ j +") heading "+d.getName());
				}
				
			}
              /* Add code to find the word, then use calls like
			
               * F.cellBack(i, j, Color.black, color);
               * F.cellContent(i, j, W.mat[i][j], Color.black);
					* to display and undisplay the word.
            	*/
            
            }
            if(!found)
               System.out.println(word+" not found");
         
            word = W.getWord(color);
         }
      }

   	
   
   }
