   import java.util.*;

    public class MajorOrder implements Comparator<Student>{
   
       public int compare(Student left, Student right){
         return left.getMajor().compareTo(right.getMajor());
      }
   	
   }