
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        int sum = 0, total = 0, totalEven = 0, totalOdd = 0;
        
        while (true) {
            System.out.println("Give numbers: ");
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            sum += num;
            total++;
            
            if (num % 2 == 0) {
                totalEven++;
            } else{
                totalOdd++;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + total);
        System.out.println("Average: " + (1.0*sum/total));
        System.out.println("Even: " + totalEven);
        System.out.println("Odd: " + totalOdd);
    }
}
