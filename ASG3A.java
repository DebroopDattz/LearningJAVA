import java.util.Scanner;

public class ASG3A {
    public static void main(String[] args) {
     Scanner scn = new Scanner (System.in);
     int a = scn.nextInt();
     int b = scn.nextInt();
     int c = scn.nextInt();

     int max = (a>b)?((a>c)?a:c):((b>c)?b:c);
     System.out.println("The Max of 3 given numbers is: "+max);
     scn.close();
    }
    
}
