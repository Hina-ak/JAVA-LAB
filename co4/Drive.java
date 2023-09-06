import graphics.areacal;
import graphics.rectangle;
import graphics.square;
import java.util.Scanner;
public class Drive
{
	public static void main(String args[])
	{
	int ch;
	Scanner sc=new Scanner(System.in);
	rectangle ob1=new rectangle();
	square ob2=new square();
	
	do
	{
		System.out.println("\n1.rectangle\n2.squaree\n3.exit");
		System.out.println("Enter the option:");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:ob1.area();
				break;
			case 2:ob2.area();
				break;
			case 3:System.out.println("Exiting..");
				System.exit(0);
		}
	}
	while(true);
}
}