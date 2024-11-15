
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to? ");
        int num = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from? ");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        if (num2 > num) {
            System.out.println("");
        } else {
            for(int i = num2;i <= num; i++) {
                System.out.println(i);
            }   
        }
    }
}
