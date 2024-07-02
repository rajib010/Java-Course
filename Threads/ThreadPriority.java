class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " - Priority: " + getPriority());
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        MyThread t3 = new MyThread("Thread 3");

        t1.setPriority(Thread.MIN_PRIORITY); //1
        t2.setPriority(Thread.NORM_PRIORITY); //5
        t3.setPriority(Thread.MAX_PRIORITY); //10

        t1.start();
        t2.start();
        t3.start();
    }
}
