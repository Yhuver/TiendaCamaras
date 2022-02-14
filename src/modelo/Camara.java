package modelo;

import java.util.Arrays;

public class Camara {

    private Marca marca;
    private Modelo modelo;
    private Pelicula[] pelicula;
    private boolean soporte;

    public Camara() {
        this.marca = new Marca();
        this.modelo = new Modelo();
        this.pelicula = new Pelicula[1];
    }



    //public Camara() {
    //}

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Pelicula[] getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula[] pelicula) {
        this.pelicula = pelicula;
    }

    public boolean isSoporte() {
        return soporte;
    }

    public void setSoporte(boolean soporte) {
        this.soporte = soporte;
    }

    @Override
    public String toString() {
        return "Camara{" +
                "marca=" + marca +
                ", modelo=" + modelo +
                ", pelicula=" + Arrays.toString(pelicula) +
                ", soporte=" + soporte +
                '}';
    }
}
