import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean salir= true;// variable salida
        int opcion;
        int retorno=0;
        // variable que va actuar para cada una de las opciones
        while (salir){
            System.out.println("1- Añadir libro");
            System.out.println("2- Buscar libro por titulo");
            System.out.println("3- Buscar libro por ISBN");
            System.out.println("4- Log in");
            System.out.println("5- Salir");

            try {
                System.out.println("Escribe una de las opciones");
                /* almaceno en la variable opcion declara en la linea 8 el contenido
                * que el usuario me haya introducido mediante el Scaner*/
                opcion = teclado.nextInt();
                retorno=0;


            switch (opcion) {
                case 1:

                    while (retorno != 1) {
                    Libro.añadirLibro();
                    System.out.println("1 - Salir");
                    System.out.println("2 - Añadir otro libro");
                    retorno=teclado.nextInt();
                    }
                    break;
            }
            //Seguridad, en caso de poner un String pedir un número
            } catch (InputMismatchException e){
                System.out.println("Por favor escriba un número ");
            }

        }
    }
}
