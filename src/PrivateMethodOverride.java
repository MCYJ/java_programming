
public class PrivateMethodOverride {
	public static void main(String[] args) {
		// upcasting
		A a = new B();
		// dynamic binding
		a.hi(65); // "hi B"
	}
}

class A {
	private int a = 20;
	void hi(int x) {
		System.out.println("hi A"+x);
	}
	int getA() {
		return a;
	}
}

class B extends A {
	public B() {
		System.out.println(getA());
	}
	void hi(int x) {
		System.out.println("hi B"+x);
	}
}