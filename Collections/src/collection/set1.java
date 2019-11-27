package collection;

import java.util.*;

public class set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String symbol;
		int num,count=0;
		Scanner s=new Scanner(System.in);
		Set<NewCard> se=new TreeSet<NewCard>(new Symbol());
		NewCard[] c=new NewCard[40];
		int n=s.nextInt();
		
		while(se.size()<n)
		{
			symbol=s.next();
			num=s.nextInt();
			c[count]=new NewCard();
			c[count].setSymbol(symbol);
			c[count].setNum(num);
			se.add(c[count]);
			count++;
		
		}
		System.out.println(n+"symbols gathered "+count+" cards.");
		System.out.println("Cards are ");
		
		Iterator<NewCard> itr=se.iterator();
		while(itr.hasNext())
		{
			NewCard ca=(NewCard)itr.next();
			System.out.println(ca.getSymbol()+" "+ca.getNum());
		}
	}

}
