import java.util.*;
class ComputeEmployeeWage {
	//constant
	private static final int fullTime = 1;
	private static final int partTime = 2;
	//variable
	private static String company;
	private static int wagePerHour;
	private static int totalHours;
	private static int dayPerMonth;

	ComputeEmployeeWage( String company, int wagePerHour, int totalHours, int dayPerMonth) {
		this.company=company;
		this.wagePerHour = wagePerHour;
		this.totalHours = totalHours;
		this.dayPerMonth = dayPerMonth;
	}

	public String getCompany() {
		return this.company;
	}

	public static int employeeMonthlyWage() {
		int dailyWage = 0, dailyHours = 0, monthlyWage = 0, hours = 0, day = 0, fullDayHour = 8;
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
}

public class employeeWage {

	public static ArrayList <Integer> company = new ArrayList <Integer>();

	public static void main(String args[]){
		ComputeEmployeeWage company1 = new ComputeEmployeeWage("Jio", 24, 120, 20);
		ComputeEmployeeWage company2 = new ComputeEmployeeWage("Blab", 20, 100, 20);
		company.add(company1.employeeMonthlyWage());
		company.add(company2.employeeMonthlyWage());
		System.out.println(company);
	}
}
