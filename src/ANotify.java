public class ANotify extends Thread
{
    NotifyCounter NoC;
    NotifyCounter NoC2;

    public ANotify(NotifyCounter NoC, NotifyCounter NoC2)
    {
        this.NoC = NoC;
        this.NoC2 = NoC2;
    }

    public void run()
    {
        Operation.A1.exec();
        NoC.setI(NoC.getI()-1);
        Operation.A2.exec();
        NoC2.setI(NoC2.getI()-1);
        Operation.A3.exec();
    }
}
