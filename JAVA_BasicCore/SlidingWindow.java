import  java.util.Scanner;
public class SlidingWindow {
	public static void main(String[] args) {
		Scanner in = new Scanner ( System.in );
		System.out.print ( " Enter the size of the Array : ");
		int n = in.nextInt();
		int [ ] arr = new int [ n];
		System.out.print (" Enter the Element of Array");
		for ( int i = 0 ; i < n ; i++)
		arr [ i ] = in.nextInt();
		System.out.print ( " Enter the size of Window :  ");
		int k = in.nextInt();
		for ( int i = 0 ; i <= n - k ; i++){
			int max = arr [ i ];
			for ( int j = i ; j < i + k ; j++){
				if ( arr [ j ] > max ){
					max = arr [ j ];
				}
			}
			System.out.print(max + " ");
		}


		
	}
}