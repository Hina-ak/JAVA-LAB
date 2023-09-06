package graphics;
import java.util.Scanner;
public class rectangle implements areacal
{
	int l,b;
	public void area()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length:");
	l=sc.nextInt();
	System.out.println("Enter the breadth:");
	b=sc.nextInt();
	System.out.println("Area of rectangle:"+l*b);
}
}