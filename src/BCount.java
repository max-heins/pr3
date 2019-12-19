import java.util.concurrent.CountDownLatch;

public class BCount extends Thread
{

    private CountDownLatch latch;
    private CountDownLatch latch2;

    public BCount(CountDownLatch latch, CountDownLatch latch2)
    {
        this.latch = latch;
        this.latch2 = latch2;
    }

    public void run()
    {
        Operation.B1.exec();
        latch.countDown();
        Operation.B2.exec();
        latch2.countDown();
        Operation.B3.exec();
    }
}
