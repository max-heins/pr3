import java.util.concurrent.CountDownLatch;

public class CCount extends Thread
{

    private CountDownLatch latch2;
    private CountDownLatch latch;

    public CCount(CountDownLatch latch, CountDownLatch latch2)
    {
        this.latch = latch;
        this.latch2 = latch2;
    }

    public void run()
    {
        Operation.C1.exec();
        latch.countDown();
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Operation.C2.exec();
        latch2.countDown();
        try {
            latch2.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Operation.C3.exec();
    }
}
