package Teoria.arraychar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejemplo1
{
    public static void main(String[] args)
    {
       char[] arrayChar = {'a','b','g','5','j'};
        System.out.printf("Tamaño del array %d%n", arrayChar.length);
        System.out.println(arrayChar);
        System.out.println(Arrays.toString(arrayChar));
        arrayChar[arrayChar.length-1] = 'J';
        for (int i = 0; i < arrayChar.length; i++)
        {
            System.out.printf("En la posición %d:-- %c--%n",i,arrayChar[i]);
        }
        System.out.println("=========================================");
        System.out.println("con un foreach");
        for (char caracteres:arrayChar)
        {
            System.out.printf("CARACTER: %c%n",caracteres);
        }

        System.out.println("=======================================");
        List<Character> listaChar = new ArrayList<>();
        listaChar.add('a');listaChar.add('b');listaChar.add('g');
        listaChar.add('5');listaChar.add('j');
        System.out.printf("Tamaño de la lista %d%n",listaChar.size());
        System.out.println(listaChar);
        listaChar.set(listaChar.size()-1 ,'J');
        for (int i = 0; i < listaChar.size()-1; i++)
        {
            System.out.printf("En la posición %d:-- %c--%n",i,listaChar.get(i));
        }

        System.out.println("****************************");
        System.out.println("con un foreach");

        for (char caracter:listaChar)
        {
            System.out.printf("CARACTER: %c%n",caracter);
        }

        System.out.println("****************************");
    }
}
