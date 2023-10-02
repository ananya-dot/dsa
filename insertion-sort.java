
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{13, 10, 9, 76, 14};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }
  
    public static void insertionSort(int[] arr){
        int i = 0;
        while(i < arr.length - 1){
            int j = i + 1;
            while(j > 0){
                if(arr[j - 1] > arr[j]){
                    swap(arr, j , j -1);
                    j --;
                }
                else break;
            }
            i ++;
        }
    }

}
