package collection;
import java.util.*;

public class linkedlist {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Size");
		int n=s.nextInt();
		LinkedList<String> list=new LinkedList<String>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Name");  name=s.next();
			
			list.add(name);
			System.out.println("Age");
			String age=s.next();
			list.add(age);
			System.out.println("Work");
			String work=s.next();
			list.add(work);
			System.out.println("Place");
			String place=s.next();
			list.add(place);
			System.out.println("Salary");
			String sal=s.next();
			list.add(sal);
		}
		
		System.out.println("Size of List "+list.size());
		System.out.println("list is "+list.isEmpty());
		s.close();
	}

}
