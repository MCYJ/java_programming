import java.util.*;

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int turn = sc.nextInt();

		if(turn != 0) {
			int print = (turn > 0) ? str.length()/turn : str.length()/-turn;
			int flag = turn;
			// 출력횟수 str.length/turn
			for(int i=0;i<print;i++) {
				for(int j=(str.length()+flag)%str.length();j<(flag+str.length())%str.length()+str.length();j++) {
					System.out.print(str.charAt(j%str.length()));
				}
				flag += turn;
				System.out.println();
			}
		}
		else {
			System.out.println("종료함");
		}
		
		
		sc.close();
	}
}
