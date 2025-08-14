package LEARNINGjava;

import java.util.Scanner;
public class problempracticeARRAY {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int [ ] arr = new int [ 5 ];
		for (int i = 0 ; i < arr.length ; i ++){
		arr [ i ] = in.nextInt();}
		reverseArray(arr);
		for (int i =  0 ; i < arr.length ; i ++);
		
	}
	public static void  swap ( int [ ] arr , int  index1 ,int  index2 ){
	 int temp = arr [ index1] ;
	 arr [ index1] = arr [ index2 ];
	 arr [ index2 ] = temp;
	 
	}
	public static void reverseArray ( int [ ] arr){
		int start = 0 ;
		int end = arr.length - 1 ;
		while ( start < end){
		swap ( arr , start , end);
		start ++ ;
		end --;
		}
	}
	public static int maxElement ( int [ ] arr){
		if ( arr.length == 0){     // work on edge case here  
			return  -1;
		}
		int max = arr [ 0 ];
		for ( int i = 0 ; i < arr.length ; i++ )
		if ( arr [ i ] > max){
			max = arr [ i ];
		}
		return max ;
	}
    public static int maxInRange ( int [ ] arr , int start , int end){
    	if ( start > end){
    		return  -1;
    	}
    	if ( arr == null){
    		return  -1;
    	}
		int max = arr [ start ];
		for ( int i = start ; i <= end ; i++ )
		if ( arr [ i ] > max){
			max = arr [ i ];
		}
		return max ;
	}
 public static int SMin ( int [ ] arr ){
 	int min = arr[ 0 ];
 	int SMin = arr [ 0 ];
 	for ( int i = 0 ; i < arr.length ; i ++)
 	if ( min > arr [ i ]){
 		SMin = min ;
 		min = arr [ i ];
 	} else if ( SMin > arr [ i ] || SMin == min){
 		SMin = arr [ i ];
 	}
 	return SMin ;
 }
	public static int searching ( int [ ] arr , int pos  ) {
		int ele = arr [ 0 ];
		for ( int i = 0 ; i < arr.length ; i ++)
		 if (arr [ i ] == arr [ pos ]){
		 ele = arr [ pos ];
		 } 
		 return ele ;
	}
	public static void selectionSORT ( int [ ] arr ){
	for  ( int i = 0 ; i < arr.length - 1 ; i++ ){
		for (int j = i + 1 ; j < arr.length ; j++ ){
			if ( arr [ i ] > arr [ j ]){
				swap (arr , i , j);
			}
		}
	}
	}
}
	
	
	
	
	
	
	 	
