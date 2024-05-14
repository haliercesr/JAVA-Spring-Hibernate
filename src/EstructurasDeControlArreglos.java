public class EstructurasDeControlArreglos {
    public static void main(String[] args) throws Exception {
        
      //ARREGLOS: estructuras de datos que tienen valores del mismo tipo bajo un mismo nombre
      // Estos valores se distrubuyen se distribuyen secuencialmente en la memoria y se puede acceder a ellos mediante un indice
      // Los arreglos son llamados tambien vectores o matrices
      // DATO IMPORTANTE: En los arreglos el indice se empieza a contar por cero y no por uno

        int[] numeros= new int[5]; //primero se coloca el tipo de dato, los corchetes significa que va a tener varios valores, el nombre de la variable, new y despues la cantidad de valores que va a tener este arreglo
        int[] numeros2={10,20,30,40}; //otra forma de declarar un array de enteros

        numeros[0]=1;
        numeros[1]=2;
        numeros[3]=3;
        numeros[4]=4;

        System.out.println(numeros); //te imprime el lugar que estan en memoria POR ESO LOS IMPRIMIMOS UNO POR UNO

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);  //cuando esta vacio, java pone como valor por default cero
        System.out.println(numeros[3]);
        System.out.println(numeros[4]);

        for (int index = 0; index < numeros.length; index++) {
          System.out.println(numeros[index]);
          
        }

        //otra forma de hacer el for es con foreach
        //la diferencia es que hay que proporcionarle el indice y numero reprecenta un valor de numeros

        int indice=0;
        for (int numero : numeros2) {
          System.out.println(numero);
          System.out.println(indice);
          indice++;
          
        }

    }
}
