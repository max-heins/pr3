public class CNotify extends Thread
{
    NotifyCounter noC;
    NotifyCounter noC2;

    public CNotify(NotifyCounter noC, NotifyCounter noC2)
    {
        this.noC = noC;
        this.noC2 = noC2;
    }

    public void run()
    {
        Operation.C1.exec();
        noC.setI(noC.getI()-1);
        //System.out.println("Test");
        sync(noC, Operation.C2);
        noC2.setI(noC2.getI()-1);
        sync(noC2, Operation.C3);

    }

    public void sync (NotifyCounter noC, Operation ope)
    {
            synchronized (this)
            {
                while(noC.getI()>0)
                {
                    System.out.println(noC.getI());
                    try
                    {
                        wait();
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                System.out.println("pre");
                notify();
                System.out.println("post");
                ope.exec();
            }

    }
}
