import java.util.Scanner;

public class Fraction {
	// 분자필드
	int numerator;
	// 분모필드
	int denominator;
	// 분자와 분모를 1로 지정하는 생성자
	public Fraction() {
		this.numerator = 1;
		this.denominator = 1;
	}
	// 분자는 1로 지정, 분모는 d로 지정하는 생성자
	public Fraction(int d) {
		this.numerator = 1;
		this.denominator = d;
	}
	// 분자는 n, 분모는 d로 지정하는 생성자
	public Fraction(int n, int d) {
		this.numerator = n;
		this.denominator = d;
	}
	
	// 분수 덧셈 메소드
	public void addFraction(Fraction f1, Fraction f2) {
		
	}
	// 분수 뺄셈 메소드
	public void subFraction() {
		
	}
	// 분수 곱셈 메소드
	public void mulFraction() {
		
	}
	// 분수 나눗셈 메소드
	public void divFraction() {
		
	}
	// 분수 약분 메소드
	public void simFraction() {
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, d1, n2, d2;
		
		System.out.print("분수1(분자 분모) 입력: ");
		n1 = sc.nextInt();
		d1 = sc.nextInt();
		Fraction f1 = new Fraction(n1, d1);
		
		System.out.print("분수2(분자 분모) 입력: ");
		n2 = sc.nextInt();
		d2 = sc.nextInt();
		Fraction f2 = new Fraction(n2, d2);
		
	//	addFraction(f1, f2);
	//	System.out.println(n1+" "+d1+" "+n2+" "+d2);
	}
}
