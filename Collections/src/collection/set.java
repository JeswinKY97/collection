package collection;
import java.util.*;

public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set=new HashSet<String>();
		set.add("bucati");
		set.add("lamborgini");
		set.add("bently");
		set.add("bucati");
		set.add("ferrari");
		set.add("rollsroyce");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		
		
		}
		
	}

}
