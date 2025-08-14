import java.util.Scanner;
public class ArmstrongNumber {
	public static void main(String[] args) {
	 Scanner reader = new Scanner (System.in);
	 System.out.print ("ENTER	THE	RANGE :");
	 int range = reader.nextInt();
  for ( int num = 1 ; num <= range ; num ++){
     int originalnum = num ;
 	int count = 0;
     int sum = 0;
     int temp = num ;
 	while ( temp > 0){
 		temp /= 10 ;
            count ++;
 		}
 	
 	temp = num ;
 		while ( temp > 0){
 			int prod = 1;
 			for ( int i = 0 ; i < count ; i++){
 				prod = prod * (temp %10);
 			}
 				sum += prod;
 				temp /= 10;
 		}
 				if( sum == originalnum ){
 				System.out.println( originalnum);
 				}
  }
	}
}