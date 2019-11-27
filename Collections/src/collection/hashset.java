package collection;
import java.util.*;
public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ac,pr;
		String cot;
		String cable;
		String wifi;
		String laundry;
		int total=0,b=0,c,d,e,f,i=0,n;
		Scanner s=new Scanner(System.in);
		HashSet<Employe>set=new HashSet<Employe>();
		Employe[]ec=new Employe[40];
		do
		{
		System.out.println("Menu");
		System.out.println("1)Book\n2)Check Status\n3)Exit");
		System.out.println("Enter your choice");
		n=s.nextInt();
		System.out.println("Booking:");
		System.out.println("Please choose the service required");
		System.out.println("AC/Non-AC(AC/nAC)");
		ac=s.next();
		if(ac.contentEquals("AC")==true)
		{
		b=500;
		ec[i].setAc(b);
		}
		else
		{
		b=700;
		ec[i].setAc(b);
		}
		System.out.println("Cot(Single/Double)");
		cot=s.next();
		if(cot.contentEquals("Single")==true)
		{
		c=50;
		ec[i].setCot(c);
		}
		else
		{
		c=100;
		ec[i].setCot(c);
		}
		System.out.println("With cable connection/without cable connection(C/nC)");
		cable=s.next();
		if(cable.contentEquals("C")==true)
		{
		d=50;
		ec[i].setCable(d);
		}
		else
		{
		d=0;
		}
		System.out.println("Wi-Fi needed or not(W/nW)");
		wifi=s.next();
		if(wifi.contentEquals("W")==true)
		{
		e=200;
		}
		else
		{
		e=0;
		}
		System.out.println("Laundry service needed or not(L/nL)");
		laundry=s.next();
		if(laundry.contentEquals("L")==true)
		{
		f=100;
		}
		else
		{
		f=0;
		}
		total=b+c+d+e+f;
		System.out.println("The total charge RS."+total);
		System.out.println("The services chosen are");
		System.out.println(ac);
		System.out.println(cot);
		System.out.println(cable);
		System.out.println(wifi);
		System.out.println(laundry);
		System.out.println("Do you want to proceed");
		pr=s.next();
		}while(pr.equals("no"));
		if(pr.contentEquals("yes")==true)
		{
		int[] booked = null;
		booked[i]=1;
		System.out.println("Thank you your room number is"+i);
		i=i+1;
		}
		}
		}
