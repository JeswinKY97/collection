package collection;
import java.util.*;

public class remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int n=s.nextInt();
		int i=0;
		String op;
		String name,address,contact,email,prooftype,proofid;
		System.out.println("Registration");
		ArrayList list=new ArrayList();
		Details[] emp=new Details[n];

		for(i=0;i<n;i++)
		{
		System.out.println("Enter your name");
		name=s.next();
		System.out.println("Enter your address");
		address=s.next();
		System.out.println("Contact number");
		contact=s.next();
		System.out.println("E-mail ID");
		email=s.next();
		System.out.println("Enter prooftype");
		prooftype=s.next();
		System.out.println("Enter proofid");
		proofid=s.next();
		emp[i]=new Details();
		System.out.println("Do you want to update the email id?(yes/no");
		String m=s.next();
		if(m.equals("yes"))
		{
		System.out.println("Enter the new email");
		String update=s.next();
		emp[i].setProoftype(prooftype);
		emp[i].setProofid(proofid);
		emp[i].setEmail(update);
		emp[i].setContact(contact);
		emp[i].setAddress(address);
		emp[i].setName(name);
		}
		else
		{
		emp[i].setProoftype(prooftype);
		emp[i].setProofid(proofid);
		emp[i].setEmail(email);
		emp[i].setContact(contact);
		emp[i].setAddress(address);
		emp[i].setName(name);
		}
		list.add(emp[i]);
		}
		Iterator <Details> itr=list. iterator();
		int j=1;
		while(itr.hasNext())
		{
		Details e=itr.next();
		System.out.println("Employee details" +j);
		System.out.println("********************");
		System.out.println("Name->"+e.getName());
		System.out.println("Address->"+e.getAddress());
		System.out.println("Contact->"+e.getContact());
		System.out.println("Email->"+e.getEmail());
		System.out.println("Prooftype->"+e.getProoftype());
		System.out.println("Proofid->"+e.getProofid());
		System.out.println(" ");
		j++;
		}
		System.out.println("Do you want to delete any customer(yes/no)");
		{



		String del=s.next();
		String del1=del.toLowerCase();
		if(del.equals("yes"))
		{
		System.out.println("enter the index of customer");
		int index=s.nextInt();
		list.remove(index);

		}
		Iterator<Details> itr2=list.iterator();
		int l=1;
		while(itr2.hasNext())
		{
		Details r=itr2.next();
		System.out.println("Employee details" +l);
		System.out.println("Name->"+r.getName());
		System.out.println("Address->"+r.getAddress());
		System.out.println("Contact->"+r.getContact());
		System.out.println("Email->"+r.getEmail());
		System.out.println("Prooftype->"+r.getProoftype());
		System.out.println("Proofid->"+r.getProofid());
		System.out.println(" ");
		l++;
		}

		}
		}


		}
