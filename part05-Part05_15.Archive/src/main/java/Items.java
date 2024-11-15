/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricar
 */
public class Items {
    private String code;
    private String name;
    
    public Items(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }
    
    
    
    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Bird, the objects are not equal
        if (!(compared instanceof Items)) {
            return false;
        }

        // convert the object to a Bird object
        Items comparedItem = (Items) compared;

        // if the values of the object variables are equal, the objects are, too
        return this.code.equals(comparedItem.code) ;

    }
}
