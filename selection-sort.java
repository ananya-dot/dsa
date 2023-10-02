

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{13, 10, 9, 76, 14};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
  
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }

    public static void selectionSort(int[] arr){
        int last = arr.length - 1;
        for(int i = 0; i < arr.length; i ++){
            int maxIndex = findMax(arr, last);
            swap(arr, last, maxIndex);
            last --;

        }
    }

    public static int findMax(int[] arr, int end){
        int res = 0;
        for(int i = 1; i <= end; i ++){
            if(arr[i] > arr[res]) res = i;
        }
        return res ;
    }

}
