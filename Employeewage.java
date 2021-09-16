package UC;

public class Employeewage {
	public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static final int EMP_WAGE_PER_HOUR = 20;
    public static final int WORKING_DAYS = 20;
    public static int Totalwage=0;

    public static void main(String[] args) {
        int WorkHours = 0;
        int Day;
        for (Day = 1; Day < WORKING_DAYS; Day++) {  
            System.out.println(" Wage for Day " + Day);
            double empCheck = (Math.floor(Math.random() * 10) % 3);
            switch ((int) empCheck) {
                case IS_FULL_TIME: {
                    WorkHours = 8;
                    int PerdaySalary = EMP_WAGE_PER_HOUR * WorkHours;
                    Totalwage= Totalwage +PerdaySalary;

                    System.out.println("Full time Emp is " + PerdaySalary);
                    System.out.println("");
                }
                break;
                case IS_PART_TIME: {
                    WorkHours = 4;
                    int PerdaySalary = EMP_WAGE_PER_HOUR * WorkHours;
                    Totalwage= Totalwage +PerdaySalary;

                    System.out.println("Part time Emp is " + PerdaySalary);
                    System.out.println("");
                }
                break;
                default: {
                    WorkHours = 0;
                    int PerdaySalary = EMP_WAGE_PER_HOUR * WorkHours;
                    Totalwage= Totalwage +PerdaySalary;
                    System.out.println("Absentee is " + PerdaySalary );
                    System.out.println("");
                }

            }

        }
                    System.out.println("Total wage is "+Totalwage);
	            
	        

    }
	}


