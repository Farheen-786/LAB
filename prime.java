import java.util.*;
public class prime {
    public static void main(String[] argv){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the num");
    boolean ans;
    int num=sc.nextInt();
    for(int i=1;i<=num;i++){
        if(num%i==0){
            System.out.println("prime");
            break;
        }
        else{
            System.out.println("not prime");
        }
    }
    
}
}
