import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if(i%2==0){
                System.out.println("even :"+i);
            }
            else{
                System.out.println("odd :"+i);
            }
        }
    }
    
}
