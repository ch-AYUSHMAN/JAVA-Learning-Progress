package JAVA_DSA;
 // --> Bounded Argument Genric Class 
 /*
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
 public class Wildcard {
 
    public static void main(String[] args) {
        Integer intArray[]= {1,2,3,4,5,6};
        GenericBound <Integer> intData = new GenericBound<>(intArray);
        double avgInt = intData.average();
        System.out.println("Average is " + avgInt);
        Double doubleArray[] = {1.1,2.2,3.3,4.4,5.5};
        GenericBound <Double> dblData = new GenericBound <>(doubleArray);
        double avgDouble = dblData.average();
        System.out.println ("Average is " + avgDouble);

    }
 }       
              /*        WILDCARD in Java     */
public class Wildcard {
    public static void main (String [] args) {
        Integer intMarks1 [] =  {44,55,33,66,77};
        Student <Integer> s1Student = new Student<>(intMarks1);
        System.out.println("Total Marks: "+ s1Student.total());
        Integer intMarks2[] ={49,39,53,69};
        Student <Integer> s2Student = new Student<>(intMarks2);
        System.out.println("Total Marks: " + s2Student.total());
        if (s1Student.compareMarks(s2Student))
        System.out.println("Same Marks");
        else 
        System.out.println("Diffrent marks");
        Double doubleMarks1 [] = {43.5,55.5,32.5,66.5,77.0};
        Student<Double> s3Student = new Student<>(doubleMarks1);
        System.out.println ("Total Marks"+s3Student.total());
        Float floatMarks [] = {50.0f,40.0f,60.0f,65.0f};
        Student <Float> s4Student = new Student<>(floatMarks);
        System.out.println ("Total Marks"+s4Student.total());
        if (s2Student.compareMarks(s3Student))
        System.out.println("Same Marks");
        else 
        System.out.println("Diffrent marks");
        if (s3Student.compareMarks(s4Student))
        System.out.println("Same Marks");
        else 
        System.out.println("Diffrent marks");
    }  
}
class Student <T extends Number>  {
    String name;
    T []  marks;              // To store the marks of the student 
    Student( T [] marks){     // The usual constructor for the Generic class Student
       this.marks = marks;
        }                    // This method to calculate thr total of the marks obtained by a student
        double total (){
            double sum = 0.0;
        for ( int i = 0;  i < marks.length ;i++){
            sum += marks[i].doubleValue();
        }
            return (sum);
        }                   // This method compares the marks obtained by student with the other student
        boolean compareMarks(Student<?> others){
            if ( total() == others.total()){
            return true;
            }
            return false;
            
        }
}            