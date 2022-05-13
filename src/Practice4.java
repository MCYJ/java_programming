import java.util.*;

public class Practice4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vector<String> v = new Vector<String>();
		String str = sc.next();
		
		StringTokenizer st = new StringTokenizer(str, "+-", true);
		
		while(st.hasMoreTokens()) {
			v.add(st.nextToken());
		}
		String temp;
		int sign = 1;
		int result = 0;
		for(int i=0;i<v.size()-1;i++) {
			temp = v.get(i);
			// 부호인 경우
			if(temp.equals("+") || temp.equals("-")) {
				// 부호가 겹칠 경우 program 종료
				if(v.get(i+1).equals("+") || v.get(i+1).equals("-"))
					return;
				// 부호가 +일때 sign을 1, -일때 sign을 -1로 설정
				if(temp.equals("+")) sign = 1;
				else sign = -1;
			}
			// 숫자인 경우
			else {
				// 부호와 숫자를 곱해서 result에 누적합
				result += sign*Integer.parseInt(v.get(i));
			}
		}
		// 마지막 숫자 반영
		result += sign*Integer.parseInt(v.get(v.size()-1));
		System.out.println(result);
		
		sc.close();
	}
}
