
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
	private static int dailyWage = 0;
	private static int total = 0;

	public static HashMap<Integer, Integer> companyWage = new HashMap<>();
	public static ArrayList <Integer> wagePerCompany = new ArrayList <>();
	public static HashMap<String, Integer> companyMonthlyWage = new HashMap<>();

	ComputeEmployeeWage( String company, int wagePerHour, int totalHours, int dayPerMonth) {
		this.company=company;
		this.wagePerHour = wagePerHour;
		this.totalHours = totalHours;
		this.dayPerMonth = dayPerMonth;
	}

	public static int employeeDailyWage() {
		dailyWage = fullDayHour * wagePerHour;
		return dailyWage;
	}

	public static int employeeMonthlyWage() {
		int dailyHours = 0, monthlyWage = 0, hours = 0, day = 0;
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

	public static void putTotalWage() {
		companyMonthlyWage.put(company, employeeMonthlyWage());
	}

	public static void getTotalWage(String company) {
		System.out.println(company+" : "+companyMonthlyWage.get(company));
	}
}

public class employeeWage {
	public static void main(String args[]){
		ComputeEmployeeWage company1 = new ComputeEmployeeWage("Jio", 24, 120, 20);
		company1.putTotalWage();
		ComputeEmployeeWage company2 = new ComputeEmployeeWage("Blab", 20, 100, 20);
		company2.putTotalWage();
		company2.getTotalWage("Jio");
	}
}
