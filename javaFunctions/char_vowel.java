import java.util.Scanner;
public class char_vowel {
    public static void char_vowel(char ch){
        if(ch =='a' || ch=='e' || ch=='i'|| ch=='o'|| ch=='u'){
            System.out.println(" chracter is vowel");
        }
      
        else{
            System.out.println("chracter consonent");
        }
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the charater :");
      char ch=sc.next().charAt(0);
      char_vowel(ch);
      sc.close();

    }
    
}
