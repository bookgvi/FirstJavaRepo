package Utils;

public class PrepareUnsortedArray {
    private int ARRAY_SIZE;
    private int[] arr;

    public PrepareUnsortedArray(int ARRAY_SIZE) {
        this.ARRAY_SIZE = ARRAY_SIZE;
        this.arr = new int[ARRAY_SIZE];
    }

    public int[] invoke() {
        for (int i = 0; i < ARRAY_SIZE; i++)
            this.arr[i] = (int) (Math.random() * ARRAY_SIZE + 1);
        return this.arr;
    }
}
