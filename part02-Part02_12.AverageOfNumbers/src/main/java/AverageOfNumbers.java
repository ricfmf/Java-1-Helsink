
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        double sum = 0.0;
        
        while (true) {
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());
                    
            if (num == 0) {
                break;
            }
            
            total = total + 1;
            sum = sum + num;
        }
        System.out.println("Average of the numbers: " + (sum / total));
    }
}
