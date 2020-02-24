public class Program {
    public static void main(String args[]) {
        System.out.println("Hello, world: Java");

        int[] arr = new int[]{1, 2, 3, 4};
        try {
            arr[5] = 55;
            System.out.println("Program has terminated normally");
        } catch (Exception err) {
            err.printStackTrace();
        }
    }
}
