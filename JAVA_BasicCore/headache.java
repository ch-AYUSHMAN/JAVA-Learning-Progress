import java.util.Scanner;
 public class headache {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        System.out.print("Enter The Day (DD): ");
        int day = reader.nextInt();
        System.out.print("Enter The Month (MM): ");
        int month = reader.nextInt();
        System.out.print("Enter The Year (YYYY): ");
        int year = reader.nextInt();
        if (day >= 1 && day <= 31 && month >=1 && month <=12 && year > 0 && year<=9999){
           if (month == 2 && (year % 4 == 0 && year % 100 != 0) || (year % 400 ==0) && day <=29 ){
System.out.println( "the date you enter is:" + day + "/" + month + "/" + year);
         }else if (month == 2 && day <= 28){
System.out.println( "the date you enter is:" + day + "/" + month + "/" + year);
} else {
System.out.print("invalid input.");
          } if (month == 4 && month == 6 && month == 9 && month == 11 && day <=30){
System.out.println( "the date you enter is:" + day + "/" + month + "/" + year);
          }else{
        System.out.print("invalid input.");}
       } else { 
           System.out.print("invalid input. please ensure correctdate");}
      
    

      }
    
}