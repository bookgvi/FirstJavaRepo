package Sort.QuickSort;

import Interfaces.Sort;

public class GetQuickSortedArray extends QuickSort implements Sort {
    private int length;

    public GetQuickSortedArray(int[] unsortedArr) {
        super(unsortedArr);
        this.length = unsortedArr.length;
    }

    @Override
    public int[] sortedArray() {
        makeSort(0, length - 1);
        return temArr;
    }
}
