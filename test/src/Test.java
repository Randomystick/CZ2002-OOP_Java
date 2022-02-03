class A {
	public void fun(int d){
		System.out.println("AA");
	}
}

class B extends A {
	public void fun(int o)
	{
		System.out.println("BB");
	}
}

public class Test {
	public static void main(String[] args) {
		B b = new B();
		b.fun(6);
	}
}

// runtime:
// if the superclass has a more suitable method, use that
// if both equally suitable, select your own class'