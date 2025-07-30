import java.util.Scanner;
public class asg1b {
    public static void main(String[] args) {
        double r;
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter radius: ");
        r=scn.nextDouble();
        double area = Math.PI * r * r;
        System.out.println("Area of circle: " + area);
        double perimeter = 2 * Math.PI * r;
        System.out.println("Perimeter of circle: " + perimeter);
        scn.close();
        
    }
}
