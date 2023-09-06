import java.util.Scanner;
class UsernameException extends Exception
{
	public UsernameException(String str)
	{
		System.out.println(str);
	}
}
class Checkn
{
	public static void main(String args[])
	{
		float num,count=0,sum=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("total number::");
		n=sc.nextInt();
		System.out.println("Enter the number::");
		for(int i=0;i<n;i++)
		{
			try
			{
				num=sc.nextInt();
				if(num>0)
				{
				sum=sum+num;
				count++;
				}
				else throw new UsernameException("Number is negative!!!");
			}
			catch (UsernameException e)
			{
				System.out.println("Exception ocuures..");
			}
		}
		System.out.println("Average is:");
		System.out.println(sum/count);
	}
}