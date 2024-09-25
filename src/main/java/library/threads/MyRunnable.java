package library.threads;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread using Runnable: " + Thread.currentThread().getName());
    }
}
