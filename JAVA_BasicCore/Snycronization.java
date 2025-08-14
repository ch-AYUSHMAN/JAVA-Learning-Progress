
public class Snycronization {
    public static void main(String[] args) throws InterruptedException {
       Counter counter =new Counter();
       Thread t1 = new Thread(new MyRunnable(counter)) ;
       Thread t2 = new Thread(new MyRunnable(counter));
       Thread t3 = new Thread(new MyRunnable(counter));
       t1.start();
       t2.start();
       t3.start();
       t1.join();
       t2.join();
       t3.join();
       System.out.println("Count: " + counter.getCount());
    }
    
}
class Counter{
    private int count = 0;
    public synchronized void increment(){
        count ++;
    }
    public int getCount(){
        return count;
    }
}
class MyRunnable implements Runnable {
    
    Counter counter;
    MyRunnable (Counter counter){
        this.counter= counter;
    }
    public void run(){
        for ( int i = 0 ; i < 100; i++){
            counter.increment();
        }

    }
}