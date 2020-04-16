public class employeeWage {

	private static final int fullTime = 1;
	private static final int partTime = 2;

	private static int employeeMonthlyWage( int wagePerHour, int fullDayHour, int dayPerMonth, int totalHours ) {
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
		return monthlyWage;
	}

	public static void main(String args[]){
		System.out.println("Employee monthly wage is "+employeeMonthlyWage(20, 8, 20, 100));
	}
}
