package Teoria.arraybidiMencionales;

import java.util.Arrays;

public class Ejemplo2
{
    public static void main(String[] args)
    {
        /*0,1,2
          3,4,5
          6,7,8
          9,10,11
        */
        int[][] array =
                {
                        {0,1,2},
                        {3,4,5},
                        {6,7,8},
                        {9,10,11}
                };
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(Arrays.toString(array[i]));
        }
        int[][] array1 =
                {
                        {0,1},
                        {2,3,4},
                        {5,6,7,8,9}
                };
        for (int i = 0; i < array1.length; i++)
        {
            System.out.println(Arrays.toString(array1[i]));
        }
    }
}
