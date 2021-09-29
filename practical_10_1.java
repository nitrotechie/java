public class practical_10_1 {
    int counter = 1;
    static int N;

    public void odd(){
        synchronized (this){
            while (counter < N){
                while (counter % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(counter + " " + "odd");
                counter++;
                notify();
            }
        }
    }
    public void even(){
        synchronized (this){
            while (counter < N){
                while (counter % 2 == 1) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(counter + " " + "even");
                counter++;
                notify();
            }
        }
    }
    public static void main(String[] args) {

        practical_10_1 oE = new practical_10_1();
        N = 50;
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                oE.odd();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                oE.even();
            }
        });
        t1.start();
        t2.start();
    }
}