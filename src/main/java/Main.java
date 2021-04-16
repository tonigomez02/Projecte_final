import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int op1 = 0;
        int op2 = 0;
        boolean tornada = true;
        do {
            System.out.println("1- Añadir libro");
            System.out.println("2- Buscar libro por titulo");
            System.out.println("3- Buscar libro por ISBN");
            System.out.println("4- Log in");
            System.out.println("5- Salir");

            op1 = Integer.parseInt(teclado.nextLine());
            op2 = 0;

            switch (op1) {

                case 1:
                    while (op2 != 1) {
                        System.out.println("1 - Salir");
                        System.out.println("2 - Añadir otro libro");

                        op2 = Integer.parseInt(teclado.next());
                        if (op2 == 2) {
                            Libro.añadirLibro();
                            op1 = 1;
                        }
                    }
                    break;
            }

        } while (op1 != 5);
    }
}
