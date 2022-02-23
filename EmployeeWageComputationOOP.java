package employeeWageComputationOOP;

public class EmployeeWageComputationOOP {

	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;
		
		int empHrs= 0;
		int empWage = 0;
		double attendance = Math.floor((Math.random() * 10) % 2);

		if (attendance == IS_FULL_TIME) {

			System.out.println(" Employee is present. "); 
			empHrs=8;
			empWage = empHrs * EMP_RATE_PER_HOUR;
			System.out.println("Emp Wage: " + empWage);
		} 
		else 
		{
			System.out.println(" Employee is absent. ");
		}
		

	}

}
