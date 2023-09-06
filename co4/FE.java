import java.util.Scanner;
class Fib implements Runnable
{
	public void run()
	{
		int n,a=0,b=1,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		n=sc.nextInt();
		System.out.println("Fibonocci are:");
		while(n>0)
		{
			System.out.println(c+" ");
			a=b;
			b=c;
			c=a+b;
			n=n-1;
			if(n%10==0)
			{
				System.out.println("\n");
			}
		}
	}
}
class Even implements Runnable
{
	public void run()
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		n=sc.nextInt();
		System.out.println("Even numbers are:");
		for(int i=1;i<n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" ");
			}
		}
	}
}
class FE
{
	public static void main(String args[])
	{
		Fib ob=new Fib();
		Thread t1=new Thread(ob);
		t1.run();
		Even obj=new Even();
		Thread t2=new Thread(obj);
		t2.run();
	}
}