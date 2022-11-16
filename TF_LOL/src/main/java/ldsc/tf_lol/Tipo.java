package ldsc.tf_lol;

public class Tipo {
    // Atributos
    private String nombre;
    private String region;

    // Constructor
    public Tipo(String nombre, String region) {
        this.nombre = nombre;
        this.region = region;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
}
