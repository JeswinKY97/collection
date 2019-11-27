package collection;
import java.util.*;
public class clearall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  ArrayList<String> list=new ArrayList<String>();
	      list.add("First");
	      list.add("Second");
	      list.add("Third");
	      list.add("Random");
	      System.out.println("Actual array list");
	      
	      Iterator itr1=list.iterator();
	      while(itr1.hasNext())
	      {
	        System.out.println(itr1.next());
	      }
	      list.clear();
	      System.out.println("Actual array list after clear []");

	      Iterator itr2=list.iterator();
	      while(itr2.hasNext())
	      {
	    	  System.out.println(itr2.next());  
	      }
	      
	      
	}

}
