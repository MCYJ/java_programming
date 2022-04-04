import java.util.Scanner;

public class Song {
	// 곡정보 선언
	String title, artist, year, country;
	
	public static void main(String[] args) {
		// scanner 객체 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		// 곡정보에 대한 자료입력
		String title = sc.nextLine();
		String artist = sc.nextLine();
		String year = sc.nextLine();
		String country = sc.nextLine();
		
		// scanner를 통해 입력된 자료를 활용하여 매개변수 있는 생성자를 활용하여 인스턴스 생성
		Song song = new Song(title, artist, year, country);
		song.show();
		
		// 매개변수 없는 생성자를 활용하여 인스턴스 생성
		Song song2 = new Song();
		song2.show();
		

		// scanner 객체 close
		sc.close();
	}
	
	
	// 매개변수 없는 생성자의 경우, 곡정보를 생성자에서 입력
	public Song() {
		this.title = "아무 노래";
		this.artist = "지코";
		this.year = "2020";
		this.country = "대한민국";
	}
	
	// 매개변수 있는 생성자의 경우, 곡정보를 매개변수를 통해 입력
	public Song(String title, String artist, String year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	// 곡정보 출력 메소드
	public void show() {
		System.out.println("Song 정보: "+this.year+"년, "+country+" 국적의 "+this.artist+"가 부른 \""+this.title+"\"");
	}
}
