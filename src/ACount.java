import java.util.concurrent.CountDownLatch;

public class ACount extends Thread
{
    private CountDownLatch latch;
    private CountDownLatch latch2;

    public ACount(CountDownLatch latch, CountDownLatch latch2)
    {
        this.latch = latch;
        this.latch2 = latch2;
    }

    public void run()
    {
        Operation.A1.exec();
        latch.countDown();
        Operation.A2.exec();
        latch2.countDown();
        Operation.A3.exec();
    }
}
