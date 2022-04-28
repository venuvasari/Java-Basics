package basic_concepts;

import java.util.EnumSet;

enum KFC
{
	welcome,
	To,
	The,
	world,
	of,
	java
};
public class Brand 
{

	public static void main(String[] args) {
		EnumSet<KFC> e_set1, e_set2;
		e_set1=EnumSet.of(KFC.The,KFC.java);
		e_set2= EnumSet.of(KFC.java, KFC.welcome);
		System.out.println("The enum set is: " +e_set1 + e_set2);
		
		

	}

}
