
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while (true) {
            String phrase = scanner.nextLine();
            
            if (phrase.equals("")) {
                break;
            }
            
            String[] words = phrase.split(",");
            
            if (Integer.valueOf(words[1]) > oldest) {
                oldest = Integer.valueOf(words[1]);
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
