import java.util.*;
public class marks {
    public static void main(String[] argv){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter name:");
        String name=sc.nextLine();
        int n=5;
        float marks[]=new float[5];
        String sub[]={"hindi","englih","science","sst","maths"};
        for(int i=0;i<n;i++){
            System.out.println("enter marks of subject"+sub[i]+" ");
            marks[i]=sc.nextFloat();
            while(marks[i]>100){
                System.out.println("marks you have entered is not valid");
                System.out.println("enter again for subject"+sub[i]+" ");
                marks[i]=sc.nextFloat();
            }

        }
        float total =0;
        for(float i:marks){
            total+=i;
        }

        float totalavg=(total/500);
        System.out.println("total average is"+totalavg);
        System.out.println("percentage is"+(totalavg+100)+"%");
        sc.close();
    }
    
}
