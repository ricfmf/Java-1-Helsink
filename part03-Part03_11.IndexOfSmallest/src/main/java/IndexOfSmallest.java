
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> indexList = new ArrayList<>();
        int smallest = 9998, i = 0, num;
        while (true) {
            num = Integer.valueOf(scanner.nextLine());
            
            if (num == 9999){
                break;
            }
            
            if (num <= smallest) {
                smallest = num;
                indexList.add(i);
            }
            i++;
        }
        
        System.out.println("Smallest number: " + smallest);
        for (i = 0; i < indexList.size(); i++) {
            System.out.println("Found at index: " + indexList.get(i));
        }
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
