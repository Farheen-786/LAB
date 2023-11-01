import java.util.Scanner;
public class celsiustofarenhiet {
    public static void celsiustofarenhiet(double cel){
        double far=((cel-32)*5)/9;
        System.out.println("temprature in farhenhiet :"+far);
    }
    
    public static void farenhietocelsious(double farh){
        double cel=(farh*9)/32;
        System.out.println("temprature convert into celsious:"+cel);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the celsious value :");
        double cel=sc.nextDouble();
        System.out.println("enter the temp in farhenhiet:");
        double farh=sc.nextDouble();
        celsiustofarenhiet(cel);
        farenhietocelsious(farh);
        sc.close();
    }
    
}
