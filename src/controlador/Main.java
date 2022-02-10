package controlador;

import modelo.*;
import vista.Consola;

public class Main {

    public static void main(String[] args) {
        Consola consola = new Consola();
        int cantidadCamaras = consola.leerEntero("Digita la cantidad de Camaras que desees tener en tu Tienda;");
        int cantidadCliente = consola.leerEntero("Digita la cantidad de Clientes que pertenecen a tu Tienda:");

        Tienda tienda1 = new Tienda(cantidadCliente, cantidadCamaras);

        consola.imprimir(tienda1.toString());

        tienda1.setNombre(consola.leerCadena("Digita el nombre de la Tienda:"));
        tienda1.setDireccion(consola.leerCadena("Digita la direccion de la Tienda:"));
        tienda1.setTelefono(consola.leerCadena("Digita el Telefono de la Tienda:"));

        int cantItem= consola.leerEntero("Digita la cantidad de itemes");

        Item item1 = new Item();
        item1.setReferencia(consola.leerCadena("referencia: "));
        item1.setEstado(consola.leerCadena("Estado: "));
        Marca marca1 = new Marca(consola.leerCadena("Nombre marca: "), consola.leerCadena("direccion marca: "));
        Marca marca2 = new Marca(consola.leerCadena("Nombre marca: "), consola.leerCadena("direccion marca: "));

        Modelo modelo1 = new Modelo(cantItem);
        modelo1.setNombre(consola.leerCadena("Nombre modelo "));
        boolean d = modelo1.asignarItem(item1);
        if (d){
            consola.imprimir("se asignó el item");
        }
        else {
            consola.imprimir("no se puede asignar mas items");
        }

        int cantPeliculas= consola.leerEntero("Digita la cantidad de ´peliculas deseadas");

        Pelicula pelicula1 = new Pelicula();
        pelicula1.setNombre(consola.leerCadena("Nombre pelicula: "));
        pelicula1.setFormato(consola.leerCadena("Formato: "));
        pelicula1.setSencibilidad(consola.leerCadena("Sencibilidad: "));
        pelicula1.setMarcas(marca2);

        Camara camara1 = new Camara(cantPeliculas);
        camara1.setMarcas(marca1);
        camara1.setModelos(modelo1);
        camara1.setSoporte(true);
        boolean c = camara1.asignarPelicula(pelicula1);
        if (c){
            consola.imprimir("se asignó la pelicula");
        }
        else {
            consola.imprimir("no se puede asignar mas peliculas");
        }

        Cliente cliente1 = new Cliente();
        cliente1.setNombre(consola.leerCadena("Nombre cliente"));
        cliente1.setTipoDocumento(consola.leerCadena("Tipo documento"));
        cliente1.setNumeroDocumento(consola.leerCadena("N° documento"));
        cliente1.setCamara(camara1);

        boolean b = tienda1.asignarClientes(cliente1);
        if (b){
            consola.imprimir("se registró el cliente");
        }
        else {
            consola.imprimir("no se puede registrar mas clientes");
        }

        boolean a = tienda1.asignarCamaras(camara1);
        if (a){
            consola.imprimir("se registró la camara");
        }
        else {
            consola.imprimir("no se puede registrar mas camaras");
        }

        System.out.println(tienda1);
    }
}
