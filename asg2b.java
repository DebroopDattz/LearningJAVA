import java.util.*;

    
public class asg2b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double salary = scn.nextDouble();
        double merged_basic = salary +(0.5 * salary);
        double total_salary = 0.5*merged_basic+0.15*merged_basic+merged_basic;
        System.out.println("Salary is: "+total_salary);
        scn.close();
    }
    
}
