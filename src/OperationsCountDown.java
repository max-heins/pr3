import java.util.concurrent.CountDownLatch;

public class OperationsCountDown
{
    public static void main(String[] args) throws InterruptedException
    {
        final CountDownLatch latch = new CountDownLatch(3);
        final CountDownLatch latch2 = new CountDownLatch(2);
        Operation.init(args);
        final ACount aCo = new ACount(latch, latch2);
        final BCount bCo = new BCount(latch, latch2);
        final CCount cCo = new CCount(latch, latch2);
        aCo.start();
        bCo.start();
        cCo.start();
        aCo.join();
        bCo.join();
        cCo.join();
        System.out.println("complete");
    }
}
