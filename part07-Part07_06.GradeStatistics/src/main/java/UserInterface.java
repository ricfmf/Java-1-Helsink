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
    private Scanner scanner;
    private GradingStatistics grades;
    
    
    public UserInterface(Scanner scanner, GradingStatistics grades) {
        this.scanner = scanner;
        this.grades = grades;
    }
    
    public void start() {
        
        while (true) {
            System.out.println("Enter point total, -1 stops:");
            int point = Integer.valueOf(scanner.nextLine());
            if (point == -1) {
                break;
            }
            if (point >= 0 && point < 101) {
                this.grades.add(point);
            }
        }
        System.out.println("Point average (all): " + grades.average());
        if (grades.averagePassing() <= 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + grades.averagePassing());
        }
        System.out.println("Pass percentage: " + grades.passPercentage());
        System.out.println("Grade distribtion: ");
        
        for (int i = 5; i >= 0 ; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < grades.countGrades(i); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
