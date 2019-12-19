public class AParallel extends Thread
{
    public void run()
    {
        Operation.A1.exec();
        Operation.A2.exec();
        Operation.A3.exec();
    }
}
