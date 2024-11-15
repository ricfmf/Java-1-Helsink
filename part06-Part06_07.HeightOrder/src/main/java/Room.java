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

public class Room {
    private ArrayList<Person> people;
    
    public Room() {
        this.people = new ArrayList<>();
    }
    
    public void add (Person person) {
        this.people.add(person);
    }
    
    public boolean isEmpty() {
        if (this.people.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons() {
        return this.people;
    }
    
    public Person shortest() {
        if (this.people.isEmpty()) {
            return null;
        }
        Person shortest = this.people.get(0);
        
        for (Person i: this.people) {
            if (i.getHeight() < shortest.getHeight()) {
                shortest = i;
            }
        }
        
        return shortest;
    }
    
    public Person take () {
        if (this.people.isEmpty()) {
            return null;
        }
        Person shortestPerson = shortest();
        
        this.people.remove(shortestPerson);
        return shortestPerson;
    }
}
