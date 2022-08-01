import java.util.Scanner;

public class ChangeCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = "";

        // main logic
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'i') {
                ans += 'e';
            } else {
                ans += input.charAt(i);
            }
        }
        System.out.println(ans);
    }    
}
