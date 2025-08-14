import java.net.SocketImpl;
import java.net.SocketPermission;
import java.util.StringTokenizer;
import java.util.Scanner;


public class WorkingRivision{
    

 /* public static void PerfectNumber (String [] args){
        Scanner reader = new Scanner ( System.in);
        int num = reader.nextInt();
    
        int sum = 0;
        for( int i =1; i <= num/2 ; i ++){
            if (num % i == 0){
                sum += i;
            }  
        }
        String result = (num == sum) ? "perfectnumber":"not a perfecct number";
        System.out.println (result);
    }

public static void PrimeChecker( String [] args){
    Scanner reader = new Scanner( System.in);
    System.out.print( "Enter the value : ");
    int num = reader.nextInt();
    boolean isPrime = true;
    for (int i = 2 ; i<=num /2 ; i++){
        if (num % i == 0){
        isPrime = false;
        break;
        }
    }
String result = isPrime ? "PrimeNumber" : "not a PrimeNumber";
System.out.println (result);
}
public static void PrimeInRange (String[] args){
    Scanner reader = new Scanner (System.in);
    System.out.print(" ENTER THE RANGE : ");
int range = reader.nextInt();
for (int num = 0 ; num <= range ; num ++){
    boolean isPrime = true;
    for (int i = 2 ; i <+ num; i ++ ){
        if (num % i == 0 ){
            isPrime = false ;
            break;
        }
    }
    if (isPrime){
    System.out.print ( num + " ");
    }
}
}

public static void main (String [] args){
    Scanner input  = new Scanner (System.in);
    int n  = input.nextInt();
    for (int i = 1; i <=n; i++){
        for (int j = 1 ; j <=n  ; j++){
            if ( i >= j ){
            
System.out.print (" " );
            }else { System.out.print( i);}
   
        }
        System.out.println();
}
}
public static void main ( String [] args){
    Scanner reader = new Scanner ( System.in);
    int arr [] = new int [5];
    for ( int i = 0 ; i <= arr.length ; i ++){
        arr [i] = reader.nextInt();
        
        System.out.println( "element at index " + i +":" +arr[i]);}

    }*/
    public static void main ( String [] args){
        Scanner in = new Scanner ( System.in);
        
       System.out.println("Enter the String : ");
        String input  = in.nextLine();
        char charArray[] = input.toCharArray();
        for( int i =  0 ; i < charArray.length ; i ++){
            if (charArray[i]>= 65 && charArray[i]<= 90){
                charArray [i] = (char)(charArray[i]+ 32);
            }else if ( charArray [i]>= 97 && charArray[i]<=122){
                charArray [i] = (char)(charArray[i] - 32);
            }
        }
        String result = new String( charArray);
        System.out.println("Converted String :" + result);
        }
        


         
       public static void InsertElement ( int arr [], int size , int insert , int pos ){
        for ( int i = size - 1 ; i >= pos ; i --){
            arr [i + 1 ]= arr [i];
        }
        arr[ pos] = insert ;
        size++;
       }
       public static void Swap ( int arr[] , int index1 , int index2){
        int temp = arr [ index1 ];
        arr [ index1 ] = arr [ index2 ];
        arr [ index2 ] = temp;
       }
       public static void ReverseArray ( int arr[] ,int size ){
        int start = 0;
        int end = size - 1;
        while ( start < end){
        Swap ( arr , start , end );
        start ++;
        end --;
       }
    }
   public static int maxElement (int arr[], int size){
    if ( arr.length == 0){
        return -1 ;
    }
    int max = arr [0];
    for (int i = 0 ; i <= size ; i++) 
        if (arr[ i ]  > max){
            max= arr[i];
        }
    return  max;

   }
   public static int minElement ( int arr[] ,int size){
    if (arr.length == 0){
        return -1 ;
    }
    int min = arr[0];
    for ( int i = size - 1 ; i >= 0 ; i--)
        if (  min > arr [i]) {
            min = arr[i];
        }
        return min ;
   
}
public static int maxInRange( int arr [], int start , int end ){
    if ( start > end ){
        return -1 ;
    }
    if ( arr == null){
 return -1;
    }
    int max = arr [ start];
    for ( int i = start; i <= end; i ++ )
    if ( arr[ i ]> max){
        max = arr[i];
    }

return max ; 
}
public static int SMin ( int arr[],int size){
    int min =  arr[0];
    int SMin  = arr [ 0];
    for ( int i = 0 ; i < size ; i ++)
    if ( min > arr [i]){
        SMin = min ;
        min = arr[i];
    }else if ( SMin > arr[i] || SMin == min ){
        SMin = arr[i];
    }
return SMin ;
    }
    public static int searching ( int arr[], int pos , int size){
        int ele = arr [0];
        for( int i = 0 ; i <= size ; i++)
        if ( arr[i] == arr[ pos]){
            ele = arr[ pos];
        }
        return ele;
    }
    
    public static void selectionSORT( int arr [] , int size){
        for (int i = 0 ; i <= size -1 ; i++ ){
        for ( int j = i + 1 ; j < size ; j ++){
            if ( arr[i] > arr[j]){
                Swap(arr, i, j);
            }
        }
    } 
}



}


