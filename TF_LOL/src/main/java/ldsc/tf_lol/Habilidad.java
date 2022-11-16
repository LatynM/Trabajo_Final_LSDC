package ldsc.tf_lol;

public class Habilidad {
    // Atributos
    private String nombre;
    private String tipo;
    private int costo;
    
    // Constructor
    public Habilidad(String nombre, String tipo, int costo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.costo = costo;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCosto() {
        return costo;
    }
    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return nombre +" - "+ costo +" mana";
    }
    
    
}
