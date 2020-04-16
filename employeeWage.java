public class employeeWage {
	public static void main(String args[]){
		//constant
		final int fullTime = 1;
		final int partTime = 2;
		final int wagePerHour = 20;
		final int fullDayHour = 8;
		//variable
		int dailyWage;
		int dailyHours;
		//computation
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
		System.out.println("Employee daily wage is "+(wagePerHour * dailyHours));
	}
} 
