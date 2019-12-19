public class CParallel extends Thread
{
    public void run()
    {
        Operation.C1.exec();
        Operation.C2.exec();
        Operation.C3.exec();
    }
}
