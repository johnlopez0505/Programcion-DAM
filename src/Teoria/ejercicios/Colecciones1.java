package Teoria.ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Colecciones1
{

    public static void main(String[] args)
    {
        //Crea una clase denominada Colecciones1, que declare un array de numeros
        //enteros de tamaño 12 y posteriormente:
        //Rellena de forma aleatoria sus posiciones y mostramos en consola sus
        //valores.
        int[] numeros = new int[12];
        System.out.println("Lista vaciá");
        System.out.println(Arrays.toString(numeros));
        System.out.println("====================================");
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++)
        {
            numeros[i] = random.nextInt(10);
        }
        System.out.println("Lista rellena numeros aleatorios");
        System.out.println(Arrays.toString(numeros));
        System.out.println("suma de valores de la lista");
        System.out.println(sumarArrays( numeros));
        System.out.println("====================================");
        //Asigna el valor 5 al último elemento y mostramos en consola sus valores

        for (int i = 11; i < numeros.length; i++)
        {
            numeros[i] = 5;
        }
        System.out.println("Lista con el ultimo elemento valor = 5");
        System.out.println(Arrays.toString(numeros));
        System.out.println("suma de valores de la lista");
        System.out.println(sumarArrays(numeros));
        System.out.println("=============================================");

        //Cambie todos los valores, de manera que empiece el primer elemento siendo
        //3 y el resto que sea el doble del anterior (6, 9, . . . ) pero el  ́ultimo elemento
        //debe mantener el valor 5 y mostramos en consola sus valores.
        numeros = new int[]{0,0,0,0,0,0,0,0,0,0,0,5};
        for (int i = 0; i < numeros.length-1; i++)
        {
            numeros[i] =(i+1)* 3;
        }
        System.out.println("Lista con multiplos de 3 y el ultimo elemento = 5");
        System.out.println(Arrays.toString(numeros));
        System.out.println("=============================================");


        //Cambia el valor del array y divide por 3 todos los ultimo cinco valores y
        //mostramos en consola los datos.
        numeros = new int[]{3,6,9,12,15,18,21,24,27,30,33,36};
        for (int i = 7; i < numeros.length; i++)
        {
            numeros[i] /= 3;
        }
        System.out.println("Lista con los ultimos 5 valores / 3");
        System.out.println(Arrays.toString(numeros));
    }
    public static int sumarArrays(int[] numeros)
    {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++)
        {
            suma += numeros[i];
        }
        return suma;
    }

}
