import java.util.Scanner;
public class printFabonacciUsingFactorial {
    public static int printFabonacci(int a, int b, int n) {
        if(n == 0) {
            return 1;
        }
        int sum = a + b;
        System.out.print(sum + "\t");
        sum = printFabonacci(b, sum, n-1);
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        System.out.print(a + "\t");
        System.out.print(b + "\t");
        int n = sc.nextInt();
        printFabonacci(a, b, n-2);
    }
    
}
