package modelo;

public class Marca {

    private String direccion;
    private String marcaCamara;

    public Marca(String direccion) {
        this.direccion = direccion;
    }

    public Marca() {
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMarcaCamara() {
        return marcaCamara;
    }

    public void setMarcaCamara(String marca) {
        this.marcaCamara = marca;
    }

    @Override
    public String toString() {
        return "Marca{" +
                "direccion='" + direccion + '\'' +
                ", marcaCamara='" + marcaCamara + '\'' +
                '}';
    }
}
