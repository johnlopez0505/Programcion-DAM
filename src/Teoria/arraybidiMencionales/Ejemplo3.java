package Teoria.arraybidiMencionales;

public class Ejemplo3
{
    final static double [][][] datos =  {{{1.4,2.5,3.7},{4.2,5.4,6.5}},{{7.4,8.1,9.5},{10.2,11.4,12.6}}};
    public static void main(String[] args)
    {
        mostrarDatos(datos);
        System.out.println("***************************************");
        double sumar = sumarDatos(datos);
        System.out.println(sumar);

    }

    private static double sumarDatos(double [][][] valores)
    {
        double sumar = 0;
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                for (int k = 0; k < valores[i][j].length; k++)
                {
                    sumar  += valores[i][j][k];
                }
            }
        }
        return sumar;
    }

    private static void mostrarDatos(double[][][] valores1)
    {
        for (int i = 0; i < valores1.length; i++)
        {
            for (int j = 0; j < valores1[i].length; j++)
            {
                for (int k = 0; k < valores1[i][j].length; k++)
                {
                    System.out.printf("datos[%d][%d][%d] = %.2f%n",i,j,k,valores1[i][j][k]);
                }
            }
        }
    }
}
