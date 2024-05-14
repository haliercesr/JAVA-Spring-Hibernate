public class EstructurasDeControlWhile {
    public static void main(String[] args) throws Exception {
        
        /*
         * While(condición)
         * Es una estructura de control de tipo iterativa
         * es un bucle un iterador que se repite en una estructura mas grande
         */
        int contador=1;

        while(contador<=5){
           System.out.println(contador);

           //Actualización de la variable, cuidado con los bucles infinitos
           contador++;
        }

        System.out.println(contador);
         
    }
}
