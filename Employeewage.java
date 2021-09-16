package UC;

public class Employeewage {

	public static void main(String[] args) {
    int IS_PRESENT = 0;
          System.out.println("welcome to employee wage problem practice set");
    double empCheck = Math.floor(Math.random()* 10) %2;
    // Using random class to Get random number
    // math.floor returns largest double value
    if (empCheck == IS_PRESENT)
    {
        System.out.println("Employee is Present");
    }
    else 
    {
        System.out.println("Employee is Absent");
    }
	}

}
