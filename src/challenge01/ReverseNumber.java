package challenge01;

import java.util.Locale;
import java.util.Scanner;

public class ReverseNumber {
    public static void reverseNumber() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter positive integer number with four digits: ");
            int number = sc.nextInt();
            String reverseNumber = String.valueOf(number);
            if (number >= 1000 && number <= 9999) {
                StringBuilder stringBuilder = new StringBuilder(reverseNumber);
                System.out.println(stringBuilder.reverse());
                break;
            } else if (reverseNumber.length() < 4) {
                System.out.println("Invalid number!");
            }
        } while(true);

        sc.close();
    }
}
