package Teoria.listas;

import java.util.Arrays;

public class Ejemplo1
{
    public static void main(String[] args)
    {
        String[] nombres = {"Juan Mena", "Pedro Solar", "Carmina Gonzalez","Juan Perez"};
        String nuevoNombre = "Jacinto Ochando";
        String[] nuevoNombres = new String[nombres.length +1];
        for (int i = 0; i < nombres.length; i++)
        {
            nuevoNombres[i] = nombres [i];
        }
        System.out.println(Arrays.toString(nuevoNombres));
        nuevoNombres[nombres.length] = nuevoNombre;
        System.out.println(Arrays.toString(nuevoNombres));


    }
}
