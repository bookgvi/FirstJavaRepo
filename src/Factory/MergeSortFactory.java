package Factory;

import Interfaces.Sort;
import Interfaces.SortFactory;
import Sort.MergeSort.GetMergeSortedArray;

public class MergeSortFactory implements SortFactory {
    @Override
    public Sort sort(int[] arr) {
        return new GetMergeSortedArray(arr);
    }
}
