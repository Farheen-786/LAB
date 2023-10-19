import java.util.*;
public class trafic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the light state:");
        String light=sc.nextLine();
        switch(light){
            case "red":
            System.out.println("stop: red signal");
            break;
            case "yellow":
            System.out.println("ready:signal is yellow");
            break;
            case "green":
            System.out.println ("go:signal is green");
            break;
            default:
            System.out.println("you have enter wrong signal");   
            break;       
        }
        sc.close();

    }
    
}
