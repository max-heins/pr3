
public class OperationsSequential
{
    public static void main(String... args) {
        Operation.init(args);
        Operation.A1.exec();
        Operation.A2.exec();
        Operation.A3.exec();
        Operation.B1.exec();
        Operation.B2.exec();
        Operation.B3.exec();
        Operation.C1.exec();
        Operation.C2.exec();
        Operation.C3.exec();
        System.out.println("complete");
    }

}
