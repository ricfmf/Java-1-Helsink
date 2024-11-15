/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricar
 */
public class Book {
    String title;
    int pages;
    int pubYear;
    
    public Book(String title, int pages, int pub) {
        this.title = title;
        this.pages = pages;
        this.pubYear = pub;
    }
    
    public String getName() {
        return this.title;
    }
    
    public String toString() {
        return this.title + ", " + this.pages + " pages" + ", " + this.pubYear;
    }
}
