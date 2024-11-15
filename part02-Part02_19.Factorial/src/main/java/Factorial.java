
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number: ");
        int num = Integer.valueOf(scanner.nextLine());
        int i, total = 1;
        
        for (i = 2; i <= num; i++) {
            total = total * i;
        }
        System.out.println("Factorial: " + total);
    }
}
