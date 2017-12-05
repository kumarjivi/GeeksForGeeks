package amazon.stepByStep.sorting;

import utilityMethods.ArrayUtils;

public class SortingTest {

    public static void main(String args[]) {
        SelectionSort sort = new SelectionSort();
//        int[] arr = {5,6,7,1,2,6,4,1,2,4,12,32,4};
        int[] arr = {5,0,10};
        sort.selectionSort(arr);
        ArrayUtils.printIntArray(arr);
    }
}
