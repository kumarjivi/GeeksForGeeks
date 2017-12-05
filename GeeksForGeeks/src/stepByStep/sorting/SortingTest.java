package stepByStep.sorting;

import utilityMethods.ArrayUtils;

public class SortingTest {

    public static void main(String args[]) {

        SelectionSort sort = new SelectionSort();
        int[] arr = {5,6,7,1,2,6,4,1,2,4,12,32,4};
        System.out.println("Selection Sort: ");
        System.out.println("Before:");
        ArrayUtils.printIntArray(arr);
        sort.selectionSort(arr);
        System.out.println("After:");
        ArrayUtils.printIntArray(arr);

        InsertionSort insertionSort = new InsertionSort();
        int ins[] = {12,43,1,4,0,5,6,7};
        System.out.println("Insertion Sort: ");
        System.out.println("Before:");
        ArrayUtils.printIntArray(ins);
        insertionSort.insertionSort(ins);
        System.out.println("After:");
        ArrayUtils.printIntArray(ins);
    }
}
