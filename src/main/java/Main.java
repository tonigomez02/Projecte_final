import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro = new Libro(2323, "Padrino", "Mario Puzzo", "Los mejores libros");
        Biblioteca.añadirLibro(libro);
        Scanner teclado = new Scanner(System.in);
        boolean salir = true;// variable salida
        int opcion = 0;
        int retorno = 0;
        while (salir) {
            Utils.inicializar();
        }


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