package UC;

public class Employeewage {
	public static void main(String[] args) {
		int IS_PART_Time= 1;
        int IS_FULL_Time = 2;
        int EMP_RATE_PER_HOUR = 20;
        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random()* 10) %2;
     if (empCheck == IS_PART_Time)
        {
            empHrs = 4;
            System.out.println("Employee is parttime");
        }
     else if (empCheck == IS_FULL_Time)
        {
            empHrs = 8;
            System.out.println("Employee is fulltime");
        }
     else
        {
            empHrs = 0;
            System.out.println("Employee is absent");
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("emp wage:" + empWage);
    }
	}


