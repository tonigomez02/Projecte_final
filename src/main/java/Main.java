import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean salir = true;// variable salida
        int opcion = 0;
        int retorno = 0;

        Utils.inicializar();
        while (salir) {
            opcion = 0;
            System.out.println("Elegir tipo de Log in");
            System.out.println("1- Bibliotecario");
            System.out.println("2- Invitado");
            System.out.println("3- Salir de la biblioteca");
            Integer option = teclado.nextInt();
            Utils.setOpcionMenu(option);

            if (Utils.getOpcionMenu() == 1) {
                System.out.println("Ha accedido como bibliotecario");
                while (opcion != 6) {
                    System.out.println("1- Reservar libro");
                    System.out.println("2- Añadir libro");
                    System.out.println("3- Eliminar libro");
                    System.out.println("4- Crear Usuario");
                    System.out.println("5- Crear bibliotecario");
                    System.out.println("6- Log out");
                    opcion = teclado.nextInt();
                    retorno = 0;

                    switch (opcion) {
                        case 1:

                            while (retorno != 1) {
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
                                System.out.println("1 - Salir");
                                System.out.println("2 - Añadir otro libro");
                                retorno = teclado.nextInt();
                            }
                            break;

                        case 4:

                            while (retorno != 1) {
                                System.out.println("1 - Salir");
                                System.out.println("2 - Crear otro usuario");
                                retorno = teclado.nextInt();
                            }
                            break;

                        case 5:

                            while (retorno != 1) {
                                System.out.println("1 - Salir");
                                System.out.println("2 - Crear otro bibliotecario");
                                retorno = teclado.nextInt();
                            }
                            break;
                    }
                }

            } else if (Utils.getOpcionMenu() == 2) {
                System.out.println("Ha accedido como invitado");
                while (opcion != 4) {
                    System.out.println("1- Buscar libro por titulo");
                    System.out.println("2- Buscar libro por ISBN");
                    System.out.println("3- Mostras libros");
                    System.out.println("4- Log out");
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
                    }

                }

            } else {
                salir = false;
            }
        }
        System.out.println("Gracias por usar nuestros servicios");
        System.out.println("Que tenga un bonito dia");

        // variable que va actuar para cada una de las opciones
       /* while (salir) {
            //System.out.println("1- Añadir libro");//moure ;
            System.out.println("2- Buscar libro por titulo");
            System.out.println("3- Buscar libro por ISBN");
            System.out.println("4- Mostras libros");
            System.out.println("6- Salir");

            try {
                System.out.println("Escribe una de las opciones");
                *//* almaceno en la variable opcion declara en la linea 8 el contenido
         * que el usuario me haya introducido mediante el Scaner*//*
                opcion = teclado.nextInt();
                if (opcion == 6)
                retorno = 0;


                switch (opcion) {
                    case 1:

                        while (retorno != 1) {
                            Libro.añadirLibro();
                            System.out.println("1 - Salir");
                            System.out.println("2 - Añadir otro libro");
                            retorno = teclado.nextInt();
                        }
                        break;

                    case 2:

                        while (retorno != 1) {
                            Libro.buscarTitulo();
                            System.out.println("1 - Salir");
                            System.out.println("2 - Buscar otro libro por título");
                            retorno = teclado.nextInt();
                        }
                        break;

                    case 3:

                        while (retorno != 1) {
                            Libro.buscarISBN();
                            System.out.println("1 - Salir");
                            System.out.println("2 - Buscar otro libro por ISBN");
                            retorno = teclado.nextInt();
                        }
                        break;

                    case 4:

                        while (retorno != 1) {
                            biblioteca.mostrarLibros();
                            System.out.println("1 - Salir");
                            retorno = teclado.nextInt();
                        }
                        break;

                }
                //Seguridad, en caso de poner un String pedir un número
            } catch (InputMismatchException e) {
                System.out.println("Por favor escriba un número ");
            }

        }
        System.out.println("Adiós, esperemos que vuelva pronto");
    }*/
    }
}