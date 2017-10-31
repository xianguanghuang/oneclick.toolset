package oneclick.toolset;

/**
 * Created by xianguanghuang on 2017/10/31.
 */
public class LockingThread implements Runnable{
    private Lock lock;

    public LockingThread(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            System.out.println("before wait");
            synchronized (this.lock){

                this.lock.wait();
            }
            System.out.println("after wait");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
