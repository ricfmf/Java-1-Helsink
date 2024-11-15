
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String phrase = scanner.nextLine();
            
            if (phrase.equals("")) {
                break;
            }
            
            String[] words = phrase.split(" ");
            
            for (int i = 0; i < words.length; i++) {
                System.out.println(words[i]);
            }
        }
    }
}
