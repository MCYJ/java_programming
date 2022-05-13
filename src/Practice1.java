import java.util.Calendar;

public class Practice1 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		System.out.println(year+"년 "+month+"월 "+date+"일");
		System.out.println(hour+"시 "+minute+"분 "+second+"초");
	}
}
