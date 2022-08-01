import java.util.*;
public class printFactorialUsingRecursion {
    public static int printFactorial(int n) {
        if(n == 1 || n == 0) {
            return 1;
        }
        int ans = printFactorial(n-1);
        ans *= n;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = printFactorial(n);
        System.out.println(ans);
    }
}