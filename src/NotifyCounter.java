public class NotifyCounter
{
    private int i;

    public NotifyCounter(int i)
    {
        this.i=i;
    }

    public int getI()
    {
        return this.i;
    }

    public void setI(int i)
    {
        this.i=i;
        System.out.println("Count");
    }

}
