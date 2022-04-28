package basic_concepts;

public class Test01<T extends Number>
{
	public void show(T t)
	{
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		Test01<Number>  tt=new Test01 <Number>();
		tt.show(new Double(10.5));
		
	}

}
