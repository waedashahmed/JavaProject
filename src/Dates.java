
public class Dates {
	private int day;
	private int month;
	private int year;

	public Dates(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String toString() {
		return String.format("%02d/%02d/%04d", month, day, year);
	}

}
