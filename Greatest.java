import java.util.*;
public class Greatest {
    public static void main(String[] argv){
        Scanner sc=new Scanner(System.in);
        String ans;
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int result=(a>b)?(a>c?a:b):(b>c?b:c);
        System.out.println("greatest no is "+result);

    }
    
}
