import javax.print.DocFlavor;
import java.util.Scanner;

public class Utils {

     private static boolean salida=true;

    public  static boolean  getSalida() {
        return salida;
    }

    public static void setSalida(boolean salida) {
        Utils.salida = salida;
    }

    public static void inicializar(){
        Biblioteca biblioteca=new Biblioteca();
        Scanner pedir_datos=new Scanner(System.in);
        System.out.println("Bienvenido a la biblioteca");
        while (Utils.getSalida()) {
            System.out.println("Escriba el nombre de la biblioteca");
            String nombre= pedir_datos.nextLine();
            biblioteca.setNombre(nombre);


        }
        System.out.println("Que sistema de login quiere usar ");
        System.out.println("1. Entrar como usuario");
        System.out.println("2. Entrar como bibliotecario ");
        Integer opcion= pedir_datos.nextInt();
        if (opcion==1){
            System.out.println("Ha entrado como usario,esctiba su nombre");
            String nombre_usuario=pedir_datos.nextLine();
            Usuario nuevo_usuario=new Usuario();
        }

    }
}
