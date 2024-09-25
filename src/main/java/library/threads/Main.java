package library.threads;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        thread1.start();

        MyThread thread2 = new MyThread();
        thread2.start();
    }
}