import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0, homeWins = 0, awayWins = 0;
        
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        try (Scanner scanner = new Scanner(Paths.get(file))) {

            // we read the file until all lines have been read
            while (scanner.hasNextLine()) {
                // we read one line
                String row = scanner.nextLine();
                String parts[] = row.split(",");
                
                // we print the line that we read
                if (parts[0].equals(team)) {
                    count++;
                    if (Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])) {
                        homeWins++;
                    } else if (Integer.valueOf(parts[2]) < Integer.valueOf(parts[3])) {
                        awayWins++;
                    }
                } else if (parts[1].equals(team)) {
                    count++;
                    if (Integer.valueOf(parts[3]) > Integer.valueOf(parts[2])) {
                        homeWins++;
                    } else if (Integer.valueOf(parts[3]) < Integer.valueOf(parts[2])) {
                        awayWins++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        System.out.println("Games: " + count);
        System.out.println("Wins: " + homeWins);
        System.out.println("Losses: " + awayWins);
    }
}



