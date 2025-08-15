package JAVA_DSA;
/*
// A Generic Method For Printing
public class GenericMethod {
     <T> void genericPrint( T t) {
     System.out.println (t);   
    }

    public static void main(String[] args) {
        GenericMethod aObj= new GenericMethod() ;
        aObj.genericPrint(101);
        aObj.genericPrint("Joy With Java ");
        aObj.genericPrint(3.14);
    }
}

// Static Generic Method

public class GenericMethod {
     static <T> void genericPrint( T t) {
     System.out.println (t.getClass().getName() +" "+t);   
    }
    public static void main(String[] args) {
      
        genericPrint(101);
        genericPrint("Joy With Java ");
        genericPrint(3.14);
    }
    
}
// Parameter(s) Passing
class Wrapper <T> {
    T value; 
    Wrapper(T value){
        this.value = value;
    }

}

 public class GenericMethod {
    public static <T> void swap ( Wrapper <T> x ,Wrapper <T>  y){
        T temp ;
        temp = x.value;
        x.value = y.value;
        y.value = temp; 
    }

    public static  void main (String args[]){
      
        Wrapper <Integer> x= new Wrapper <>(99);
        Wrapper <Integer> y = new Wrapper<>(66);
        System.out.println("x = " + x.value + " " + "y = "+ y.value);
        swap(x, y);
        System.out.println("x = " + x.value + " " + "y = "+ y.value);
    }
}
class Person {
    String name;
    float marks;
    Person( String name , float marks){
        this.name = name;
        this.name = name;
    }
}
    public class GenericMethod {
    public static void swap( Object x , Object y){
        Object t;
        t = x ;
        x= y ;
        y = t;
    }
    public static void main (String args[]){
        Object p1 = new Person("Sumit",  98.8f);
        Person p2 = new Person("Rahul", 83.6f);
        System.out.println("p1 =" + p1 + " " + "p2 = " + p2);
        swap(p1, p2);
        System.out.println("p1 =" + p1 + " " + "p2 = " + p2);
    }
        
    }
    // Program to handle an Array of Interger

 class SpecificArrayInt {

    int[] a;
    SpecificArrayInt (int a[]){
        this.a = a;
    }
    void printInt(){
        for (int x: a)
        System.out.println(x);

    }
    void reverseInt(){
        int i = 0 , j = a.length-1;
        while ( i <j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
}/* 
public class GenericMethod {

    public static void main (String args []){
        int [] data = { 1, 2,3,4,5};
        SpecificArrayInt obj = new SpecificArrayInt( data);
        System.out.println("Original array: ");
        obj.printInt();
        obj.reverseInt();
        System.out.println( "Reversed Array: ");
        obj.printInt();
    }
}
//Program to handle an Array of Double

class SpecificArrayDouble{
    double[] b;
    SpecificArrayDouble( double b[]){
        this.b = b;
    }
    void printDouble(){
        for ( double x :  b)
        System.out.println(x);
    }
    void reverseDouble (){
        int i = 0 , j = b.length-1;
        while( i <j){
            double temp = b[i];
            b[i] = b[j];
            b[j] = temp;
            i ++;
            j--;

        }
    }
}/* 
public class GenericMethod {

    public static void main ( String args[]){
        double[] data = {1.2,0.3,5.6,1.9};
        SpecificArrayDouble obj = new SpecificArrayDouble(data);
        System.out.println("Original Array: ");
         obj.printDouble();
         obj.reverseDouble();
         System.out.println("Revresed Array: ");
         obj.printDouble();



    }
}
//Program to handle an array of String

class SpecificArrayString{
    String[] c;
    SpecificArrayString( String c []){
        this.c = c;
    }
    void printString(){
        for ( String x : c )
        System.out.println(x);

    }
    void reverseString(){
       int i = 0 , j = c.length-1;
        while( i <j){
            String temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i ++;
            j--;
        }
        

        }
    }
public class GenericMethod {
public static void main (String args[]){
    String [] data = { "Ramesh", "Suresh","Mohan"};
    SpecificArrayString string = new SpecificArrayString(data);
    System.out.println();
    string.printString();
    string.reverseString();
    System.out.println("Reversed String: ");
    string.printString();
}
    
}  

  public class GenericMethod <T> {
    private T x;
    public GenericMethod(T t){
        x = t;
    }
    public void printData (){
        System.out.println(x);
    }
  
    public static void main(String[] args) {
        GenericMethod <String> a = new GenericMethod<String>("Java");
        a.printData();
        GenericMethod <Integer> b = new GenericMethod<Integer>(1223);
        b.printData();
        GenericMethod <Double> c = new GenericMethod<Double>(3.12255);
        c.printData();
    }
  } 

    // --> Defining class to process arrays with any data type

    class  GenericArray <T> {
        T a [];
        GenericArray (T[] a){
            this.a = a;
        }
        
       void printData (){ // A generic method to print the element in array  b
        for( T x : a)
        System.out.println(x + " ");
        System.out.println();
        }
          void reverseArray (){
            int i = 0 , j = a.length-1;
            while (i <j){
                T temp = a [i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;

            }

        }
    }
public class GenericMethod {

     public  static void main (String args[]){
        Integer[] intData = {10,20,30,40,50};
        GenericArray <Integer> aInt = new GenericArray<>(intData);
     System.out.println("Original Integer array:");
        aInt.printData();

        aInt.reverseArray();
        System.out.println("Reversed Integer array:");
        aInt.printData();

        // String array
        String[] strData = {"A", "B", "C", "D", "E"};
        GenericArray<String> aStr = new GenericArray<>(strData);
        System.out.println("Original String array:");
        aStr.printData();

        aStr.reverseArray();
             System.out.println("Reversed String array:");
        aStr.printData();

        // Double array
        Double[] dblData = {1.1, 2.2, 3.3, 4.4, 5.5};
        GenericArray<Double> aDbl = new GenericArray<>(dblData);
        System.out.println("Original Double array:");
        aDbl.printData();

        aDbl.reverseArray();
        System.out.println("Reversed Double array:");
        aDbl.printData();
    }
}
// --> Defining a Generic Class With User Defined Data Type 


class Student {              // Define a class Student
    String name;
    float marks;
Student(String name, float marks){
    this.name = name ;
    this.marks= marks ;
}
@Override
public String toString (){
    return name + "("+ marks +")";
}
}

class GenericClass <T>{
    T obj;                   // An object of type T is declared
    GenericClass( T obj){    // Conctructor of the generic class
        this.obj= obj;
    }
    
    public T getObject(){   // A method in the class
        return this.obj;
    }
}

public class GenericMethod {
    public static void main (String args[]){
        GenericClass <Integer> iObj = new GenericClass <Integer> (85);
        System.out.println(iObj.getObject());
        GenericClass <String> sObj = new GenericClass <String> ("Java");
        System.out.println(sObj.getObject());
        GenericClass <Student> tObj = new GenericClass <> (new Student("Ramesh", 98.6f ));
        System.out.println(tObj.getObject());
    }
}*/

                   /* PARAMETERIZED GENERIC CLASS */

// --> Genric class with Two Parameters.
/* 
class GenericClass <T1, T2> {
    T1 obj1;
    T2 obj2;
    GenericClass (T1 obj1 , T2 obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public void print(){
        System.out.println (obj1);
        System.out.println(obj2);
    }
}
public class GenericMethod {

    public static void main (String [] args){
GenericClass < String , Integer > obj1 = new  GenericClass <String , Integer >("RAMESH", 9);
obj1.print();
GenericClass < Integer , Double > obj2 = new GenericClass <Integer , Double>(123 ,33.33);
obj2.print();
    }   
}
// PART2
  class PairData <T, V>{
    private T x;                       //Two Fields of generic type T and V 
    private V y;
    public PairData ( T a , V b){     // Constructor 
        x = a;
        y = b;
    }
    public T getvalueT () {           // Get the T-type value for a pair - data
        return x ;
    }
    public V getvalueV () {           // Get the V- type value for a pair- data
        return y ;
    }
                   
    public void printData (){         // To print the data member in an Object
        System.out.println  (getvalueT() + "," + getvalueV());
    }
 }
 public class GenericMethod {
    public static void main(String[] args) {
        PairData <String , String > a = new PairData <>("Kumar", "Suresh");
        a.printData();
        PairData <String, Integer > b = new PairData<>("Suresh", 69);
        b.printData();
        PairData <Integer , Double > c = new PairData<>(88,33.3);
        c.printData();  
    } 
 }*/
// --> Generic Class With Method Overloading
 class Student {
    String name;                       // Name of the Student 
    int marks [ ] = new int [3];       // Stores the marks of the Three Subjects 
    Student (String s, int m[]){       // Constructor for Student Class
        name = s;
        marks = m ;
    }
    void printStudent (){
        System.out.println ("Name: " + name);
        System.out.println  ( "Score: " +  marks [0] + " " + marks [1] + " " + marks [2]);
    }                                  // Student class End
 }
 class GenericMultiArrays <T , S> {   // Defining a generic arrays with two type parameter
     T a[];                           // Define that the array a[] can store one type of data
     S b[];                           // Define that the array b[]  can store another type of data
      GenericMultiArrays (T[] x , S[] y){
        a = x;
        b = y;
      }
      T getDataT ( int i){
        return a[i];
      }
      S getDataS ( int i ){
        return b[i];
      } 
      //Overloading methods in the generic class
      void printDataT (T[] t){
        for ( int i = 0; i <t.length ;i ++)
        System.out.print(t[i] + " ");
        System.out.println();
      }
      void printDataS (S[] s){
        for (int i = 0 ; i < s.length ; i++)
        if (s[i] instanceof Student)
                ((Student) s[i]).printStudent();
        System.out.println();
        
      }
      // Few additional methods
  void reverseArrayT(T [] t) {    //Generic method to reverse the order of elements in t
 int front = 0, rear = t.length-1; T temp;
 while( front < rear) {
 temp = t[rear];
 t[rear] = t[front];
 t[front] = temp;
 front++; rear--;
 }
 }
 void reverseArrayS(S [] s){    //Generic method to reverse the order of elements in s
 int front = 0, rear = s.length-1; S temp;
 while( front < rear) {
 temp = s[rear];
 s[rear] =s[front];
 s[front]= temp;
 front++; rear--;
 }
 }
 }
 // End of the definition of class GenericMultiArrays
public class GenericMethod {
public static void main(String[] args) {
    String t[]= {"A", "B", "C"};
 // It is an array of String data
 //Creating an array of Students’ data
 Student s[]  = new Student[3];
 // It is an array of String data
 s[0] = new Student("Ramesh", new int[]{ 86, 66, 96});
 s[1] = new Student("Rahul",new int[] {88, 99, 77});
 s[2] = new Student("Roads", new int[] {75, 85, 95});
 // Store the data into generic arrays
 GenericMultiArrays<String, Student> arrayData = new GenericMultiArrays<String, Student>(t, s);

 // Printing the data ...
 arrayData.printDataT(t);
 //Reverse ordering of data ...
 arrayData.reverseArrayT(t);
 // Printing the data ...
 arrayData.printDataS(s);
 //Reverse ordering of data ...
 arrayData.reverseArrayS(s);
 // Printing the array of strings
 // Printing the student’s data
 // Printing the data after reverse ordering ...
 arrayData.printDataT(t);
 // Printing the array of strings
 arrayData.printDataS(s);
 }
 // Printing the array of students

}/* 
    // --> Bounded Argument Genric Class /* 
 class GenericBound <T extends Number > {
    T [ ] array;
    GenericBound (T[] t){
        array =  t ;
    }
    double average(){
        double sum = 0.0;
        for (int i = 0 ; i < array.length ;i++)
        sum += array[i].doubleValue();
        return sum/ array.length;
    }
 } 
 public class GenericMethod {
 
    public static void main(String[] args) {
        Integer intArray[]= {1,2,3,4,5,};
        GenericBound <Integer> intData = new GenericBound<>(intArray);
        double avgInt = intData.average();
        System.out.println("Average is " + avgInt);
        Double doubleArray[] = {1.1,2.2,3.3,4.4,5.5};
        GenericBound <Double> dblData = new GenericBound <>(doubleArray);
        double avgDouble = dblData.average();
        System.out.println ("Average is " + avgDouble);

    }
 }    */         





