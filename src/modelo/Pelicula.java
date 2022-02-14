package modelo;

public class Pelicula {

    private String marcaPelicula;
    private String nombre;
    private String sencibilidad;
    private String formato;

    public Pelicula(String marca, String nombre, String sencibilidad, String formato) {
        this.marcaPelicula=marca;
        this.nombre = nombre;
        this.sencibilidad = sencibilidad;
        this.formato = formato;
    }

    public Pelicula(int marcas){
    }

    public Pelicula(){

    }

    public String getMarcaPelicula() {
        return marcaPelicula;
    }

    public void setMarcaPelicula(String marca) {
        this.marcaPelicula = marca;
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
