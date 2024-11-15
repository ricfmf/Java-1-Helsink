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

public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String ans = scanner.nextLine();
            
            if (ans.equals("stop")) {
                break;
            } else if (ans.equals("add")) {
                System.out.println("To add: ");
                String task = scanner.nextLine();
                this.list.add(task);
            } else if (ans.equals("list")) {
                this.list.print();
            } else if (ans.equals("remove")) {
                System.out.println("Which one is removed? ");
                int task = Integer.valueOf(scanner.nextLine());
                this.list.remove(task);
            }
        }
    }
}
