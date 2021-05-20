
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        boolean salir = true; // variable salida
        int opcion = 0;
        int retorno = 0;

        Utils.inicializar();
        while (salir) {
            Bibliotecario.setSalidaLogInBibliotecario(true);
            Usuario.setSalidaLogInUsuario(true);
            opcion = 0;
            System.out.println("Elegir tipo de Log in");
            System.out.println("1- Bibliotecario");
            System.out.println("2- Usuario");
            System.out.println("3- Salir de la biblioteca");
            Integer option = teclado.nextInt();
            Utils.setOpcionMenu(option);

            if (Utils.getOpcionMenu() == 1) {
                Persona.logInPersona(1);
                if (!Bibliotecario.isSalidaLogInBibliotecario()) {
                    System.out.println("Ha accedido como bibliotecario");
                    while (opcion != 10) {
                        System.out.println("1- Reservar libro");
                        System.out.println("2- Devolver libro");
                        System.out.println("3- Añadir libro");
                        System.out.println("4- Eiminar libro");
                        System.out.println("5- Crear nuevo personal");
                        System.out.println("6- Eliminar personal");
                        System.out.println("7- Mostrar usuarios");
                        System.out.println("8- Mostrar bibliotecarios");
                        System.out.println("9- Mostrar reservas");
                        System.out.println("10 Log out");
                        opcion = teclado.nextInt();
                        retorno = 0;

                        switch (opcion) {
                            case 1:

                                while (retorno != 1) {
                                    Reserva.reservarLibro();
                                    System.out.println("1 - Salir");
                                    System.out.println("2 - Reservar otro libro");
                                    retorno = teclado.nextInt();
                                }
                                break;

                            case 2:

                                while (retorno != 1) {
                                    Reserva.devolverLibro();
                                    System.out.println("1 - Salir");
                                    System.out.println("2 - Devolver otro libro");
                                    retorno = teclado.nextInt();
                                }
                                break;

                            case 3:

                                while (retorno != 1) {
                                    Libro.añadirLibro();
                                    System.out.println("1 - Salir");
                                    System.out.println("2 - Añadir otro libro");
                                    retorno = teclado.nextInt();
                                }
                                break;


                            case 4:

                                while (retorno != 1) {
                                    Libro.eliminarLibro();
                                    System.out.println("1 - Salir");
                                    System.out.println("2 - Eliminar otro libro");
                                    retorno = teclado.nextInt();
                                }
                                break;


                            case 5:

                                while (retorno != 1) {
                                    Persona.solicitarDatosPersona();
                                    System.out.println("1 - Salir");
                                    System.out.println("2 - Crear otro bibliotecario o usuario");
                                    retorno = teclado.nextInt();
                                }
                                break;

                            case 6:

                                while (retorno != 1) {
                                    Persona.eliminarPersonal();
                                    System.out.println("1 - Salir");
                                    System.out.println("2 - Eliminar otro usuario o bibliotecario");
                                    retorno = teclado.nextInt();
                                }
                                break;

                            case 7:

                                while (retorno != 1) {
                                    Usuario.mostrarUsuarios();
                                    System.out.println("1 - Salir");;
                                    retorno = teclado.nextInt();
                                }
                                break;

                            case 8:

                                while (retorno != 1) {
                                    Bibliotecario.mostrarBibliotecarios();
                                    System.out.println("1 - Salir");;
                                    retorno = teclado.nextInt();
                                }
                                break;

                            case 9:

                                while (retorno != 1) {
                                    Reserva.mostrarReservas();
                                    System.out.println("1 - Salir");
                                    retorno = teclado.nextInt();
                                }
                                break;

                        }
                    }
                } else {

                }

            } else if (Utils.getOpcionMenu() == 2) {
                Persona.logInPersona(2);
                if (!Usuario.isSalidaLogInUsuario()) {
                    System.out.println("Ha accedido como usuario");
                    while (opcion != 6) {
                        System.out.println("1- Buscar libro por titulo");
                        System.out.println("2- Buscar libro por ISBN");
                        System.out.println("3- Mostras libros");
                        System.out.println("4- Mostrar mi lista de reservas");
                        System.out.println("5- Mostrar libros disponibles");
                        System.out.println("6- Log out");
                        opcion = teclado.nextInt();
                        retorno = 0;

                        switch (opcion) {
                            case 1:

                                while (retorno != 1) {
                                    Libro.buscarTitulo();
                                    System.out.println("1 - Salir");
                                    System.out.println("2 - Buscar otro libro por título");
                                    retorno = teclado.nextInt();
                                }
                                break;

                            case 2:

                                while (retorno != 1) {
                                    Libro.buscarISBN();
                                    System.out.println("1 - Salir");
                                    System.out.println("2 - Buscar otro libro por ISBN");
                                    retorno = teclado.nextInt();
                                }
                                break;

                            case 3:

                                while (retorno != 1) {
                                    Utils.getBiblioteca().mostrarLibros();
                                    System.out.println("1 - Salir");
                                    retorno = teclado.nextInt();
                                }
                                break;

                            case 4:

                                while (retorno != 1) {
                                    Usuario.mostrarMisReservas();
                                    System.out.println("1 - Salir");
                                    retorno = teclado.nextInt();
                                }
                                break;

                            case 5:

                                while (retorno != 1) {
                                    Utils.biblioteca.mostrarLibrosDisponibles();
                                    System.out.println("1 - Salir");
                                    retorno = teclado.nextInt();
                                }
                                break;
                        }
                    }

                } else {

                }

            } else {
                salir = false;
            }
        }
        //Final del while()

        System.out.println("Gracias por usar nuestros servicios");
        System.out.println("Que tenga un bonito dia");

    }
}