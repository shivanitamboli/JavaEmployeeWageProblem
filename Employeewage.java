package UC;

public class Employeewage {
        public static final int IS_PART_TIME=1;
        public static final int IS_FULL_TIME=2;
	    public static final int EMP_WAGE_PER_HOUR=20;

	    public static void main( String[] args )
	    {
	        int WorkHours=0;
	        double empCheck= (Math.floor(Math.random()*10)%3);
	        System.out.println("Employee wage is ");
	        switch((int)empCheck) {
	            case IS_FULL_TIME:
	            {
	                WorkHours = 8;
	                System.out.println(EMP_WAGE_PER_HOUR * WorkHours);
	            }
	            break;
	            case IS_PART_TIME:
	            {
	                WorkHours = 4;
	                System.out.println(EMP_WAGE_PER_HOUR * WorkHours);
	            }
	            break;
	            default:
	            {
	                WorkHours = 0;
	                System.out.println(EMP_WAGE_PER_HOUR * WorkHours);
	            }
	        }

    }
	}


