/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principios_de_diseño;

/**
 *
 * @author Kevin Garcia
 */
public class Chocolate extends Dulces{

    public Chocolate() {
        nombre = "Jet";
        marca = "NAcional de chocolates";
        calorias = 350; 
        precio = 300;
    }
    
    int getCalorias() {
		// TODO Auto-generated method stub
		return this.calorias;
	}
    
}
