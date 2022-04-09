
public class StaticMethod {
	// non-static variable
	int n;
	
	// static variable
	static int m;
	
	// static method
	static void s1(int x) {
	// static method can't assign to the non-static member
	//	n = x; // error occurred
	// static method can't use 'this' keyword
	// this.n = x; // error occurred
		
		m = x;
	}
	
	public static void main(String[] args) {
		
	}
}

//final class
final class FinalClass { 
	
}

class FinalMethod {
	// final method
	final void hi() {
		System.out.println("hi!");
	}
}

class FinalInheritedClass // extends FinalClass // final class should be inherited 
{
	
}

class FinalInheritedMethod extends FinalMethod {
	/*
	 * final method can't be override
	 * error occurred
	void hi() {
		System.out.println("hi!!!!");
	}
	*/
}

