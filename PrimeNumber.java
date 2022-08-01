import java.util.Scanner;

import org.w3c.dom.css.Counter;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // main logic
        for (int i = 2; i <= n; i++) {
            int counter = 0;
            for (int j = 1; j <= i; j++) {
                if (i%j == 0) {
                    counter++;
                }
            }
            // print prime number
            if (counter == 2) {
                System.out.print(i + "\t");
            }
        }
    }    
}
