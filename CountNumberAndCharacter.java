import java.util.Scanner;

public class CountNumberAndCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int characterCounter = 0;
        int numberCounter = 0;

        // main logic 
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                numberCounter++;
            } else {
                characterCounter++;
            }
        }

        // Output
        System.out.println("In the string persent number is " + numberCounter + ".");
        System.out.println("In the string persent character is " + characterCounter + ".");
    }
}
