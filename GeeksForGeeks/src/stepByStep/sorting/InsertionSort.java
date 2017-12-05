package stepByStep.sorting;

public class InsertionSort {
    //pick element arr[i] and put it in correct position in sorted arr[0...i-1]
    public void insertionSort(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            insert(arr, i);
        }
    }

    private void insert(int[] arr, int pos) {
        if(pos>=1) {
            for(int i=0; i<pos; i++) {
                if(arr[i] > arr[pos]) {
                    //insert at index i
                    int temp = arr[i];
                    arr[i] = arr[pos];
                    int temp2;
                    for(int j=i+1; j<= pos; j++) {
                        temp2 = arr[j];
                        arr[j] = temp;
                        temp = temp2;
                    }
                }
            }
        }
    }
}
