/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricar
 */
public class Fitbyte {
    private int age;
    private int heartRate;
   
    public Fitbyte(int age, int heartRate) {
        this.age = age;
        this.heartRate = heartRate;
    }
    
    public double targetHeartRate (double portionMaxHeart) {
        return (((206.3 - (0.711*this.age))- this.heartRate) * (portionMaxHeart) + this.heartRate);
    }
}
