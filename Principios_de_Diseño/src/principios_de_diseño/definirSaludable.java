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
public  class definirSaludable {
    
    public static Dulces saludable(Dulces dulce){
        if(dulce.calorias < 150){
            dulce.saludable = true;
        }else{
            dulce.saludable = false;
        }
        return dulce;
    }
    
}
