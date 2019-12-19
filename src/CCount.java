import java.util.concurrent.CountDownLatch;

public class CCount extends Thread
{

    private CountDownLatch latch2;

    public CCount(CountDownLatch latch2)
    {
        this.latch2 = latch2;
    }

    public void run()
    {
        Operation.C2.exec();
        latch2.countDown();
    }
}
