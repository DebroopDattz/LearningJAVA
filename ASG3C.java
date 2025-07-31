import java.util.Scanner;
public class ASG3C {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter a year: ");
    long year = scn.nextLong();
    int leap = (year%400==0)?1:((year%100!=0)&&(year%4==0))?1:0;
    if(leap ==1){
        System.out.println("Given year is a leap year");
    }
    else{
        System.out.println("Given year is not a leap year");
    }
    scn.close();
    }
    
}
