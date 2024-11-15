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

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold (int max) {
        this.maxWeight = max;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
         int sum = 0;
        for (Suitcase i: this.suitcases) {
            sum += i.totalWeight();
        }
        if (sum + suitcase.totalWeight() > this.maxWeight) {
            return;
        }
        this.suitcases.add(suitcase);
    }
    
    public void printItems() {
        for (Suitcase i: this.suitcases) {
            i.printItems();
        }
    }
    
     public int weightOfSuitcases() {
        int weight = 0;

        for (Suitcase e : this.suitcases) {
            weight += e.totalWeight();
        }
        return weight;
    }
    
    public String toString() {

        String weightOutput = " (" + weightOfSuitcases() + "kg)";
        String suitcaseOutput = "";

        if (this.suitcases.isEmpty()) {
            suitcaseOutput = "no suitcases";
        } else if (this.suitcases.size() == 1) {
            suitcaseOutput = "1 suitcase";
        } else {
            suitcaseOutput = this.suitcases.size() + " suitcases";
        }

        return suitcaseOutput + weightOutput;
    }
}

