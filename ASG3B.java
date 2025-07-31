import java.util.*;
public class ASG3B {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       System.out.println("Enter the values of a, b, c in your equation: ");
       double a = scn.nextDouble();
       double b = scn.nextDouble();
        double c = scn.nextDouble();
        double d = (b*b)-(4*a*c);
        if(d>0){
            System.out.println("The roots are unique");
            double r1 = (-b + Math.sqrt(d))/(2*a);
            double r2 = (-b - Math.sqrt(d))/(2*a);
            System.out.format("Root 1 = %2f and Root 2 = %2f ", r1, r2);
        }
        else if(d==0){
            System.out.println("The roots same");
            double r = (-b)/(2*a);
            System.out.format("Root1 equals Root2 = %2f",r);
        }
        else{
            System.out.println("The roots are complex");
            double real = (-b)/(2*a);
            double imaginary = (Math.sqrt(d))/(2*a);
            System.out.format("Root1 = %2f + %2fi and Root 2 = %2f - %2fi", real, imaginary, real, imaginary);
            
        }

    }
}
