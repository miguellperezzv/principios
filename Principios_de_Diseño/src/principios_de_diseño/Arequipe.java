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
public class Arequipe extends Dulces {

    public Arequipe() {
        nombre = "Arequipe";
        marca = "Alpina";
        calorias = 300; 
        precio = 1500;
    }

	@Override
	int getCalorias() {
		// TODO Auto-generated method stub
		return this.calorias;
	}

}
