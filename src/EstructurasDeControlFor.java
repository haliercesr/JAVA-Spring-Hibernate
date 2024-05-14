public class EstructurasDeControlFor {
    public static void main(String[] args) throws Exception {
        
        /*
         * for(inicialización;condición; actualización)
         * Es una estructura de control de tipo iterativa
         * es un bucle un iterador que se repite en una estructura mas grande
         */
        int i;
        for(i=1;i<=10;i++){
            System.out.println(i);
            if(i==4) continue; //la palabra reservada "continue" hace que se salte las lineas de codigo que continuan en el scope y el bucle vuelve a empezar con el siguiente valor de i
            if(i==5) break; //la palabra reservada "break" hace que corte el bucle"
                            //"return corta el bucle al igual que el break pero ademas se pueden devolver valores"
            System.out.println(i);
        }
         
    }
}
