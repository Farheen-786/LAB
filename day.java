import java.util.*;
public class day {
    public static void main(String[] argv){
        Scanner sc=new Scanner(System.in);
        int ans=sc.nextInt();
        if(ans==1){
            System.out.println("monday");
        }
        else if(ans==2){
            System.out.println("tuesday");
        }
        else if(ans==3){
            System.out.println("wed");
        }
        else if(ans==4){
            System.out.println("thus");
        }
        else if(ans==5){
            System.out.println("fri");
        }
        else if(ans==6){
            System.out.println("sat");
        }
        else if(ans==7){
            System.out.println("sun");
        }
        else{
            System.out.println("you have worng digit");
        }
    
}
}