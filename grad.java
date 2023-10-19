import java.util.*;
public class grad {
    public static void main(String[] argv){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter name:");
        int num=sc.nextInt();
        if(num>=90 && num<=100){
            System.out.println("grad A");
        }
        else if(num>90 && num<80){
            System.out.println("grade B");
        }
        else if(num>80 && num<70){
            System.out.println("grade c");
        }
        else if(num>70 && num<40){
            System.out.println("grade d");
        }
        else{
            System.out.println("fail");
        }
    }
}
