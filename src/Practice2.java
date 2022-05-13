import java.util.*;

public class Practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String[] splitStr = str.split("/");
		
		int year = Integer.parseInt(splitStr[0]);
		int month = Integer.parseInt(splitStr[1]);
		int date = Integer.parseInt(splitStr[2]);
		
		// year가 뒤 두자리만 적힌 경우
		if(year/100 == 0) year += 2000;
		
		System.out.println(year+"년 "+month+"월 "+date+"일");
		
		sc.close();
	}
}
