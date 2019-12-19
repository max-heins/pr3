public class OperationsSimpleParallel
{
    public static void main(String... args)
    {
        Operation.init(args);
        AParallel aPa = new AParallel();
        BParallel bPa = new BParallel();
        CParallel cPa = new CParallel();
        aPa.start();
        bPa.start();
        cPa.start();
        System.out.println("complete");
    }
}
