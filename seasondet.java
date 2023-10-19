import java.util.Scanner;

public class seasondet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a month");
        String month=sc.nextLine();
        switch(month){
         case "january":
         System.out.println("winter");
         break;
         case "february":
         System.out.println("winter");
         break;
         case "march":
         System.out.println("summer");
         break;
         case "april":
         System.out.println("winter");
         break;
         case "may":
         System.out.println("winter");
         break;
         case "june":
         System.out.println("summer");
         break;
         case "july":
         System.out.println("winter");
         break;
         case "augest":
         System.out.println("spring");
         break;
         case "septemer":
         System.out.println("spring");
         break;
         case "october":
         System.out.println("spring");
         break;
         case "november":
         System.out.println("winter");
         break;
         case "december":
         System.out.println("summer");
         break;
         default:
         System.out.println("youhave enter wrong input");
         break;
    }
    
}}
