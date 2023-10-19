import java.util.Scanner;

public class countdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("enter the digit:");
        int num=sc.nextInt();
        for(int i=num;i>0;i/=10){
             count++;
            }
            System.out.println("count digit:"+count);
    }
    
}
