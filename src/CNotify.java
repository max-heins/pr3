import java.util.concurrent.atomic.AtomicInteger;

public class CNotify extends Thread
{
    private AtomicInteger noC;
    private AtomicInteger noC2;
    private OperationsParallel operations;

    public CNotify(OperationsParallel operations)
    {
        this.operations = operations;
    }

    public void run()
    {
        Operation.C1.exec();
        operations.noC.decrementAndGet();
        operations.notifyCount();
        operations.sync();
        Operation.C2.exec();
        operations.noC2.decrementAndGet();
        operations.notifyCount2();
        operations.sync2();
        Operation.C3.exec();


    }


}
