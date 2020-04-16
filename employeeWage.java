public class employeeWage {
	public static void main(String args[]){
		//constant
		final int fullTime = 1;
		final int partTime = 2;
		final int wagePerHour = 20;
		final int fullDayHour = 8;
		final int dayPerMonth = 20;
		//variable
		int dailyWage;
		int dailyHours;
		int monthlyWage = 0;
		//computation
		for ( int day=0 ; day<=dayPerMonth ; day++ )
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
			dailyWage = wagePerHour * dailyHours;
			monthlyWage += dailyWage;
		}
		System.out.println("Employee monthly wage is "+monthlyWage);
	}
} 
