import java.util.Scanner;
class Mult extends Thread
{
	public void run()
	{
		System.out.println("Multiplication table");
		for(int i=1;i<10;i++)
		{
			System.out.println(i+"*"+5+"="+(i*5));
		}
		
	}
}
class Prime extends Thread
{
	public void run()
	{
		int count,i=1,j,n,no=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		n=sc.nextInt();
		System.out.println("Prime numbers are:");
		while(no!=n)
		{	
			count=0;
			for( j=2;j<i/2;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}

			}
			if(count==0 && i!=1)
			{
				System.out.print(i+" ");
				no++;
			}
			i++;
		}
	}
}