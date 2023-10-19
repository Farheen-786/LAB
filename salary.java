import java.util.*;
public class salary {
    public static void main(String[] argv){
        Scanner sc=new Scanner(System.in);
       System.out.println(" enter name ");
         String name=sc.nextLine();
      System.out.println("enter salary");
         float salary=sc.nextFloat();
        double hra=salary*0.30;
double ta=2000;
double da=salary*0.2;
double gross=salary+hra+ta+da;
double tax=0;
        if (gross <= 10000) {
            tax = 0;
        } else if (gross <= 20000) {
            tax = gross * 0.10;
        } else if (gross <= 30000) {
            tax = gross * 0.15;
        } else {
            tax = gross * 0.25;
        }
double netsalary=gross-tax;
System.out.println("net salary"+netsalary);
    }
    
}
