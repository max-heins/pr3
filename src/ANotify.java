import java.util.concurrent.atomic.AtomicInteger;

public class ANotify extends Thread
{
    private OperationsParallel operations;

    public ANotify(OperationsParallel operations)
    {
        this.operations = operations;
    }

    public void run()
    {
        Operation.A1.exec();
        operations.noC.decrementAndGet();
        operations.notifyCount();
        Operation.A2.exec();
        operations.noC2.decrementAndGet();
        operations.notifyCount2();
        Operation.A3.exec();
    }
}
