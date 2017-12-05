package amazon.stepByStep.sorting;

public class SelectionSort {

    public void selectionSort(int[] arr) {
        int n = arr.length;
        if(n == 0) {
            return;
        }
        for(int i=n-1; i>=0; i--) {
            int j = select(arr, i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    private int select(int[] arr, int i) {
        if(i<0)
            return -1;
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for(int j=0; j<=i; j++) {
            if(arr[j] > max) {
                max = arr[j];
                maxIndex = j;
            }
        }
        return maxIndex;
    }

}
