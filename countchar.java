import java.util.Scanner;

public class countchar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        int count=0;
    for(int i=0;i<str.length();i++){
        if(str!=""){
             count=count+1;
        }
        }
        System.out.println("character is"+count);
    }
    
}