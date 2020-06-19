/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kniffel;

import java.util.Random;

/**
 *
 * @author bekra
 */
public class Wuerfel {

    private int number;
    private int max;
    public boolean enabled;
    private int augenzahl;

    public Wuerfel(int number, int min, int max) {
        this.number = number;
        this.max = max;
        this.enabled = true;
    }

    public int randomWuerfel() {
        Random zufall = new Random(); // neues Random Objekt, namens zufall
        return augenzahl = zufall.nextInt(this.max); 
    }
    public int getAugenzahl(){
        return augenzahl;
    }
}
