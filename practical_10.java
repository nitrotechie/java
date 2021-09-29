public class practical_10 implements Runnable{
    public void run(){
        Lock();
    }
    public void Lock() {
        System.out.println(Thread.currentThread().getName());
        synchronized(this) {
            System.out.println("in block " + Thread.currentThread().getName());
            System.out.println("in block " + Thread.currentThread().getName() + " end");
        }
    } 
    public static void main(String[] args) {
        practical_10 p = new practical_10();
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);
        practical_10 p1 = new practical_10();
        Thread t3 = new Thread(p1);
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t1.start();
        t2.start();
        t3.start();
    }   
}