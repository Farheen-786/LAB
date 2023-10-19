import java.util.*;
public class Circlerec {
    public static void main(String[] argv){
        Scanner sc=new Scanner(System.in);
        int rad=sc.nextInt();
        int l=sc.nextInt();
        int b=sc.nextInt();
        float area=(3.14f)*rad*rad;
        float per=2*(l+b);
        System.out.println("parameter of rectangle" +per);
        System.out.println("area of circle"+area);
    }
}
