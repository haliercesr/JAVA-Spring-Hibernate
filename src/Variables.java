public class Variables {
    public static void main(String[] args) throws Exception {
        System.out.println("HOla, Mundo!");

        /* VARIABLE
         * Es un espacio de memoria que tiene un nombre asociado y puede contener un valir cambiante
         * DECLARACIÓN
         * Asignar el tipo de dato y el nombre de la variable sin darle un valor inicial
         * DEFINICIÓN
         * Asignar el tipo de dato y el nombre de la variable dándole o no un valor inicial
         * ASIGNACIOÓN
         * Darle un valor a la variable ya declarada
        */ 

        /*
         * TIPOS DE VARIABLES
         * Variables primitivas: ALmacenan valores básicos
         * Variables de referencia: Almacenan direcciones de memoria que apuntan a objetos
         */

         //TIPOS DE DATOS ENTEROS: byte(-128 al 127), short(-32768 al 32767), int, long
         //el valor por default en enteros hoy en dia es int
         int numero= 129;

         //TIPOS DE DATOS DECIMALES: float(6 decimales) y double
         //por default esta seteado double
         double decimales= 5.1234567890123456789;

         //TIPOS DE DATOS DE CARACTER
         //comillas simples
         char letra='s';

         //TIPO DE DATOS BOOLEANO
         boolean v = true;
         boolean f = false;

         //TIPO DE DATOS CADENA DE CARACTERES
         //comillas dobles
         String cadena = "cadena de caracteres";


         System.out.println(numero);
         System.out.println(decimales);
         System.out.println(letra);
         System.out.println(v);
         System.out.println(f);
         System.out.println(cadena);
         
    }
}
