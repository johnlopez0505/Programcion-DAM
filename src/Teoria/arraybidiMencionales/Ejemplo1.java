package Teoria.arraybidiMencionales;

import java.util.Arrays;
import java.util.Random;

public class Ejemplo1
{
    public static void main(String[] args)
    {
        int[] array0 = new int[4];
        System.out.println(Arrays.toString(array0));
        Arrays.fill(array0,7);

        System.out.println(Arrays.toString(array0));

        for (int i = 0; i < array0.length; i++)
        {
            array0[i] = 8;
        }
        System.out.println(Arrays.toString(array0));

        System.out.println("============");

        int[][] array1 = new int[3][4];
        mostrarDatosArraysBidimencionales(array1);
        //usando el método fill de la clase arrays llenamos de 7
        for (int i = 0; i < array1.length; i++)
        {
            Arrays.fill(array1[i],7);
        }

        mostrarDatosArraysBidimencionales(array1);
        
        //rellenamos los datos, no se usa la clase arrays
        Random random = new Random();
        //int numeroAleatorio = random.nextInt(10);
        for (int i = 0; i < array1.length; i++) 
        {
            for (int j = 0; j < array1[i].length ; j++)
            {
                array1[i][j] = random.nextInt(10);
            }
            System.out.println();
        }
        mostrarDatosArraysBidimencionales(array1);
    }

    private static void mostrarDatosArraysBidimencionales(int[][] array1) {
        for (int i = 0; i < array1.length; i++)
        {
            System.out.println(Arrays.toString(array1[i]));
        }
    }
}
