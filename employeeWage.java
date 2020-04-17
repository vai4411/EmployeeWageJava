import java.util.*;
public class employeeWage {

	private static final int fullTime = 1;
	private static final int partTime = 2;

	//variable
	private static String company;
	private static int wagePerHour;
	private static int fullDayHour;
	private static int totalHours;
	private static int dayPerMonth;
	private static int dailyWage, dailyHours, monthlyWage, hours, day;

	employeeWage( String company, int wagePerHour, int fullDayHour, int totalHours, int dayPerMonth) {
		this.company=company;
		this.wagePerHour = wagePerHour;
		this.fullDayHour = fullDayHour;
		this.totalHours = totalHours;
		this.dayPerMonth = dayPerMonth;
	}

	private static int employeeMonthlyWage() {
		int dailyWage = 0, dailyHours = 0, monthlyWage = 0, hours = 0, day = 0;
		//computation
		while ( hours <= totalHours && day <= dayPerMonth )
		{
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
				case fullTime:
					dailyHours = fullDayHour;
					break;
				case partTime:
					dailyHours = fullDayHour / 2;
					break;
				default:
					dailyHours = 0;
					break;
			}
			hours += dailyHours;
			day++;
			dailyWage = wagePerHour * dailyHours;
			monthlyWage += dailyWage;
      }
		return monthlyWage;
	}

	public static void main(String args[]){
		Map<String, Integer> company = new HashMap<>();
		employeeWage company1 = new employeeWage("Jio", 24, 8, 120, 20);
		company.put("Jio",company1.employeeMonthlyWage());
		employeeWage company2 = new employeeWage("Blab", 20, 8, 100, 20);
		company.put("Blab",company2.employeeMonthlyWage());
		System.out.println("Jio : "+company.get("Jio"));
		System.out.println("Blab : "+company.get("Blab"));  
	}
}
