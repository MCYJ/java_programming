import java.util.*;

public class Practice5 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		while(v.size() != 6) {
			int num = (int)(44*Math.random()+1);
			int duplicated = 0;
			for(int n : v) {
				if(n == num) duplicated = 1;
			}
			if(duplicated == 0) v.add(num);
		}
		Collections.sort(v);
		while(v.size() != 7) {
			int num = (int)(44*Math.random()+1);
			int duplicated = 0;
			for(int n : v) {
				if(n == num) duplicated = 1;
			}
			if(duplicated == 0) v.add(num);
		}
		for(int i=0;i<v.size();i++) {
			if(i == v.size()-1)
				System.out.print("+ "+v.get(i));
			else
				System.out.print(v.get(i)+" ");
		}
	}
}
