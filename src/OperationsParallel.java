public class OperationsParallel
{
    public static void main(String[] args)
    {
        NotifyCounter noC = new NotifyCounter(3);
        NotifyCounter noC2 = new NotifyCounter(2);
        Operation.init(args);
        ANotify aNo = new ANotify(noC,noC2);
        BNotify bNo = new BNotify(noC,noC2);
        CNotify cNo = new CNotify(noC,noC2);
        aNo.start();
        bNo.start();
        cNo.start();
    }
}
