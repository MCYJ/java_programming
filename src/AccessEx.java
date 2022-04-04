
public class AccessEx {
	public static void main(String[] args) {
		Sample aClass = new Sample();
		
		// public이기 때문에 pass
		aClass.a = 10;
		// private이기 때문에 error
		// aClass.b = 10;
		// 같은 package에 존재하기 때문에 pass
		aClass.c = 10;
	}
}

class Sample{
	public int a;
	private int b;
	int c;
}