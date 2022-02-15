package vista;

import controlador.Tienda;
import modelo.*;

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

        String pregunta = consola.leerCadena("¿Desea administrar tienda SI/NO?");
        while (pregunta.equalsIgnoreCase("SI")) {
            String agregarCamara = consola.leerCadena("¿Desea agregar camara SI/NO?");
            if (agregarCamara.equalsIgnoreCase("SI")) {
                String nombreCamara = consola.leerCadena("Digite el nombre de la camara");
                Boolean soporte = consola.leerCadena("¿La Camara tendra soporte? SI/NO").equalsIgnoreCase("SI");
                boolean creado = tienda1.crearCamaras(soporte, nombreCamara, consola.leerEntero("Digite las catidad de peliculas de la camara"));
                if (creado) {
                    consola.imprimir("La camara se registro con exito");
                    String agregarPelicula = consola.leerCadena("¿Desea agregar Pelicula a la Camara SI/NO?");
                    while (agregarPelicula.equalsIgnoreCase("SI")) {

                        String asignarPeliculaACamara = tienda1.asignarPeliculaACamara(nombreCamara, consola.leerCadena("Digite el nombre de la pelicula"), consola.leerCadena("Digite la sencibilidad de la pelicula"), consola.leerCadena("Digite el formato de la pelicula"));
                        consola.imprimir(asignarPeliculaACamara);
                        agregarPelicula = consola.leerCadena("¿Desea agregar Otra Pelicula a la Camara SI/NO?");
                    }
                    Marca marca1 = new Marca(consola.leerCadena("nombre de la marca de la camara"), consola.leerCadena("dirección de la marca"));
                    String asignarMarcaCamara = tienda1.asignarMarcaACamara(consola.leerCadena("nombre de la camara"), marca1);
                    consola.imprimir(asignarMarcaCamara);

                    Modelo modelo1 = new Modelo(consola.leerCadena("nombre del modelo de la camara"));
                    String asignarModeloCamara = tienda1.asignarModeloACamara(consola.leerCadena("nombre de la camara"), modelo1);
                    consola.imprimir(asignarModeloCamara);
                } else {
                    consola.imprimir("No se pueden crear más camaras");
                }
            }

            String agregarCliente = consola.leerCadena("¿Desea agregar cliente SI/NO?");
            if (agregarCliente.equalsIgnoreCase("SI")) {
                String nombre = consola.leerCadena("Digite el nombre del cliente");
                String tipoDocumento = consola.leerCadena("Digite el tipo de documento del cliente");
                String numeroDocumento = consola.leerCadena("Digite el numero de documento del cliente");
                Cliente cliente = new Cliente(nombre, tipoDocumento, numeroDocumento);
                boolean creado = tienda1.asignarClientes(cliente);
                if (creado) {
                    consola.imprimir("El cliente se registro con exito");
                } else {
                    consola.imprimir("No se pueden crear más clientes");
                }
            }

            String alquilarCamara = consola.leerCadena("¿Desea alquilar una camara a un Cliente SI/NO?");
            if (alquilarCamara.equalsIgnoreCase("SI")) {
                consola.imprimir("-------Estos clientes estan registrados----------");
                String clientes = tienda1.listarClientes();
                consola.imprimir(clientes);
                consola.imprimir("-------Estas Camaras estan registrados----------");
                String camaras = tienda1.listarCamaras();
                consola.imprimir(camaras);

                alquilarCamara = tienda1.alquilarCamaraAClienteConMetodosPrivados(consola.leerCadena("tipo de documento"), consola.leerCadena("numero de documento"), consola.leerCadena("nombre de la camara"));
                consola.imprimir(alquilarCamara);

                pregunta = consola.leerCadena("¿Desea seguir administramdo tienda SI/NO?");
            }

        /*String consulta = consola.leerCadena("¿Desea ingresar cliente SI/NO?");
        while (consulta.equalsIgnoreCase("SI")) {
            String agregarCliente = consola.leerCadena("¿hay un nuevo cliente?");
            if (agregarCliente.equalsIgnoreCase("SI")) {
                Cliente cliente1 = new Cliente();
                cliente1.setNombre(consola.leerCadena("Ingrese el nombre del cliente"));
                cliente1.setTipoDocumento(consola.leerCadena("Ingrese el tipo de documentacion del cliente"));
                cliente1.setNumeroDocumento(consola.leerCadena("Ingrese el numero de documentacion"));
                boolean ingresado = tienda1.asignarClientes(cliente1);
                if (ingresado) {
                    consola.imprimir("El cliente se registro con exito");
                } else {
                    consola.imprimir("No se pueden ingresar más clientes");
                }
                String nombreCamara1 = consola.leerCadena("Digite el nombre de la camara");
                Boolean soporte1 = consola.leerCadena("¿La Camara tendra soporte? SI/NO").equalsIgnoreCase("SI");
                boolean pedido = cliente1.crearCamara(soporte1, nombreCamara1);
                if (pedido) {
                    consola.imprimir("La camara se solicitó con exito");
                } else {
                    consola.imprimir("No se puede solicitar la camara");
                }
            }
            consulta = consola.leerCadena("¿Desea ingresar cliente SI/NO?");
        }*/


            System.out.println(tienda1);


        }
    }
}
