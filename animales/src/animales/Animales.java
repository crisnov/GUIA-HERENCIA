/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

import animales.entidades.Animal;
import animales.entidades.Perro;

/**
 *
 * @author crist
 */
public class Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro = new Perro("Sticht", "Dogui", 15, "Dobermann");
        perro.alimentarse();
        
    }
    
}
