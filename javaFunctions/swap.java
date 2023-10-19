import java.util.Scanner;

public class swap {
    public static void Swap(int a,int b){
        if(a<0 && b<0){
            return ;
        }
        else{
            a=a+b;
             b=a-b;
             a=a-b;
             System.out.println("swaped values are:"+ a +" "+ b );
        }
    }             
public static void main(String[] argv){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of a and b:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    Swap(a,b);
    sc.close();
}
    }
    

