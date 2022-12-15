package Teoria.bucle;

import java.util.Arrays;

public class MostrarColeccion
{
    public static void main(String[] args)
    {
        String[] cadenas = {"hola", "  ","mundo"};
        //mostrar los datos con bucle for i
        for (int i = 0; i < cadenas.length; i++)
        {
            System.out.println(cadenas[i]);
        }
        System.out.println("===========");
        //mostrando datos usando un bucle for-each
        for (String cadena:cadenas)
        {
            System.out.println(cadena);
        }
        //usando la clase array
        System.out.println("=================");
        System.out.println(Arrays.toString(cadenas));
    }
}
