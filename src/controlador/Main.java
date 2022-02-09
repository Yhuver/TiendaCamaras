package controlador;

import modelo.Tienda;
import vista.Consola;

public class Main {

    public static void main(String[] args) {
        Consola consola = new Consola();
        int cantidadCamaras = consola.leerEntero("Digita la cantidad de Camaras que desees tener en tu Tienda;");
        int cantidadCliente = consola.leerEntero("Digita la cantidad de Clientes que pertenecen a tu Tienda:");

        Tienda tienda = new Tienda(cantidadCliente, cantidadCamaras);

        consola.imprimir(tienda.toString());

        tienda.setNombre(consola.leerCadena("Digita el nombre de la Tienda:"));
        tienda.setDireccion(consola.leerCadena("Digita la direccion de la Tienda:"));
        tienda.setTelefono(consola.leerCadena("Digita el Telefono de la Tienda:"));

        consola.imprimir(tienda.toString());




    }
}
