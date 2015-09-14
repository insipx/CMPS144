import java.util.*;

public class FSJSGAlphaOrder implements Comparator<Student>{

   public int compare(Student left, Student right){
      Comparator<Student> classOrder = new FSJSGOrder();
      Comparator<Student> alphaOrder = new StudentAlpha();
      int i = classOrder.compare(left, right);
  
      if (i == 0){return alphaOrder.compare(left, right);}
      else{ return classOrder.compare(left, right);}
      

   }

}