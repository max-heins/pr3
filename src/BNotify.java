public class BNotify extends Thread
{
    NotifyCounter NoC;
    NotifyCounter NoC2;

    public BNotify(NotifyCounter NoC, NotifyCounter NoC2)
    {
        this.NoC = NoC;
        this.NoC2 = NoC2;
    }

    public void run()
    {
        Operation.B1.exec();
        NoC.setI(NoC.getI()-1);
        Operation.B2.exec();
        NoC2.setI(NoC2.getI()-1);
        Operation.B3.exec();
    }
}
