import java.util.Scanner;

public class triangle {
    public static void triangle(int a,int b,int c){
        if(a==b && b==c){
            System.out.println("equiletral");
        }
        else if(a==b || b==c){
            System.out.println("isosceles");
        }
        else{
            System.out.println("scalene");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sides of triangle:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        triangle(a,b,c);
        sc.close();
    }
    
}
