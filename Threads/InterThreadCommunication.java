
class AThread extends Thread {

    int amount = 10000;

    synchronized public void withdraw(int amt) {
        System.out.println("Going to withdraw....");
        if (amt > amount) {
            System.out.println("Insufficient balance, waiting for deposit....");
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        amount -= amt;
        System.out.println("Withdraw successfull");
        System.out.println("The remaining balance is Rs." + amount);
    }

    synchronized public void deposit(int amt){
        System.out.println("Going to deposit....");
        amount+=amt;
        System.out.println("Deposit successfull...");
        notify();
    }

}

public class InterThreadCommunication {

    public static void main(String[] args) {
        AThread th = new AThread();

        new Thread(){
            @Override
            public void run(){
                th.withdraw(15000);
            }
        }.start();

        new Thread(){
            @Override
            public void run(){
                th.deposit(10000);
            }
        }.start();

    }
}
