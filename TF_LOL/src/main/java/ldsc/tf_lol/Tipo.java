package ldsc.tf_lol;

public class Tipo {
    // Atributos
    private String nombre;
    private String caracteristica;
    private String region;

    // Constructor
    public Tipo(String nombre, String caracteristica, String region) {
        this.nombre = nombre;
        this.caracteristica = caracteristica;
        this.region = region;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCaracteristica() {
        return caracteristica;
    }
    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
}
