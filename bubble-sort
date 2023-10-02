import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{13, 10, 9, 76, 14};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){
        int i = 0;
        int j = 1;

        while(i < arr.length) {
            for (j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
            i++;
        }
        return;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }
}
