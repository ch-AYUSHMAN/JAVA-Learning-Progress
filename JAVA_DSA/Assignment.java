package JAVA_DSA;

public class Assignment  <T>{
    private T value;
    public void set (T val){
        value = val;}
        public T get ()
        {return value;}
        public static void main ( String args[]){
            Assignment <String> box = new Assignment<>();
            box.set ("NPTEL");
            System.out.println(box.get());

        }
    }
    

