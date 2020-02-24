package Factory;

import Interfaces.Sort;
import Interfaces.SortFactory;
import Sort.QuickSort.GetQuickSortedArray;

public class QuickSortFactory implements SortFactory {
    @Override
    public Sort sort(int[] arr) {
        return new GetQuickSortedArray(arr);
    }
}
