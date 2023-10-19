import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fact=1;
        System.out.println("enter the num");
        int num=sc.nextInt();
        while(num!=0){
            fact=fact*(num);
            num--;    
        }
        System.out.println("factorial is"+fact);
        }

    }
    

