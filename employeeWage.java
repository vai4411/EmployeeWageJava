public class employeeWage {

	private static final int fullTime = 1;
	private static final int partTime = 2;

	private static String company;
	private static int wagePerHour;
	private static int fullDayHour;
	private static int totalHours;
	private static int dayPerMonth;

	employeeWage( String company, int wagePerHour, int fullDayHour, int totalHours, int dayPerMonth) {
		this.company=company;
		this.wagePerHour = wagePerHour;
		this.fullDayHour = fullDayHour;
		this.totalHours = totalHours;
		this.dayPerMonth = dayPerMonth;
	}

	private static void employeeMonthlyWage() {
		//variable
		int dailyWage;
		int dailyHours;
		int monthlyWage = 0;
		int hours = 0;
		int day = 0;
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
		System.out.println("Monthly Wage of "+company+" is: "+monthlyWage);
	}

	public static void main(String args[]){
		employeeWage company1 = new employeeWage("Jio", 24, 8, 120, 20);
		company1.employeeMonthlyWage();
		employeeWage company2 = new employeeWage("Blab", 20, 8, 100, 20);
		company2.employeeMonthlyWage();  
	}
}
