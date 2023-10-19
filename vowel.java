import java.util.*;
public class vowel {
    public static void main(String[] argv){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        System.out.println("enter the value");
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("vowel");
        }
        else{
            System.out.println("consonants");
        }
    }
}
