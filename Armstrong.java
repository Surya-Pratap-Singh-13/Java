import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int original = n;

        // main logic
        while (n != 0) {
            //'r' is repersent by reminder
            int r = n%10;
            sum += r*r*r;
            n /= 10;
        }

        if (original == sum) {
            System.out.println(original + " is Armstrong Number.");
        } else {
            System.out.println(original +" is not Armstrong Number.");
        }
    }
    
}
