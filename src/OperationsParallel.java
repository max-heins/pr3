import java.util.concurrent.atomic.AtomicInteger;

public class OperationsParallel
{
    final Object monitor = new Object();
    final Object monitor2 = new Object();
    AtomicInteger noC = new AtomicInteger();
    AtomicInteger noC2 = new AtomicInteger();

    public static void main(String[] args) throws InterruptedException {
        OperationsParallel operations = new OperationsParallel();
        operations.noC.set(3);
        operations.noC2.set(2);
        Operation.init(args);
        final ANotify aNo = new ANotify(operations);
        final BNotify bNo = new BNotify(operations);
        final CNotify cNo = new CNotify(operations);
        aNo.start();
        bNo.start();
        cNo.start();
        aNo.join();
        bNo.join();
        cNo.join();
        System.out.println("complete");
    }

    public void sync ()
    {

        synchronized (monitor)
        {
            while(noC.get()>0)
            {
                try {
                    monitor.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void sync2 ()
    {

        synchronized (monitor2)
        {
            while(noC.get()>0)
            {
                try {
                    monitor2.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void notifyCount()
    {
        synchronized (monitor)
        {
            monitor.notifyAll();
        }
    }
    public void notifyCount2()
    {
        synchronized (monitor2)
        {
            monitor2.notifyAll();
        }
    }
}
