package JAVA_DSA;
// Vararg Method Using Array.
/* 
public class VarargsMethod {


    static <T> void varargsMethod (T v []){
        System.out.print("Number of args: " + v.length + " Element: ");
        for ( T x : v)
        System.out.print( x  + " ");
        System.out.println();
        
    }
    
    public static void main (String args[]){
        Number x[ ] ={1,4,5,3,7};
        String y [] = {"Strong" , "Weak"};
        Double z[ ] = { };
        varargsMethod(x);
        varargsMethod(y);
        varargsMethod(z);
    }
}
//Varargs Method Using Ellipsis
public class VarargsMethod {
    static <T> void varargsMethod(T ...v){
        System.out.print("Number of Arguments: " + v.length +" ");
        for( T x : v)
        System.out.print(x +" ");
        System.out.println();
    }
public static void main (String args[]){
varargsMethod ("Ramesh");
varargsMethod( 1, -2, -7);
varargsMethod();
}
   
}*/
//Varargs Method Using Object
public class VarargsMethod {
    static void varargsMethod(Object ...obj){
        System.out.print("Number of Arguments: " + obj.length);
        for( Object x : obj)
        System.out.print(x +" ");
        System.out.println();
    }
public static void main (String args[]){
varargsMethod (1,"Ramesh", 0.6, true);
varargsMethod( 1, -2, -7);
varargsMethod("A","B","C","D","E","F");
}
   
}