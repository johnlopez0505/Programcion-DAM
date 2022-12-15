package Teoria.bucle2;

public class Bucle2
{
    public static void main(String[] args)
    {
        float [] numeroFloat = {1,2.3f,3.7f,4};
        for (int i = 0; i < numeroFloat.length; i++)
        {
            System.out.printf("%d: %.2f%n", i, numeroFloat[i]);
        }
        System.out.println("==================");

        //recorremos usando un for-each
        for (float numero:numeroFloat)
        {
            System.out.printf( "%.2f%n", numero);
        }
    }
}
