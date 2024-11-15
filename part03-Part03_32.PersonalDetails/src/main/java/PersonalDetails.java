
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0, count = 0;
        String name = "";
        int len = 0;
        while (true) {
            String phrase = scanner.nextLine();
            
            if (phrase.equals("")) {
                break;
            }
            
            String[] words = phrase.split(",");
            sum += Integer.valueOf(words[1]);
            count ++;
            
            if ((words[0].length()) > len) {
                len = words[0].length();
                name = words[0];
            }
        }
        System.out.println("Age of the oldest: " + name);
        System.out.println("Average of the birth years: " + 1.0*sum/count);
    }
}
