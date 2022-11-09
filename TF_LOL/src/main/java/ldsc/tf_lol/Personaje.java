package ldsc.tf_lol;

import java.util.ArrayList;
import java.util.List;

public class Personaje {
    // Atributos
    private String nombre;
    private Tipo tipo;
    private int costo;
    private List<Habilidad> listaHabilidades;
    private List<Item> listaItems;
    
    // Constructor
    public Personaje(
            String nombre, Tipo tipo, int costo,
            List<Habilidad> listahabilidad, List<Item> listaItems) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.costo = costo;
        this.listaHabilidades = new ArrayList<>();
        this.listaItems = listaItems;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getCosto() {
        return costo;
    }
    public void setCosto(int costo) {
        this.costo = costo;
    }

    public List<Habilidad> getListaHabilidades() {
        return listaHabilidades;
    }
    public void setListaHabilidades(List<Habilidad> listaHabilidades) {
        this.listaHabilidades = listaHabilidades;
    }

    public List<Item> getListaItems() {
        return listaItems;
    }
    public void setListaItems(List<Item> listaItems) {
        this.listaItems = listaItems;
    }
}
