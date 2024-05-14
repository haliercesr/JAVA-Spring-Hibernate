import java.util.Scanner;

public class JuegoDeConsola {
    public static void main(String[] args) throws Exception {
        System.out.println("HOla, Mundo!");

        /* Las estructuras de control son elementos fundamentales que nos van a permitir
        * controlar el flujo de un programa
        * 
        */ 

        Scanner scanner =new Scanner(System.in);

        System.out.println("Bienvenido a la máquina expendedora de bebidas");
        System.out.println("Elegí una opción de las siguientes");
        System.out.println("1 - Café");
        System.out.println("2 - Mate");
        System.out.println("3 - Gaseosa");
        System.out.println("4 - Vino");
    
        int option= scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Buenísima elección");
                break;
            case 2:
                System.out.println("Debés ser Argetino, Uruguayo o Paraguayo, ¡Buena elección!");
                break;
            case 3:
                System.out.println("Tené cuidado con el azúcar porque es mala para la salud");
                break;
            case 4:
                System.out.println("Si tomaste vino no manejes, por favor");
                break;
            default:
                System.out.println("Opción no válida.Fin del programa");
                break;
        }

        if(option<=4){
        System.out.println("¡Disfrute de su bebida!");
        }
        scanner.close();
       
         
    }
}
