
package basic_concepts;

import java.util.Scanner;

public class Product {
	private int pid;
	String pname;
	int qty;
	double price;
	
	void getInfo()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Product ID= ");
		pid=input.nextInt();
		
		input.nextLine();
		System.out.println("Enter Product name= ");
		pname=input.nextLine();
		
		System.out.println("Enter quantity= ");
		qty=input.nextInt();
		
		System.out.println("Enter Price= ");
		price=input.nextDouble();
	}
	
	void display()
	{
		System.out.println(" Product ID= "+pid);
		System.out.println("Product name= "+pname);
		
		System.out.println("Total Price for "+qty+" pieces= "+calcBill());
	}
	
	double calcBill()
	{
		return qty*price;
	}
	
	public static void main(String[] args) {
		
		
		Product p[]=new Product[2];
		
		for (int i=0; i<p.length;i++)
		{
			 p[i]=new Product();
			 p[i].getInfo();
			
		}
		
		for(int i=0; i<p.length;i++)
		{
			p[i].display();
		}
		
	}
	

}
