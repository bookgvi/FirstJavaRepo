package Sort.QuickSort;

import Interfaces.Sort;

import java.util.Arrays;

public class QuickSort extends PartitionIt implements Sort {
    protected int[] temArr;

    public QuickSort(int[] unsortedArr) {
        int len = unsortedArr.length;
        this.temArr = Arrays.copyOf(unsortedArr, len);
    }

    @Override
    public void makeSort(int... values) {
        int leftBound = values[0];
        int rightBound = values[1];
        if (rightBound - leftBound >= 0) {
            int pivot = temArr[rightBound];
            int partition = partitionIt(temArr, leftBound, pivot, rightBound);
            makeSort(leftBound, partition - 1);
            makeSort(partition + 1, rightBound);
        }
    }
}
