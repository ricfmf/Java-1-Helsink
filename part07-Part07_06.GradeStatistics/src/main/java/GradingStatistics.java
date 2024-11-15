/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricar
 */
import java.util.ArrayList;

public class GradingStatistics {
    private ArrayList<Integer> grades;
    
    public GradingStatistics() {
        this.grades = new ArrayList<>();
    }
    
    public void add (int grade) {
        this.grades.add(grade);
    } 
    
    public double average() {
        int sum = 0;
        
        for (Integer i: this.grades) {
            sum += i;
        }
        return 1.0*sum/(this.grades.size());
    }
    
    public double averagePassing() {
        int sum = 0;
        int count = 0;
        
        for (Integer i: this.grades) {
            if (i >= 50) {
                sum += i;
                count++;
            }
        }
        return 1.0*sum/count;
    }
    
    public double passPercentage() {
        int count = 0;
        
        for(Integer i: this.grades) {
            if (i >= 50) {
                count++;
            }
        }
        return (1.0*count*100)/this.grades.size();
    }
    
    public int[] gradeDistribution() {
        int[] totalGrades = new int[6];
        
        for (Integer i: this.grades) {
            if (i < 50) {
                totalGrades[0]++;
            } else if (i < 60) {
                totalGrades[1]++;
            } else if (i < 70) {
                totalGrades[2]++;
            } else if (i < 80) {
                totalGrades[3]++;
            } else if (i < 90) {
                totalGrades[4]++;
            } else {
                totalGrades[5]++;
            }
        }
        return totalGrades;
    }
    
    public int countGrades(int grade) {
       int[] distribution = gradeDistribution();
       if (grade >= 0 && grade <= 5) {
           return distribution[grade];
       }
       return 0; 
    }
}

