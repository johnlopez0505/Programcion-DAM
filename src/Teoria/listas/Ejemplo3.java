package Teoria.listas;

import java.util.*;

import static java.lang.System.in;

public class Ejemplo3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(in);
        //crear una lista dinamica de enteros
        List<Integer> listaEnteros = new ArrayList<>();
        // Usamos un bucle fori, rellenamos con 100 valores aleatorios  de 1 a 100 inclusive
        Random random = new Random();
        final int VALORES = 10;
        for (int i = 0; i < VALORES; i++)
        {
            listaEnteros.add(random.nextInt(100)+1) ;
        }
        //System.out.println(listaEnteros);
        //cada número se va a multiplicar por 2 y se guarda en la misma posicion
        for (int i = 0; i <listaEnteros.size(); i++)
        {
            listaEnteros.set(i, listaEnteros.get(i)*2);
        }
        //System.out.println(listaEnteros);
        // Vamos a averiguar algún número
        //usamos scanner pedimos al usuario un número
        //comprobamos si está en la lista
        // si está en la lista mostramos en consola toda la lista
        //si no está solicitamos otro número hasta que esté en la lista
        System.out.println(listaEnteros);
        int numero = -1;
        do
        {
            System.out.println("Introduce un numero entre el 1 y 200");
            numero = sc.nextInt();
            if (numero <2 || numero >200)
            {
                System.out.println(numero + " Fuera de rango");
                continue;
            }
            if (numero % 2 != 0)
            {
                System.out.println(numero + " Es impar");
            }
        }while (!listaEnteros.contains(numero));

        System.out.printf("En hora buena, %d esta en la lista%n",numero);
        System.out.printf("Se encuentra en la posicion %d%n",listaEnteros.indexOf(numero));
        System.out.println(listaEnteros);
    }
    //Metodo estatico que pasemos la lista y un elemento, nos diga si la contiene o no,
    //No se puede usar el metodo contains
    public static boolean contieneElementos(List<Integer>lista,int elemento )
    {
        /*for (int i = 0; i <lista.size; i++)
        {
            if(lista.get(i)== elemento)
                return true;
        }
        return false;*/
        for (float numero:lista)
        {
            if(numero == elemento)
                return true;
        }
        return false;
    }
}
