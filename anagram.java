import java.util.Scanner;
public class anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        char s3[]=s1.toCharArray();
        char s4[]=s2.toCharArray();
        if(s3.length!=s4.length){
            System.out.println("not anagram");
            System.exit(0);  
        }
         s4.sort(s3);
         s3.sort(s4);
        for(int i=0;i<s3.length;i++){
            if(s3[i]!=s4[i]){
                System.out.println("not anagram");
                System.exit(0);

            }
        }
        System.out.println("anagram");

        

    }
    
}
