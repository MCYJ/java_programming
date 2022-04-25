
public interface Shape {
	public static final int size = 100;
	
	default void getSize() {
		System.out.println(size);
	}
}
