
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Items> list = new ArrayList<>();
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String code = scanner.nextLine();
            if (code.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Items item = new Items(code, name);
            
            if (list.contains(item)) {
                continue;
            }
            list.add(item);
        }
        for (Items item:list) {
            System.out.println(item.getCode() + ": " + item.getName());
        }

    }
}
