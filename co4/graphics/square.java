package graphics;
import java.util.Scanner;
public class square implements areacal
{
	int a;

	public void area()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side:");
		a=sc.nextInt();
		String area=Double.toString(a*a);
		System.out.println("Area of the sqaure:"+area);
	}
}