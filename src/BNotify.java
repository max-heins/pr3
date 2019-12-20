import java.util.concurrent.atomic.AtomicInteger;

public class BNotify extends Thread
{
    private OperationsParallel operations;

    public BNotify(OperationsParallel operations)
    {
        this.operations = operations;
    }

    public void run()
    {
        Operation.B1.exec();
        operations.noC.decrementAndGet();
        operations.notifyCount();
        Operation.B2.exec();
        operations.noC2.decrementAndGet();
        operations.notifyCount2();
        Operation.B3.exec();
    }
}
