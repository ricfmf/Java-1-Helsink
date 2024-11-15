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
    private BirdDatabase birdlist;

    public TextUI(Scanner scanner, BirdDatabase birdlist) {
        this.scanner = scanner;
        this.birdlist = birdlist;
    }

    public void start() {

        {

            boolean shouldLoop = true;

            try {

                while (shouldLoop) {
                    System.out.print("? ");
                    //switch statments seem much eaiser to read imo

                    String command = scanner.nextLine();

                    switch (command.toLowerCase()) {
                        case "quit":

                            shouldLoop = false;
                            break;
                        case "add":
                            System.out.print("Name ");
                            String name = scanner.nextLine();
                            
                            System.out.print("Name in Latin ");
                            String latinName = scanner.nextLine();

                            birdlist.addBird(new Bird(name, latinName));

                            break;
                        case "observation":

                            name = scanner.nextLine();

                            birdlist.addObservationFromDB(name);

                            break;
                        case "all":
                            birdlist.printBirdDatabase();

                            break;
                        case "one":
                            name = scanner.nextLine();

                            birdlist.printBird(name);

                            break;
                        default:
                            System.out.println("Unknown command");

                    }

                }

                //shouldn't just catch all exceptions
            } catch (Exception error) {
                System.out.println("There was an error msg is " + error.getMessage());

            }

        }

    }
}
