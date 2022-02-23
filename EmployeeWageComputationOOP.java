package employeeWageComputationOOP;

public class EmployeeWageComputationOOP {

	public static void main(String[] args) {
		//constants
		int IS_PART_TIME = 1;
		int IS_FULL_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		//variable
		int empHrs= 0;
		int empWage = 0;
		double attendance = Math.floor((Math.random() * 10) % 3);

		if (attendance == IS_FULL_TIME) {

			System.out.println("Employee is present and worked full time. "); 
			empHrs=8;
			empWage = empHrs * EMP_RATE_PER_HOUR;
			System.out.println("Emp Wage: " + empWage);
		} 
		else if(attendance == IS_PART_TIME)
		{
			System.out.println("Employee is present and worked half time. ");
				empHrs = 4;
			empWage = empHrs * EMP_RATE_PER_HOUR;
			System.out.println("Emp Wage: " + empWage);
		}
		

	}

}
