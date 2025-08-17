import java.util.Scanner ; 
import java.util.StringTokenizer;
public class StringManipulation {
   public static void main( String [] args){
        // INPUT: "think twice code once"
        // OUTPUT : "kniht TWICE edoc ONCE"
        Scanner in =  new Scanner(System.in);
        String s = in.nextLine();
        StringTokenizer st = new StringTokenizer(s , " ");
        int count = 0 ;
        while ( st.hasMoreTokens()){
            String word = st.nextToken();
            StringBuffer sb = new StringBuffer ( word );
            count ++;
            if ( count % 2 != 0) {
                word = sb.reverse(). toString ();
                System.out.print( word.toLowerCase() + " ");
            }else {
                System.out.print( word.toUpperCase() +" ");
            }
        }
        in.close();

    }
    // input : A10B12C3D4
    // OUTPUT : AAAAAAAAAAABBBBBBBBBBBBCCCDDDD
    public static void main1 ( String [] args ) {
        Scanner in = new Scanner ( System.in) ;
        System.out.print( "Enter the String : ");
        String s = in.next();
        char arr[] = s.toCharArray();
        int num = 0 ;
        char ch = ' ';
        for ( int i = 0 ; i < arr.length; i++){
            if (arr[i] >= '0' && arr[i] <= '9'){
                num = num * 10 + ( arr[i] - '0');
            }else{
                if ( i > 0){
                    for ( int j  = 0 ; j< num ; j++){
                        System.out.print( ch );
                    }
                }
                num = 0 ;
                ch = arr[i];
            }
        }
        for ( int j = 0 ; j <num ; j++){
            System.out.print( ch);
        }
    }
}
