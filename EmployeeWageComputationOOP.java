package employeeWageComputationOOP;

public class EmployeeWageComputationOOP {

	public static void main(String[] args) {
		int attendance = (int) Math.floor((Math.random() * 3));
		int wages = 20;
		switch (attendance) {
		case 0:
			int empHrs = 4;
			System.out.println("Employee is Present and worked Part Time: \n Employee Wage is " + empHrs * wages);
			break;
		case 1:
			int empHr = 8;
			System.out.println(" Employee is Present and worked Full Time: \n Employee Wage is " + empHr * wages);
			break;
		case 2:
			System.out.println(" Employee is absent \n Wage is 0 ");
			break;
		}
		
	}

}
