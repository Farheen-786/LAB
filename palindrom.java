import java.util.*;
public class palindrom {
    public static void main(String[] argv){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        int r;
        int temp;
        temp=n;
        while(n!=0){
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        System.out.println("reverse the num"+s);
if(s==temp){
    System.out.println("palindrom");
}
else{
    System.out.println("not palindrom");
}
    }
}
