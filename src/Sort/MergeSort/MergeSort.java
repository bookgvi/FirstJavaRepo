package Sort.MergeSort;

import java.util.Arrays;

import Interfaces.Sort;

public class MergeSort extends Merge implements Sort {
    protected int[] resArray;

    public MergeSort(int[] unsortedArr) {
        int length = unsortedArr.length;
        this.resArray = Arrays.copyOf(unsortedArr, length);
    }

    @Override
    public void makeSort(int... values) {
        int leftBound = values[0];
        int rightBound = values[1];
        if (leftBound < rightBound) {
            int mid = (rightBound + leftBound) / 2;
            makeSort(leftBound, mid);
            makeSort(mid + 1, rightBound);
            merge(this.resArray, leftBound, mid, rightBound);
        }
    }
}
