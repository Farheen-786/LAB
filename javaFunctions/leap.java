import java.util.Scanner;
public class leap {
    public static void leap(int year) {
        if((year%4==0) || (year%400==0) && (year%100!=0)){
            System.out.println("leap year : "+year);
        }
        else{
            System.out.println("not leap year : " +year );
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year :");
        int year =sc.nextInt();
        leap(year);
        sc.close();
    }
}
    

