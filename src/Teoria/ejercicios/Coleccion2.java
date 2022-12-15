package Teoria.ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Coleccion2
{
    public static void main(String[] args)
    {
        Random random = new Random();
        final int TAMANIO = 12;
        int [] enteros = new int [TAMANIO];
        for (int i = 0; i < enteros.length; i++)
        {
            enteros[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(enteros));
        System.out.println("=======================================");
        //enteros[11] =5;
        enteros [enteros.length-1] = 5;
        System.out.println(Arrays.toString(enteros));

        System.out.println("=======================================");
        for (int i = 0; i < enteros.length-1; i++)
        {
            //enteros[i]= i*3+3
            enteros[i] =(i+1)* 3;
        }
        System.out.println(Arrays.toString(enteros));


        enteros = new int[]{3,6,9,12,15,18,21,24,27,30,33,5};
        //for (int i = enteros.length-5; i < enteros.length; i++)
        for (int i = 7; i < enteros.length; i++)
        {
            enteros[i] /= 3;
        }
        System.out.println(Arrays.toString(enteros));
        //Mostrar la suma de los elementos
        int suma = sumarElementosArray(enteros);
        System.out.printf("La suma de los elementos del array vale: %d%n",suma);
        //Mostramos el valor más chico
        int menorValor = devolverMenorValor(enteros);
        System.out.printf("El menor valor del array es: %d%n",menorValor);
        //Mostrar datos formateados
        MostrarDatosFormateados();
    }

    private static void MostrarDatosFormateados()
    {
       // mostrarDatosFormateados(entero);
    }


    private static int devolverMenorValor(int[] enteros)
    {
        return 0;
    }

    private static int sumarElementosArray(int[] datos)
    {
        int suma= 0;
        /*for (int i = 0; i < datos.length; i++)
        {
            suma += datos[i];
        }
        return suma;*/

        //Bucle foreach que devuelve la suma de los elementos del array
        for(int dato:datos)
        {
            suma += dato;
        }
        return suma;
    }

}
