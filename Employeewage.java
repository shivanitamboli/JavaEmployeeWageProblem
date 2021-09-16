package UC;

public class Employeewage {
	public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        int empHrs = 0;
        int empwage = 0;
        double empCheck = Math.floor(Math.random()* 10) %2;
    if (empCheck == IS_FULL_TIME)
       {
         empHrs = 8;
       }
    else
       {
         empHrs = 0;
       }
      empwage = empHrs*EMP_RATE_PER_HOUR; 
      System.out.println("Emp Wage :" + empwage);
    }
	}


