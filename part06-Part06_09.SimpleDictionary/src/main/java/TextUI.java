/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricar
 */
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary data;
    
    public TextUI (Scanner scanner, SimpleDictionary words) {
        this.data = words;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String word = scanner.nextLine();
            
            if (word.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            if (word.equals("add")) {
                System.out.println("Word: ");
                String answer = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                this.data.add(answer, translation);
                continue;
            }
            
            if (word.equals("search")) {
                System.out.println("To be translated: ");
                String answer = scanner.nextLine();
                if (this.data.translate(answer) == null) {
                    System.out.println("Word " + answer + " was not found");
                    continue;
                }
                System.out.println("Translation: " + this.data.translate(answer));
                continue;
            }
            
            System.out.println("Unknown command");
        }
    }
}
