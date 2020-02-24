import Factory.MergeSortFactory;
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
        DisplayArray.invoke(arr);
        System.out.println();

        QuickSortFactory qsf = new QuickSortFactory();
        MergeSortFactory msf = new MergeSortFactory();

        App qsApp = new App(qsf, arr);
        App msApp = new App(msf, arr);

        int[] qsSortedArr = qsApp.exec();
        int[] msSortedArr = msApp.exec();

        DisplayArray.invoke(qsSortedArr);
        System.out.println();

        DisplayArray.invoke(msSortedArr);
        System.out.println();
    }
}
