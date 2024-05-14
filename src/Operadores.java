public class Operadores {
    public static void main(String[] args) throws Exception {
        System.out.println("HOla, Mundo!");

    

      //OPERADORES: Simbolos que sirven para hacer operaciones con variables o valores
      //ARITMETICOS:

      int a = 12;
      int b = a % 2; //el resto nos puede servir por ejemplo para saber si un balor es par o impar

      //ASIGNACIÓN
      int c=5;
      c=10;
      c+=15;
      c-=5;
      c*=2;
      c/=10;
      c++;
      c--;

      //OPERADORES DE COMPARACIÓN
      boolean esMayor= a>b;
      boolean esMenor= a<b;
      boolean esIgual= a==b;
      
      System.out.println(b);
      System.out.println(c);
      System.out.println(esMayor);
      System.out.println(esMenor);
      System.out.println(esIgual);

      //OPERACIONES DE LÓGICA
      boolean condicion1=true;
      boolean condicion2=false;

      boolean resultadoAND=condicion1 && condicion2; //Si las dos son TRUE, el resultado es TRUE
      boolean resultadoOR=condicion1 || condicion2; //uno de los dos debe ser TRUE para que el resultado sea TRUE
      boolean resultadoNOT=!condicion1; //lo opuesto a lo que tenga asignado anteriormente

      /*
       * TABLA DE LA VERDAD
       * 
       * AND      OR       NOT
       *  |V|F     |V|F    v|!F
       * V|V|F    V|V|V    F|!V
       * F|F|F    F|V|F
       */

      System.out.println(resultadoAND);
      System.out.println(resultadoOR);
      System.out.println(resultadoNOT);

    }
}
