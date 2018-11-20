import java.util.*;
import java.lang.*;

class StudentInput implements Runnable
{
	String name;
	int n,rno;
	float cgpa;
	public void run()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the no.of the student : ");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
		System.out.print("Enter the Student Roll No : ");
		rno=s.nextInt();
		System.out.print("Enter the Student Name : ");
		name=s.next();
		System.out.print("Enter the Student CGPA : ");
		cgpa=s.nextFloat();

		try{Thread.sleep(1000);} catch(Exception e){}
		}
	}
}
class Department extends StudentInput implements Runnable 
{
		
	public void run()
	{
		
			System.out.println("MCA Department Student Details");
try{Thread.sleep(1000);} catch(Exception e){}

		
		
	}
}

public class Student
{
	public static void main(String[] arg)
		{
		Runnable o1=new StudentInput();
		Runnable o2=new Department();
		
		Thread t1=new Thread(o1);
		Thread t2=new Thread(o2);
		t1.start();
		try{Thread.sleep(10);} catch(Exception e){}
		
		t2.start();
}
}