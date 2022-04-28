package basic_concepts;

import java.util.Scanner;
public class login {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter User ID= ");
		String id=input.next();
		
		System.out.println("Enter Password= ");
		String password=input.next();
		
		validate(id,password);
		
	}
	public static void validate(String id,String password)
	{
		
		if(id.equals("venu") && password.equals("venu123"))
		{
			System.out.println("Login successfull");
		}
		else
		{
			System.out.println("Invalid credentials");
		}
		

	}

}
