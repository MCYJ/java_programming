package study0625;

import java.util.*;

public class Main {
	static void setArr(int arr[][], int r, int c, int k) {
		arr = new int[arr.length][arr.length];
		// r,c 이 범위안에 있고, r과c의 방문없을 떄
		if(r<0 || r>=arr.length || c<0 || c>=arr.length || arr[r][c] == 1) {
			return;
		}
		else if(r == arr.length-1 && c == arr.length-1) {
			System.out.println(k);
		}
		else {
			arr[r][c] = 1;
			setArr(arr, r, c-1, k+1);
			setArr(arr, r-1, c, k+1);
			setArr(arr, r+1, c, k+1);
			setArr(arr, r, c+1, k+1);
		}
		
	}
	public static void main(String[] args) {
		int arr[][] = new int[3][3];
	//	arr[0][0] = 1;
		setArr(arr,0,0,0);
	}
}
