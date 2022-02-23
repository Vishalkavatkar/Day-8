package lineComparison;

import java.util.Scanner;

public class LineComparison {
	//method
	static double calculateLengthLine(double x1,double x2,double y1,double y2) {
	 	 double length_of_line=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		 return length_of_line;
		 
	 	 
	  }
		
		//equal and compareTo method
		public void checkEquality(String s1,String s2) {
			if(s1.equals(s2)) 
			{
		    	System.out.println("Two line are equal");
		    }
		    else if(s1.compareTo(s2)>0)
		    {
	     	    System.out.println("length of line1 is greater than length of line2");
		    }
		    else 
		    {
		    	System.out.println("length of line2 is greater than length of line1");
		    }
		}
		
	  public static void main(String[] args) {
		 
		   //Taking inputs from user
			Scanner scanner= new Scanner(System.in);
		    System.out.println("enter points of first line and second line");
		       
		       double x1=scanner.nextDouble();
		       double y1=scanner.nextDouble();
		       double x2=scanner.nextDouble();
		       double y2=scanner.nextDouble();
		       
		     System.out.println("enter points of second line and second line");
		     
		       double p1=scanner.nextDouble();
		       double q1=scanner.nextDouble();
		       double p2=scanner.nextDouble();
		       double q2=scanner.nextDouble();
		       
		       //calling the method
		       double length1 = calculateLengthLine(x1,x2,y1,y2);
		       double length2 = calculateLengthLine(p1,p2,q1,q2);
		       
		       //converting double to string
		       String s1=String.valueOf(length1);
		       String s2=String.valueOf(length2);
		       
		       LineComparison compare =new LineComparison();
		       compare.checkEquality(s1, s2);
		       
		            
		       scanner.close();
		       
	 }

}