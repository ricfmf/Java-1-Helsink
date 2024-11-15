
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String name = "";
        while (true) {
            String phrase = scanner.nextLine();
            
            if (phrase.equals("")) {
                break;
            }
            
            String[] words = phrase.split(",");
            
            if (Integer.valueOf(words[1]) > oldest) {
                oldest = Integer.valueOf(words[1]);
                name = words[0];
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
