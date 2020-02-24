package Sort.MergeSort;

import Interfaces.Sort;

public class GetMergeSortedArray extends MergeSort implements Sort {
    private int length;

    public GetMergeSortedArray(int[] unsortedArr) {
        super(unsortedArr);
        this.length = unsortedArr.length;
    }

    public int[] sortedArray() {
        makeSort(0, length - 1);
        return resArray;
    }
}
