import java.util.Scanner;
public class CALCULATOR {
	public static void main(String[] args) {
		Scanner reader = new Scanner ( System.in);
		float answer = 0;
		
		while (true){    // created continuous loop
			System.out.print("Enter The Operator: ");  // inserting operator
			char op = reader.next().trim().charAt(0);   
			if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){  // operators conditon
				System.out.println();  // newline
				System.out.print("Enter The First  Number: ");
				float num1 = reader.nextFloat();   // floating number 1
				System.out.println();  // newline
				System.out.print("Enter The Second Number: ");  
				float num2 = reader.nextFloat();   // floating number 2 
					if(op == '+'){
					answer = num1 + num2;  // operating addition
				}
				if ( op == '-'){
					answer = num1 - num2;  // operating substraction
				}
				if ( op == '*'){
					answer = num1 * num2;  // operating multiplication
				}
				if (op == '/'){  
					if ( num2 !=  0){  // conditon of division  
					answer = num1 / num2 ;  // operating division
					}else{
						System.out.println("Divider Can Not be  Zero!! ");
					}
				}
				if (op == '%'){
					answer = num1 % num2 ;  // condition of modulous
				}
				
			} else if ( op == 'x' || op == 'X'){
				break;  // condition for breaking the while loop
			}else{
				System.out.println("Invalid Operator!!");  // error operator
			}
			System.out.println();  //newline
	   System.out.println("Your Required Result is : " + answer);  // result
	        System.out.println();  // newline
		}
	}
}