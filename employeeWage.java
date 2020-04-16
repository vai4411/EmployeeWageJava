public class employeeWage {
	public static void main(String args[]){
		//constant
		final int fullTime = 1;
		final int wagePerHour = 20;
		final int fullDayHour = 8;
		//variable
		int dailyWage;
		int dailyHours;
		//computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if ( empCheck == fullTime ){
			System.out.println("Employee is Present");
			dailyHours = fullDayHour;
		}
		else {
			System.out.println("Employee is Absent");
			dailyHours = 0;
		}
		System.out.println("Employee daily wage is "+(wagePerHour * dailyHours));
	}
} 
