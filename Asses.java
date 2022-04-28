package basic_concepts;

import java.util.LinkedList;

public class Asses {

	public static void main(String[] args) 
	{
		LinkedList<String> lst=new LinkedList<String>();
		lst.add("Cobol");
		lst.add("JCL");
		lst.add("C++");
		lst.add("C#");
		lst.add("Java");
		lst.set(2, "Python");
		
		for (String str : lst) 
		{
			System.out.println(str);
		}
		
		String a[]=new String[5];
		System.out.println(a.length);

	}

}
