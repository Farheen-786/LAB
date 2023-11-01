import java.util.Scanner;

public class Area {
   public static double area(int l,int b){
    return l*b;
}
public static double parameter(int l,int b){
    return 2*(l+b);
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the length:");
    int l=sc.nextInt();
    System.out.println("enter the width:");
    int b=sc.nextInt();
    double Area=area(l,b);
    double Parameter=parameter(l,b);
    System.out.println("area is:"+Area);
    System.out.println("parameter is :"+Parameter);
    sc.close();
   }
 
}
