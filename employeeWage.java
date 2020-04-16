public class employeeWage {
	public static void main(String args[]){

		//constant
		final int fullTime=1;
		//computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if ( empCheck == fullTime )
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
} 
