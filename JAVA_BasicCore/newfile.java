import java.util.Scanner;
public class newfile {
	public static void main(String[] args) {
		System.out.println("FIRST ATTEMPT EXAM CUTOFF");
		Scanner in  = new Scanner(System.in);
		System.out.print("Enter the  marks obtained : "  );
			int marks = in.nextInt();	
		if (marks > 0 && marks <=240 ) {
		if(marks == 240){
			System.out.println("Congratulation! You Qualify For Final Exam");
			  }else if(marks >=170){
		System.out.println ("Eligible for next attempt");
		System.out.println("Proceed for Enrollment form for next attempt") ;
		} else if (marks >=140 && marks <169) {
			System.out.println("Compartment exam");
			System.out.println("ProcEed for the compartment form");
		} else {
			System.out.println("Not eligible for next attempt");
			System.out.println("SORRY! BEST OF LUCK");
		}
		} else {
			System.out.println("invalid marks-(please enter the valid marks)");
		}
	}
}