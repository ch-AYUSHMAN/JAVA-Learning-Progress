//ARRAYLIST

/*import java.util.ArrayList;

public class Collection {
    public static void main (String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(46);
        list.add(63);
        System.out.println("LIST: " + list);
        list.remove(1);
        System.out.println("AFTER Removal: "+ list);
        list.add(1, 25);
        System.out.println("After Insertion: " +list);
        boolean contain = list.contains(25);
        System.out.println("CONTAIN 25: " + contain);
        list.clear();
        System.out.println("After Clearing: "+ list);
    }

    
}*/

/*import java.util.LinkedList;

public class Collection {

    public static void main ( String [] args){
        LinkedList< String> list = new LinkedList<>();
        list.add(" Krish");
        list.add ("Garima");
        list.add("Anubhav");
        System.out.println("LIST" + list);
        list.offerFirst("Kriti");
        list.addLast("Lokesh");
        System.out.println("After Insertion: "+ list);
        list.removeFirst();
        list.remove(2);
        System.out.println( "After Removal: " + list);



    }

}

import java.util.Iterator;
import java.util.LinkedList;

public class Collection {

    public static void main(String [] args){
        LinkedList <Integer> list = new LinkedList<>();
        list.add(562);
        list.add(200);
        list.add(900);
        list.offerFirst(100);
 // for each loop
        for( Integer value : list){
            System.out.println( value);
// lambda expression
        }
        list.forEach(n-> System.out.println(n));
 // Iterator
        Iterator <Integer> itr = list.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
 //get element
 System.out.println("Last Element: " + list.getLast());
 // Check if Empty
 System.out.println("Is the List Empty: " + list.isEmpty());
// Find Index
System.out.println("Index of 200: "+ list.indexOf(200));
System.out.println("last Index of 200: "+ list.lastIndexOf(200));
// removing Element
System.out.println(list.removeAll(list));

    
}

    }

// HashSet

import java.util.HashSet;

public class Collection {

    public static void main ( String [] args){
        HashSet< Integer> hashSet = new HashSet<>();
        hashSet.add(55);
        hashSet.add(33);
        hashSet.add(null);
        System.out.println(hashSet);

    }
}
// TREE SET

import java.util.TreeSet;

public class Collection {

    public static void main ( String [] args){
        TreeSet< Integer> TREESet = new TreeSet<>();
        TREESet.add(55);
        TREESet.add(33);
        TREESet.add(11);
        System.out.println(TREESet);
    System.out.println(TREESet.floor(45));
    System.out.println(TREESet.ceiling(45));
    System.out.println(TREESet.pollLast());
    }
        
    }
    //HASHMAP

import java.util.HashMap;
import java.util.*;
import java.util.Collections;

public class Collection {
    
        
        public static void main(String[] args) {
            HashMap <Integer , String> hashMap = new HashMap<>();
            hashMap.put(10,"Apple" );
            hashMap.put( 12 ,"Banana");
            hashMap.put(null, null);
           // System.out.println(hashMap);
            hashMap.compute(12,(k,v) -> v + "fruit");
            hashMap.computeIfAbsent(20, k-> "Orange");
            hashMap.computeIfPresent(10, (k,v) -> "grapes");
            System.out.println(hashMap);
        }
    }

import java.util.TreeMap;

public class Collection {
    
        public static void main( String args []){
            TreeMap< Integer , String> treeMap = new TreeMap<>();
            treeMap.put(15 , "Apple");

            treeMap.put( 80 , "Mango");
            treeMap.put(11, null);
            System.out.println(treeMap);
        }

    }*/

import java.util.PriorityQueue;

public class Collection {
    
    public static void main (String args[]){
        PriorityQueue <Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(77);
        priorityQueue.add(55);
        priorityQueue.add(33);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
    }
    }