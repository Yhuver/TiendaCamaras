package controlador;

import modelo.Camara;
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
        boolean continuar = false;

        do {
            consola.imprimir("***** AGREGAR NUEVA CAMARA *****");
            String marcaCamara = consola.leerCadena("MARCA CAMARA: ");
            String modeloCamara = consola.leerCadena("MODELO CAMARA: ");
            String marcaPelicula = consola.leerCadena("MARCA PELICULA: ");
            char temp = consola.leerCaracter("CAMARA CON SOPORTE? S/N");
            boolean soporteCamara;
            soporteCamara = temp == 's' || temp == 'S';
            boolean confirmacion = tienda.AgregarCamara(marcaCamara, modeloCamara);
            if (confirmacion){
                consola.imprimir("registroexitoso");
                temp = consola.leerCaracter("AGREGAR NUEVA CAMARA? S/N");
                continuar=temp == 's' || temp == 'S';
            }
            else{
                consola.imprimir("ya no se pueden agregar más camaras");
                continuar=false;
            }

        }while (continuar);

        consola.imprimir(tienda.toString());
        consola.imprimir(tienda.getCamaras()[1].getMarca().getMarcaCamara());




    }
}
