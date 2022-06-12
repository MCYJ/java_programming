package class0612;

import java.util.*;

public class VectorTest {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(1);
		System.out.println(v.size());
		
		// remove all elements in vector
		v.removeAllElements();
		
		System.out.println(v.size());
	}
}
