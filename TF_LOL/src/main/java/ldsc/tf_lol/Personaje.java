package ldsc.tf_lol;

import java.util.ArrayList;
import java.util.List;

public class Personaje {
    // Atributos
    private String nombre;
    private String descripcion;
    private String subtitulo;
    private Tipo tipo;
    private int costo;
    private List<Habilidad> listaHabilidades;
    private List<Item> listaItems;
    
    // Constructor
    public Personaje(
            String nombre, String descripcion, String subtitulo,
            int costo, String clase, String reg) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.subtitulo = subtitulo;
        this.tipo = new Tipo(clase, reg);
        this.costo = costo;
        this.listaHabilidades = new ArrayList<>();
        this.listaItems = new ArrayList<>();
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getSubtitulo() {
        return subtitulo;
    }
    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
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

    
    
    
    public void agregarHabilidad(int indice,Habilidad skill){
        
        listaHabilidades.add(indice, skill);
    }
    
    public void agregarItem(Item objeto){
        listaItems.add(objeto);
    }
    
     public String mostrarHabilidad(int indice){
         String skill=listaHabilidades.get(indice).toString();
        return skill;
    }
    
    public String mostrarItems(){
        String obj=" ";
        for (Item objeto : listaItems) {
            obj = obj+(objeto.toString()+" - ");
        }
        return obj;
    }
    
   
}
