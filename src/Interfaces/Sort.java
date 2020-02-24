package Interfaces;

public interface Sort {
    default void makeSort(int... values) {};

    default int[] sortedArray() {
        return new int[0];
    }
}
