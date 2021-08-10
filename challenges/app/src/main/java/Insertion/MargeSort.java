package Insertion;

import java.util.Arrays;

public class MargeSort {

    public Integer[] mergeSort(Integer[] arr) {

        int n = arr.length;
        if (n > 1) {
            int mid = n / 2;
            Integer[] left = Arrays.copyOfRange(arr, 0, mid);
            Integer[] right = Arrays.copyOfRange(arr, mid, n);
            mergeSort(left);
            mergeSort(right);
            merge(left, right, arr);


        }
        return arr ;
    }
    public void merge(Integer[] left , Integer[] right , Integer[] arr){

        int i =0 ;
        int j =0 ;
        int k =0 ;
        while (i<left.length && j <right.length){
            if (left[i] <right[j])
            { arr[k] =left[i];
                i++; }
            else {
                arr[k] = right[j];
                j++;
            }
            k++; }
        while (i< left.length){
            arr[k]=left[i];
            i++; k++;
        }
        while (j<right.length){
            arr[k]=right[j];
            j++; k++; }
    }
}
