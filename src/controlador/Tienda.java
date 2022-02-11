package controlador;

import modelo.Camara;
import modelo.Cliente;
import modelo.Marca;
import modelo.Modelo;
import modelo.Pelicula;

import java.util.Arrays;

public class Tienda {
    private Camara[] camaras;
    private Cliente[] clientes;
    private String nombre;
    private String telefono;
    private String direccion;

    public Tienda(int clientes, int camaras, String nombre, String telefono, String direccion) {
        this.camaras = new Camara[camaras];
        this.clientes = new Cliente[clientes];
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Tienda() {

    }

    public Tienda(int clientes, int camaras){
        this.camaras = new Camara[camaras];
        this.clientes = new Cliente[clientes];
    }

    public Camara[] getCamaras() {
        return camaras;
    }

    public void setCamaras(Camara[] camaras) {
        this.camaras = camaras;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean crearCamaras(boolean soporte, String nombre) {
        boolean estado = false;
        for (int i = 0; i < camaras.length; i++) {
            if(camaras[i]==null) {
                camaras[i] = new Camara();
                camaras[i].setSoporte(soporte);
                camaras[i].setNombre(nombre);
                estado = true;
                break;
            }
        }
        return estado;
    }

    public boolean asignarClientes(Cliente cliente) {
        boolean estado = false;
        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = cliente;
            estado = true;
            break;
        }
        return estado;
    }

    @Override
    public String toString() {
        return "camaras= " + Arrays.toString(camaras) +
                "\nclientes= " + Arrays.toString(clientes) +
                "\nnombre= " + nombre +
                "\ntelefono= " + telefono +
                "\ndireccion= " + direccion;
    }
}
