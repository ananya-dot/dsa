// used for arrays whose elements are in range of 1 to n

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 1, 2, 3};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }



    public static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] != i + 1) swap(arr, i, arr[i] - 1);
            else i ++;
        }
    }

}
