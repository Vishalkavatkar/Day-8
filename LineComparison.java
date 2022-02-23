package lineComparison;

import java.util.Scanner;

public class LineComparison {
	//Method to compute length of line
		static void calculateLengthLine(double x1,double x2,double y1,double y2) 
		{
	 	 double length_of_line=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		 System.out.println("Length of the line is  :"+length_of_line);
	 	 
		}
		
	  public static void main(String[] args) {
		 
		   //Taking inputs from user
			Scanner scanner= new Scanner(System.in);
		    System.out.println("enter points of first line and second line");
		       
		       double x1=scanner.nextDouble();
		       double y1=scanner.nextDouble();
		       double x2=scanner.nextDouble();
		       double y2=scanner.nextDouble();
		       
		       //calling the method
		       calculateLengthLine(x1,x2,y1,y2);
		       
		    scanner.close();
		       
	 }

}