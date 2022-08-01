import java.util.Scanner;

public class LinearSearch {
    // findNumber function defination 
    public static int findNumber(int arr[], int findN){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == findN) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        // take value by user
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int findN = sc.nextInt();
        //call function
        System.out.println(findNumber(arr, findN));;
    }
}
