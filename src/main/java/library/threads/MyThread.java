package library.threads;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread using Thread class: " + this.getName());
    }
}
