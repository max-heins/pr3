public class BParallel extends Thread
{
    public void run()
    {
        Operation.B1.exec();
        Operation.B2.exec();
        Operation.B3.exec();
    }
}
