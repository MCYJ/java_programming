import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tot = 0;
		String a, b, opr="";
		int x,y;
		do {
			// 피연산자(a,b) 2개와 연산자(opr) 1개 입력
			a = sc.next();
			opr = sc.next();
			b = sc.next();

			try {
				// a,b는 int형태로 변경
				x = Integer.parseInt(a);
				y = Integer.parseInt(b);
				
				// 연산자(opr)에 따라 연산
				if(opr.equals("+")) {
					tot = x+y;
				} else if(opr.equals("-")) {
					tot = x-y;
				} else if(opr.equals("*")) {
					tot = x*y;
				} else if(opr.equals("/")) {
					tot = x/y;
				} else if(opr.equals("%")) {
					tot = x%y;
				} else if(opr.equals("=")){
					break;
				} else {
					// 5칙 연산밖의 문자를 연산자로 사용할 경우, 입력양식을 지킬 수 있도록 예외발생
					throw new NumberFormatException();
				}
			// 0으로 나누는 경우 exception 처리
			} catch(ArithmeticException e) {
				System.out.println("0으로는 나눌 수 없습니다!");
				continue;
			// number format이 맞지 않는 경우 exception 처리
			} catch (NumberFormatException e) {
				System.out.println("[숫자 연산자 숫자]의 입력양식을 지켜주세요!");
				continue;
			}
			
			// 연산자(opr)가 '='인경우 별도의 출력을 하지 않음
			if(!opr.equals("=")) {
				// 결과출력
				System.out.println("결과: "+tot);
			}
		// 연산자(opr)가 '='가 아닌 경우, while문 반복
		} while(!opr.equals("="));
		// scanner객체 close
		sc.close();
	}
}
