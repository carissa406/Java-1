
public class DateTest {

	public static void main(String[] args) {
		java.util.Date date = new java.util.Date();
		long time = 10000;
		for(int i = 0; i < 8; i++) {
			date.setTime(time);
			System.out.println("The elapsed time since Jan 1, 1970 when time is set to " + date.getTime() + " milliseconds");
			System.out.println(date.toString() + "\n");
			time = time * 10;
		}
	}

}

