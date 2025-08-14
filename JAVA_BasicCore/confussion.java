public class confussion {
	public static void main(String[] args) {
		int a =1234567;
		int ReverseOddDigit = 0;
		int position = 0;
		while ( a != 0){
			int digit = a % 10;
			a /= 10;
			
				if ( position % 2 == 0) {
					System.out.print( digit + " " );
					} else{
						ReverseOddDigit = ReverseOddDigit * 10 + digit ;
						}
						position++;	
		} 
		int temp = ReverseOddDigit;       // ReverseOddDigit = 7 5  3 1
		int multiplier = 1;
		while (temp != 0){
		 temp /= 10;
		 multiplier *= 10;
		 }
		  temp = ReverseOddDigit ;
		  while (multiplier > 1) {
		  	multiplier /= 10;
		  	System.out.print((temp / multiplier) % 10 + " ");
		  	} 
	}
}