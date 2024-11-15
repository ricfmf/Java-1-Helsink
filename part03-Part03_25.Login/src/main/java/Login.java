
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String pwd = scanner.nextLine();
        
        if ((username.equals("alex") && pwd.equals("sunshine")) || (username.equals("emma") && pwd.equals("haskell"))) {
            System.out.println("You have succesfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
