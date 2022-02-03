class A1{
	public void fun (Object d) {
		System.out.println("A");
	}
}

class C extends A1{
	public void fun (int i) {
		System.out.println("C");
	}
}

public class lol {
	public static void main(String[] args)
	{
		A1 x = new C();
		x.fun(6);
	}
}

// compile time:
// if you need to static bind due to required upcasting,
// just select the "close enough" method in reference
// type and convert the input.