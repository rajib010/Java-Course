class MyThread {
    String res1 = "Resource 1";
    String res2 = "Resource 2";

    void methodA() {
        synchronized (res1) {
            System.out.println("Thread1: Locked resource 1");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            synchronized (res2) {
                System.out.println("Thread1: locked resource 2");
            }
        }
    }

    void methodB() {
        synchronized (res2) {
            System.out.println("Thread2: Locked resource 2");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            synchronized (res1) {
                System.out.println("Thread2: locked resource 1");
            }
        }
    }
}


public class DeadLockDemo {
    public static void main(String[] args) {
        MyThread th = new MyThread();

        new Thread() {
            @Override
            public void run() {
                th.methodA();
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                th.methodB();
            }
        }.start();
    }
}
