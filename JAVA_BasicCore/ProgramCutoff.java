// WAP TO SHOW THE CUTOFF RESULT OF STUDENT APPEAR IN pre-EXAM .
/* CONDITIONS - 1.Max mark is 240 , one who get full marks is directly qualify for fnal exam. 
2. cutoff mark for post exam is 170+
3. one who get marks betwwen 140 and 169 will get an extra attempt to clear a cutoff
4. no negative marking*/

import java.util.Scanner;
public class ProgramCutoff  {
	public static void main(String[] args) {
		System.out.println("FIRST ATTEMPT pre-EXAM CUTOFF");
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the  marks obtained : "  );
			int marks = in.nextInt();	
		if (marks > 0 && marks <=240 ) {//primary conditon of maximum marks can be obtain and no negative marking 
		if(marks == 240){
			System.out.println("Congratulation! You Qualify For Final Exam"); // condition of direct eligble for final exam
			  }else if(marks >=170){
		System.out.println ("Eligible for post-EXAM attempt");
		System.out.println("Proceed for Enrollment form for post-EXAM") ; // conditon of cutoff for eligibility for post exam
		} else if (marks >=140 && marks <169) {
			System.out.println("You get an extra attempt to clear cutoff marks");
			System.out.println("Proceed for ROUND2 exam form");       // secondary conditon for an extra attempt
		} else {
			System.out.println("Not eligible for next attempt");
			System.out.println("SORRY! BEST OF LUCK"); // else condtion of out of cutoff 
		}
		} else {
			System.out.println("invalid marks-(please enter the valid marks)"); // conditon for inputing invalid marks
		}
	}
}