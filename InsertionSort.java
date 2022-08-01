import java.util.Scanner;

public class InsertionSort {
    public static int sortArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // print sorted array 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        // take value by user
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // call insertion sort algorithm
        sortArray(arr);
    }
}
