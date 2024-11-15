
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of gift? ");
        int gift = Integer.valueOf(scan.nextLine());
        
        if (gift < 5000) {
            System.out.println("No tax!");
        } else if (gift < 25000) {
            System.out.println("tax: " + (100 + (gift-5000) * 0.08));
        } else if (gift < 55000) {
            System.out.println("tax: " + (1700 + (gift-25000) * 0.1));
        } else if (gift < 200000) {
            System.out.println("tax: " + (4700 + (gift-55000) * 0.12));
        } else if (gift < 1000000) {
            System.out.println("tax: " + (22100 + (gift-200000) * 0.15));
        } else if (gift >= 1000000) {
            System.out.println("tax: " + (142100 + (gift-1000000) * 0.17));
        }
    }
}
