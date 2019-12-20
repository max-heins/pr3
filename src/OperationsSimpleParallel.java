public class OperationsSimpleParallel
{
    public static void main(String... args) throws InterruptedException {
        Operation.init(args);
        final AParallel aPa = new AParallel();
        final BParallel bPa = new BParallel();
        final CParallel cPa = new CParallel();
        aPa.start();
        bPa.start();
        cPa.start();
        aPa.join();
        bPa.join();
        cPa.join();
        System.out.println("complete");
    }
}
