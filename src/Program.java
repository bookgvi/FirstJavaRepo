import Interfaces.ITwoNumbers;

public class Program {
    public static void main(String args[]) {
        final int X = 5, Y = 5;

        System.out.println("Hello, world: Java");
        ITwoNumbers obj = new SumTwoNumbers(2, 2);
        System.out.println(obj.getSum());
        obj.setXY(X, Y);
        System.out.println(obj.getSum());
    }
}
