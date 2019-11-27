package collection;

import java.util.*;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the size");
		int n = s.nextInt();
		ArrayList list = new ArrayList();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the name");
			String name = s.next();
			System.out.println("Enter the age");
			int age = s.nextInt();
			list.add(name);
			list.add(age);                           //      /,\     /,\
			                                          //          ^
			                                            //      (_-_-_)

			ArrayList list1=(ArrayList) list.clone();
			System.out.println("clone value"+list1.get(0));
			list1.remove(0);
			System.out.println(list1.get(0));
			System.out.println("List One values");
			Iterator itr = list.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());

			}
		}
	}

}
