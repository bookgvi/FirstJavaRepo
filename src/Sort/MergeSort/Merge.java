package Sort.MergeSort;

public class Merge {
    public void merge(int[] resArr, int leftBound, int mid, int rightBound) {
        int[] tmpArr = new int[resArr.length];
        int left = leftBound;
        int pivot = mid + 1;
        int n = rightBound - leftBound + 1;
        int i = 0;
        while (leftBound <= mid && pivot <= rightBound) {
            if (resArr[leftBound] < resArr[pivot])
                tmpArr[i++] = resArr[leftBound++];
            else if (resArr[leftBound] > resArr[pivot])
                tmpArr[i++] = resArr[pivot++];
            else {
                tmpArr[i++] = resArr[leftBound++];
                tmpArr[i++] = resArr[pivot++];
            }
        }
        while (leftBound <= mid)
            tmpArr[i++] = resArr[leftBound++];
        while (pivot <= rightBound)
            tmpArr[i++] = resArr[pivot++];
        for (i = 0; i < n; i++)
            resArr[left + i] = tmpArr[i];
    }
}
