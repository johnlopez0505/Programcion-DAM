package Teoria.bucle;

import java.util.Random;

public class Bucles1
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int [] numerosEnteros1 = new int[30];
        //Mostramos los datos inicializados anteriomente
        for (int i = 0; i < numerosEnteros1.length; i++)
        {
            numerosEnteros1[i] = random.nextInt(10);
        }
        for (int i = 0; i < numerosEnteros1.length; i++)
        {
            System.out.printf("Elementos %d: %d%n",i,numerosEnteros1[i]);
        }
        System.out.println("-------=======---------");
        int [] numerosEnteros2 = {0,1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < numerosEnteros2.length; i++)
        {
            System.out.printf("Elementos %d: %d%n",i,numerosEnteros2[i]);
        }
    }
}
