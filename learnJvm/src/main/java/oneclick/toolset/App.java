package oneclick.toolset;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new Lock();
        Thread thread = new Thread(new Thread(new LockingThread(lock)));

        thread.start();
        Thread.sleep(1000L);
        synchronized (lock){

            lock.notify();
        }
        System.out.println("lock notified");

        thread.join();
        System.out.println("thread join done");


    }
}
