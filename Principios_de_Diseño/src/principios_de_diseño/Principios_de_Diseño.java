/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principios_de_diseño;

import java.util.Scanner;

/**
 *
 * @author Kevin Garcia
 */
public class Principios_de_Diseño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        String compra = "";
        Cliente cl = new Cliente();
        definirSaludable df = new definirSaludable();

        Dulces[] arregloDulces = {
            new Arequipe(),
            new BomBomBum(),
            new Chocolate(),
            new Galletas(),};

        for (Dulces arregloDulce : arregloDulces) {
            arregloDulce = df.saludable(arregloDulce);
        }

        System.out.println("Bienvenido a la tienda de dulces");
        do{
            System.out.println("Que dulce desea llevar?");

            for (Dulces arregloDulce : arregloDulces) {
                System.out.println(arregloDulce.nombre);
            }

            System.out.println("Ingrese el nombre del dulce que desea llevar");
            opcion = sc.nextLine();

            for (Dulces arregloDulce : arregloDulces) {
                if (opcion.equals(arregloDulce.nombre)) {
                    cl.saldo += arregloDulce.precio;
                    if (arregloDulce.saludable) {
                        System.out.println("El dulce es saludable");
                    } else {
                        System.out.println("Advertencia: El dulce puede no ser sano");
                    }
                    System.out.print("Calorías del dulce: "+ arregloDulce.getCalorias());
                }
            }

            System.out.println("Desea comprar algo mas Y/N");
            compra = sc.nextLine();

            
        }while(compra.equals("Y") || compra.equals("y"));
        System.out.println("Su saldo es: " + cl.saldo);
        System.out.println("Con cuanto me paga?");
        cl.pago = sc.nextInt();
        cl.vueltas = cl.pago - cl.saldo;

        System.out.println("Su cambio es: " + cl.vueltas);
        System.out.println("Gracias por su compra");
    }

}
