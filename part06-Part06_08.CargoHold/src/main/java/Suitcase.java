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

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int max) {
        this.maxWeight = max;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        if ((totalWeight() + item.getWeight()) > this.maxWeight) {
            return;
        }
        items.add(item);
    }
    
    public void printItems () {
        for (Item i: this.items) {
            System.out.println(i);
        }
    }
    
    public int totalWeight () {
        int sum = 0;
        for (Item i: this.items) {
            sum += i.getWeight();
        }
        return sum;
    }
    
    public Item heaviestItem () {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item largest = this.items.get(0);
        
        for (Item i: this.items) {
            if (i.getWeight() > largest.getWeight()) {
                largest = i;
            }
        }
        
        return largest;
    }
    
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        } else if (this.items.size() == 1) {
            return items.size() + " item (" + totalWeight() + "kg)";
        }
        
        return items.size() + " items (" + totalWeight() + "kg)"; 
    }
}
