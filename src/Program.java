public class Program {
    public static void main(String args[]) {
        System.out.println("Hello, world: Java");
        int a = 0b1111_0000;
        System.out.println(~a);

        int arr[], b = 1;
        arr = new int[4];
        for (int i = 0, length = arr.length; i < length; i++){
            arr[i] = b++;
        }
        for (int i = 0, length = arr.length; i < length; i++){
            System.out.println(arr[i]);
        }
    }
}
