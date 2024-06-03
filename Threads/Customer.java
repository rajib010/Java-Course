//write a simple program to show the intercommunication between threads in java

public class Customer {
    int amount = 10000;

    synchronized void withdraw(int amount) {
        System.out.println("Going to withdraw...");

        while (this.amount < amount) {
            System.out.println("Less balance; waiting for deposit...");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
        this.amount -= amount;
        System.out.println("Withdraw completed. Remaining balance: " + this.amount);
    }

    synchronized void deposit(int amount) {
        System.out.println("Going to deposit...");
        this.amount += amount;
        System.out.println("Deposit completed. Current balance: " + this.amount);
        notify();
    }
}


public class Test {
    public static void main(String[] args) {
        final Customer c = new Customer();

        new Thread() {
            public void run() {
                c.withdraw(15000);
            }
        }.start();

        new Thread() {
            public void run() {
                c.deposit(10000);
            }
        }.start();
    }
}
