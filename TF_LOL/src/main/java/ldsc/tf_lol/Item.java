package ldsc.tf_lol;

public class Item {
    // Atributos
    private String nombre;
    private int costo;
    
    // Constructor
    public Item(String nombre, int costo) {
        this.nombre = nombre;
        this.costo = costo;
    }
    
    // Getters y Setters 
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosto() {
        return costo;
    }
    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return nombre + " - $" + costo;
    }
    
    
}
