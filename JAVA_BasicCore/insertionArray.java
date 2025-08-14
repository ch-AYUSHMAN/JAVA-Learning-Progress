import java.util.Scanner;
public class insertionArray {
	public static void main(String[] args) {
		Scanner in = new Scanner ( System.in);
		int arr [ ] = new int [ 100 ];
		System.out.print ("enter the size of element:");
		int size = in.nextInt();
		
		System.out.print ("enter " + size + " element:");
		for (int i = 1 ; i < size  ; i++ ){
			arr [ i ] = in.nextInt();
		}
	

		insertElement ( arr , size , 20, 3);
		for (int i = 1; i <= size ; i++){
		System.out.println( arr[ i ]);
		}
	}	
	public static void insertElement ( int [ ] arr  , int size ,  int insert , int pos ){
		for ( int i = size -1   ; i >= pos ; i--){
			arr [ i + 1] = arr [ i ];
		}
		arr [ pos ] = insert;
		size ++ ;
	}	
	
} 