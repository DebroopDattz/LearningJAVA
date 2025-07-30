import java.util.Scanner;
public class asg2a {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int temp;
        //using third variable
        temp=a+b;
        a=b;
        b=temp-a;
        System.out.println("After swapping using third variable, value of a is: " +a+"and value of b is: "+b);
        //without using third variable
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping without using third variable, value of a is: " +a+"and value of b is: "+b);
        scn.close();
    }
    
}
