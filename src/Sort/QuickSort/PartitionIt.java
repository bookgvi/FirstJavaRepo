package Sort.QuickSort;

import Utils.Swap;

public class PartitionIt {
    protected int partitionIt(int[] tempArr, int leftBound, int pivot, int rightBound) {
        int leftPtr = leftBound - 1;
        int rightPtr = rightBound;
        while (true) {
            while (tempArr[++leftPtr] < pivot)
                ;
            while (rightPtr > 0 && tempArr[--rightPtr] > pivot)
                ;
            if (leftPtr >= rightPtr)
                break;
            else
                Swap.invoke(tempArr, leftPtr, rightPtr);
        }
        Swap.invoke(tempArr, leftPtr, rightBound);
        return leftPtr;
    }
}
