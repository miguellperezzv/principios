package principios_de_diseño;

public abstract class Dulces {
    String nombre;
    String marca;
    int precio;
    int calorias;
    boolean saludable;
    
    abstract int getCalorias();
}
