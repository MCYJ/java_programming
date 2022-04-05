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
		this.numerator = f1.numerator*f2.denominator + f2.numerator*f1.denominator;
		this.denominator = f1.denominator*f2.denominator;
	}
	// 분수 뺄셈 메소드
	public void subFraction(Fraction f1, Fraction f2) {
		this.numerator = f1.numerator*f2.denominator - f2.numerator*f1.denominator;
		this.denominator = f1.denominator*f2.denominator;
	}
	// 분수 곱셈 메소드
	public void mulFraction(Fraction f1, Fraction f2) {
		this.numerator = f1.numerator*f2.numerator;
		this.denominator = f1.denominator*f2.denominator;
	}
	// 분수 나눗셈 메소드
	public void divFraction(Fraction f1, Fraction f2) {
		this.numerator = f1.numerator*f2.denominator;
		this.denominator = f1.denominator*f2.numerator;
	}
	// 분수 약분 메소드
	public void simFraction() {
		int numerator = this.numerator;
		int denominator = this.denominator;
		// 피제수와 제수의 최소공배수를 구함
		int gcdNum = gcd(numerator, denominator);
		
		// 구한 최소공배수로 각각의 피제수와 제수를 나눗 몫을 다시 저장
		numerator /= gcdNum;
		denominator /= gcdNum;
		
		this.numerator = numerator;
		this.denominator = denominator;
	}
	public static int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a%b);
	}
	public static String printFraction(Fraction f) {
		String str = "";
		str += f.numerator;
		str += "/";
		str += f.denominator;
		
		return str;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, d1, n2, d2;
		
		// 분수1 정보입력
		System.out.print("분수1(분자 분모) 입력: ");
		n1 = sc.nextInt();
		d1 = sc.nextInt();
		// 분수1 인스턴스 생성
		Fraction f1 = new Fraction(n1, d1);
		
		// 분수2 정보입력
		System.out.print("분수2(분자 분모) 입력: ");
		n2 = sc.nextInt();
		d2 = sc.nextInt();
		// 분수2 인스턴스 생성
		Fraction f2 = new Fraction(n2, d2);
		
		// 계산결과 저장 위한 result 인스턴스 생성
		Fraction result = new Fraction();
		
		System.out.println("-----------------------");
		
		// 분수의 덧셈 출력
		result.addFraction(f1, f2);
		result.simFraction();
		System.out.println(printFraction(f1)+"+"+printFraction(f2)+"="+printFraction(result));
		
		// 분수의 뺄셈 출력
		result.subFraction(f1, f2);
		result.simFraction();
		System.out.println(printFraction(f1)+"-"+printFraction(f2)+"="+printFraction(result));
		
		// 분수의 곱셈 출력
		result.mulFraction(f1, f2);
		result.simFraction();
		System.out.println(printFraction(f1)+"x"+printFraction(f2)+"="+printFraction(result));
		
		// 분수의 나눗셈 출력
		result.divFraction(f1, f2);
		result.simFraction();
		System.out.println(printFraction(f1)+"/"+printFraction(f2)+"="+printFraction(result));
		
		
		// scanner 객체 close
		sc.close();
	}
}
