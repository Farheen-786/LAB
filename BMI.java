
import java.util.*;
public class BMI {
    public static void main(String[] argv){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter weight: ");
        float w=sc.nextFloat();
        System.out.print("Enter height: ");
        float h=sc.nextFloat();
        double ans= w/(h*h);
        System.out.println("BMI is "+ans);
        
        sc.close();
    }
}
