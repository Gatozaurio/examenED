package modulos;

import java.util.Random;
import java.util.Scanner;

public class ExamenED {

    static int maximoNumeroAleatorio = 30;

    public static void main(String args[]){

        System.out.println("INTRODUCE UN NUMERO: ");
        Scanner input = new Scanner(System.in);
        int numeroIntroducido = input.nextInt();        // Lee un número introducido y asigna ese número a una variable
        Random numeroAleatorio = new Random();          // Crea un nuevo objeto de la clase formulario
        int []arrayDeNumeros = new int[numeroIntroducido];  // Crea un array del tamaño del número leido por el escáner
        for(int auxiliar=0; auxiliar<numeroIntroducido; auxiliar++)
        {
            arrayDeNumeros[auxiliar] = numeroAleatorio.nextInt(ExamenED.maximoNumeroAleatorio);     // Rellena el array con números aleatorios comprendidos entre 0 y 29
        }

        ExamenED.ejecutarAlgoritmo(arrayDeNumeros);              // Ejecuta el método con el array de números aleatorios


        input.close();
    }


    public static void ejecutarAlgoritmo(int[] arrayDeNumeros){

        int numeroMenor = 0;
        int numeroMayor = ExamenED.maximoNumeroAleatorio;

        for(int auxiliar=0; auxiliar<arrayDeNumeros.length; auxiliar++)
        {
            System.out.println(arrayDeNumeros[auxiliar]);   // Imprime el número que se encuentra en esa posición del Array
            if(arrayDeNumeros[auxiliar] > numeroMenor ){              // Si el número que se encuentra en esa posición del array es mayor que numeroMenor...
                numeroMenor = arrayDeNumeros[auxiliar];               // ...asigna el valor de ese número a numeroMenor
            }

            if(arrayDeNumeros[auxiliar] < numeroMayor){               // Si el número que se encuentra en esa posición del Array es menor que numeroMayor...
                numeroMayor = arrayDeNumeros[auxiliar];               // ...asigna el valor de ese número a numeroMayor
            }
        }

        int numerosMultiplicados = numeroMayor *numeroMenor;                                        // Asigna a numerosMultiplicados el valor de numeroMayor por numeroMenor
        if (numerosMultiplicados == 0 || (numerosMultiplicados % 2 != 0)  ){
            System.out.println("NO ES");
        }else{                                                                                      // Dice si numerosMultiplicados es par o no
            System.out.println("ES");
        }

    }
}
