
import java.util.*;
class ComputeEmployeeWage {
	//constant
	private static final int fullTime = 1;
	private static final int partTime = 2;
	private static final int fullDayHour = 8;
	//variable
	private static String company;
	private static int wagePerHour;
	private static int totalHours;
	private static int dayPerMonth;
	private static int dailyWage;
	private static int entry;

	public static HashMap<Integer, Integer> companyWage = new HashMap<>();
	public static ArrayList <Integer> wagePerCompany = new ArrayList <>();

	ComputeEmployeeWage( String company, int wagePerHour, int totalHours, int dayPerMonth) {
		this.company=company;
		this.wagePerHour = wagePerHour;
		this.totalHours = totalHours;
		this.dayPerMonth = dayPerMonth;
	}

	public String getCompany() {
		return this.company;
	}

	public static int employeeDailyWage() {
		dailyWage = fullDayHour * wagePerHour;
		return dailyWage;
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

	public static void dailyWageAndMonthlyWage() {
		companyWage.put(employeeDailyWage(), employeeMonthlyWage());
		entry++;
	}

	public static void printWage() {
		for (int i: companyWage.keySet())
			System.out.println(i+" : "+companyWage.get(i));
	}

	public static void companyWages() {
		wagePerCompany.add(employeeMonthlyWage());
	}

	public static void printCompanyWage() {
		System.out.println(wagePerCompany);
	}

}

public class employeeWage {

	public static void main(String args[]){
		ComputeEmployeeWage company1 = new ComputeEmployeeWage("Jio", 24, 120, 20);
		company1.dailyWageAndMonthlyWage();
		ComputeEmployeeWage company2 = new ComputeEmployeeWage("Blab", 20, 100, 20);
		company2.dailyWageAndMonthlyWage();
		company2.printWage();
	}
}
