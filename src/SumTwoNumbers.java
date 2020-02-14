import Interfaces.ITwoNumbers;

public class SumTwoNumbers implements ITwoNumbers {
    private int x;
    private int y;

    SumTwoNumbers(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getSum() {
        return this.x + this.y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
