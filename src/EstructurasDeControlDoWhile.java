public class EstructurasDeControlDoWhile {
    public static void main(String[] args) throws Exception {
        
        /*
         * Do{accion que se quiere hacer}While(condición)
         * Es una estructura de control de tipo iterativa
         * es un bucle un iterador que se repite en una estructura mas grande
         * permite que se ejecute primero el codigo que esta en do{} y despues se evalua la condicion en while
         */
        int contador=1;

        do{
            System.out.println("Esto sucede antes de la condición");
            System.out.println(contador);
            //Actualización de la variable, cuidado con los bucles infinitos
            contador++;
        } while(contador<=5);

        System.out.println(contador);
         
    }
}
