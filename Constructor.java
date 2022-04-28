package basic_concepts;

public class Constructor {
	int a;


	public Constructor(int a) {

		this.a=10;
	}


	public static void main(String[] args) {

		Constructor c=new Constructor(20);
		System.out.println(c.a);


	}

}
