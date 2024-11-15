
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        
        Statistics stats = new Statistics();
        Statistics statsEven = new Statistics();
        Statistics statsOdd = new Statistics();
        int number;
        System.out.println("Enter numbers: ");
        number = Integer.valueOf(scanner.nextLine());
        
        while (number != -1) {
            stats.addNumber(number);
            if (number % 2 == 0) {
                statsEven.addNumber(number);
            } else {
                statsOdd.addNumber(number);
            }
            
            number = Integer.valueOf(scanner.nextLine());
        }
        System.out.println("Sum: " + stats.sum());
        System.out.println("Sum of even numbers: " + statsEven.sum());
        System.out.println("Sum of odd numbers: " + statsOdd.sum());
    }
}
