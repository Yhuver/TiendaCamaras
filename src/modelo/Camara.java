package modelo;

import java.util.Arrays;

public class Camara {
    private Marca marcas;
    private Modelo modelos;
    private Pelicula[] peliculas;
    private boolean soporte;
    String nombre;

    public Camara(int peliculas) {
        this.peliculas = new Pelicula[peliculas];
    }

    public Camara() {
    }

    public Marca getMarcas() {
        return marcas;
    }

    public void setMarcas(Marca marcas) {
        this.marcas = marcas;
    }

    public Modelo getModelos() {
        return modelos;
    }

    public void setModelos(Modelo modelos) {
        this.modelos = modelos;
    }

    public Pelicula[] getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Pelicula[] peliculas) {
        this.peliculas = peliculas;
    }

    public boolean isSoporte() {
        return soporte;
    }

    public void setSoporte(boolean soporte) {
        this.soporte = soporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean asignarPelicula(Pelicula pelicula) {
        boolean estado = false;
        for (int i = 0; i < peliculas.length; i++) {
            peliculas[i] = pelicula;
            estado = true;
            break;
        }
        return estado;
    }

    @Override
    public String toString() {
        return "Camara{" +
                "marcas=" + marcas +
                ", modelos=" + modelos +
                ", peliculas=" + Arrays.toString(peliculas) +
                ", soporte=" + soporte +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
