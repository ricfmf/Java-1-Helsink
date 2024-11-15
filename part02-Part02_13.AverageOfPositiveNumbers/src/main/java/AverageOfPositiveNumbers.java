
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPositive = 0;
        double sum = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0) {
                break;
            }
            
            if (num > 0) {
                totalPositive++;
                sum += num;
            }
        }
        if (totalPositive == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sum/totalPositive);
        }
    }
}
