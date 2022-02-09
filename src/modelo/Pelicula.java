package modelo;

public class Pelicula {

    private Marca[] marcas;
    private String nombre;
    private String sencibilidad;
    private String formato;

    public Pelicula(int marcas, String nombre, String sencibilidad, String formato) {
        this.marcas=new Marca[marcas];
        this.nombre = nombre;
        this.sencibilidad = sencibilidad;
        this.formato = formato;
    }

    public Pelicula(int marcas){
        this.marcas=new Marca[marcas];
    }

    public Pelicula(){

    }

    public Marca[] getMarcas() {
        return marcas;
    }

    public void setMarcas(Marca[] marcas) {
        this.marcas = marcas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSencibilidad() {
        return sencibilidad;
    }

    public void setSencibilidad(String sencibilidad) {
        this.sencibilidad = sencibilidad;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
