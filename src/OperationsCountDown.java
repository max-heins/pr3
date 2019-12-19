import java.util.concurrent.CountDownLatch;

public class OperationsCountDown
{
    public static void main(String[] args) throws InterruptedException
    {
        CountDownLatch latch = new CountDownLatch(3);
        CountDownLatch latch2 = new CountDownLatch(2);
        Operation.init(args);
        ACount aCo = new ACount(latch, latch2);
        BCount bCo = new BCount(latch, latch2);
        CCount cCo = new CCount(latch2);
        aCo.start();
        bCo.start();
        Operation.C1.exec();
        latch.countDown();
        latch.await();
        cCo.start();
        latch2.await();
        Operation.C3.exec();

        System.out.println("complete");
    }
}
