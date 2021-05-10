import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        boolean salir = true; // variable salida
        int opcion = 0;
        int retorno = 0;

        Utils.inicializar();
        while (salir) {
            Bibliotecario.setSalidaLogIn(true);
            opcion = 0;
            System.out.println("Elegir tipo de Log in");
            System.out.println("1- Bibliotecario");
            System.out.println("2- Invitado");
            System.out.println("3- Salir de la biblioteca");
            Integer option = teclado.nextInt();
            Utils.setOpcionMenu(option);

            if (Utils.getOpcionMenu() == 1) {
                Bibliotecario.logInBibliotecario();
                if (!Bibliotecario.isSalidaLogIn()){
                    System.out.println("Ha accedido como bibliotecario");
                    while (opcion != 7) {
                        System.out.println("1- Reservar libro");
                        System.out.println("2- Añadir libro");
                        System.out.println("3- Eliminar libro");
                        System.out.println("4- Crear Usuario");
                        System.out.println("5- Crear bibliotecario");
                        System.out.println("6- Devolver libro");
                        System.out.println("7- Log out");
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
                                    Libro.añadirLibro();
                                    System.out.println("1 - Salir");
                                    System.out.println("2 - Añadir otro libro");
                                    retorno = teclado.nextInt();
                                }
                                break;

                            case 3:

                                while (retorno != 1) {
                                    Libro.eliminarLibro();
                                    System.out.println("1 - Salir");
                                    System.out.println("2 - Añadir otro libro");
                                    retorno = teclado.nextInt();
                                }
                                break;

                            case 4:

                                while (retorno != 1) {
                                    Bibliotecario.añadirUsuario();
                                    System.out.println("1 - Salir");
                                    System.out.println("2 - Crear otro usuario");
                                    retorno = teclado.nextInt();
                                }
                                break;

                            case 5:

                                while (retorno != 1) {
                                    Bibliotecario.añadirBibliotecario();
                                    System.out.println("1 - Salir");
                                    System.out.println("2 - Crear otro bibliotecario");
                                    retorno = teclado.nextInt();
                                }
                                break;

                            case 6:

                                while (retorno != 1) {
                                    Reserva.devolverLibro();
                                    System.out.println("1 - Salir");
                                    System.out.println("2 - Devolver otro libro");
                                    retorno = teclado.nextInt();
                                }
                                break;
                        }
                    }
                }else {

                }

            } else if (Utils.getOpcionMenu() == 2) {
                System.out.println("Ha accedido como invitado");
                while (opcion != 5) {
                    System.out.println("1- Buscar libro por titulo");
                    System.out.println("2- Buscar libro por ISBN");
                    System.out.println("3- Mostras libros");
                    System.out.println("4- Mostrar lista de reservas");
                    System.out.println("5- Log out");
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
                                Reserva.mostrarReservas();
                                System.out.println("1 - Salir");
                                retorno = teclado.nextInt();
                            }
                            break;
                    }

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