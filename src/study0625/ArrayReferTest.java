package study0625;

public class ArrayReferTest {
	static void setArr(int arr[]) {
		
		for (int i = 0; i < arr.length; i++) {
			arr = new int[arr.length];
			arr[i] = 1;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = new int[5];
		
		setArr(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
