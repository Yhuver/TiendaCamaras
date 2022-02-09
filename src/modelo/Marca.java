package modelo;

public class Marca {

    private  String direccion;

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
}
