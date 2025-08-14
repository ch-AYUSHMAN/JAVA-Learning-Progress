// Introduction.
/*public class Multithreading {
    public static void main ( String [] args ){
        MyRunnable runnable = new MyRunnable();
    Thread thread = new Thread(runnable);
    thread.start();
    }
    
}

class MyRunnable implements Runnable {
    public void run(){

    }

}*/
// Basic Example Of Multithreading
/*public class Multithreading {
    public static void main (String [] args){
        TEST test1 = new TEST();
        TEST test2 = new TEST();
        Thread t1 = new Thread(test1);
        Thread t2 = new Thread ( test2);
        t1.setName("First");
        t2.setName("Second");
        t1.start();
        t2.start();
       
    }
}
class Test extends Thread {
    @Override
    public void run(){
        for ( int i = 0 ; i <= 10 ; i++){
            System.out.println(i + " " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
        }
    }
} */
class TEST implements Runnable{
    @Override
    public void run (){
        for ( int i = 0 ; i <= 5 ; i ++){
            System.out.println(i + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
            }

        }
    }

/*public class Multithreading {
public static void main (String [] args) throws InterruptedException{
    Thread t1 = new Thread (new TEST());
    Thread t2 = new Thread (new TEST());
    t1.start();
    t2.start();
    t1.join();
    t2.join();

}
    
}*/
public class Multithreading {

 public static void main( String[] args){
    Thread t1 = new Thread( new TEST(),"First");
    Thread t2 = new Thread ( new TEST(),"Second");
    t1.setPriority( 1);
    t2.setPriority(4);
    t1.start();
    t2.start();
 }
}