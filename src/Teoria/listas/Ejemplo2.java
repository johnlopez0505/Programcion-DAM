package Teoria.listas;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo2
{
    public static void main(String[] args)
    {
        List<String> listaNombres = new ArrayList<>();
        listaNombres.add("Juan garcia");
        listaNombres.add("John Lopez");
        listaNombres.add("Felipe Marino");
        listaNombres.add("Juan garcia");
        System.out.println(listaNombres);
        System.out.printf("Tamaño de la lista %d%n",listaNombres.size());
        listaNombres.add("Luis de la Casa");
        System.out.println(listaNombres);
        if (!listaNombres.isEmpty())
            listaNombres.remove(listaNombres.size()-1);
        System.out.println(listaNombres);
        listaNombres.remove(0);
        System.out.println(listaNombres);
        listaNombres.clear();
        System.out.println(listaNombres);
        if (!listaNombres.isEmpty())
            listaNombres.remove(0);

    }
}
