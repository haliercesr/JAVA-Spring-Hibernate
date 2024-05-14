public class EstructurasDeControlIf {
    public static void main(String[] args) throws Exception {
        System.out.println("HOla, Mundo!");

        /* Las estructuras de control son elementos fundamentales que nos van a permitir
        * controlar el flujo de un programa
        * La estructura de control condicional: "IF"
        */ 

        int edad= 61;

        if(edad>18 && edad<=60){
            System.out.println("Puedes entrar a la disco");
        } else if(edad>60){
             System.out.println("No puedes entrar ya que no es para mayores de 60 años");
        }else if(edad==18){
            System.out.println("Tienes la edad justa para entrar, no te olvides de tu ID");
        }else {
            System.out.println("No tienes edad para entrar a la disco");
        }

        //La estructura de control condicional: "SWITCH"
        //¿Qué tipo de bebida te gusta

        String bebida="Mate";

        switch (bebida) {
            case "Café":
                System.out.println("Buenísima elección");
                break;
            case "Mate":
                System.out.println("Debés ser Argetino, Uruguayo o Paraguayo, ¡Buena elección!");
                break;
            case "Gaseosa":
                System.out.println("Tené cuidado con el azúcar porque es mala para la salud");
                break;
            case "Vino":
                System.out.println("Si tomaste vino no manejes, por favor");
                break;
            default:
                System.out.println("Disfrutá de tu bebida!");
                break;
        }
       
         
    }
}
