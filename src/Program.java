import Factory.QuickSortFactory;
import Interfaces.Sort;
import Utils.DisplayArray;
import Utils.PrepareUnsortedArray;

public class Program {
    public static void main(String args[]) {
//        System.out.println("Hello, world: Java");
//
//        int[] arr = new int[]{1, 2, 3, 4};
//        try {
//            arr[5] = 55;
//            System.out.println("Program has terminated normally");
//        } catch (Exception err) {
//            err.printStackTrace();
//        }
        int ARRAY_SIZE = 50;
        PrepareUnsortedArray pua = new PrepareUnsortedArray(ARRAY_SIZE);
        int[] arr = pua.invoke();
        QuickSortFactory qsf = new QuickSortFactory();
        App qsApp = new App(qsf, arr);
        int[] sortedArr = qsApp.exec();
        DisplayArray.invoke(sortedArr);
    }
}
