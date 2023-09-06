import java.util.Scanner;
class UsernameException extends Exception
{
	public UsernameException (String str)
	{
		System.out.println(str);
	}
}
public class  Check
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String username,password;
		String uname="nandhitha";
		String pwd="2000";
		
		System.out.println("Enter the username::");
		username=sc.nextLine();
		System.out.println("Enter the password::");
		password=sc.nextLine();
		
		try
		{
			if( (username.equals(uname)) && (password.equals(pwd)) )
				
			{
				System.out.println("Login success");
			}
			else
			{
				throw new UsernameException("username or password not matching..");
			}
		}
		catch (UsernameException u)
		{
			System.out.println("Exception occured..");
		}
	}
}