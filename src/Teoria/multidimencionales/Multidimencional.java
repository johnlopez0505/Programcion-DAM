package Teoria.multidimencionales;

import java.util.Arrays;
import java.util.Random;

public class Multidimencional
{
    public static void main(String[] args) {
        //int[][][] array1 = new int[2][3][3]; {{{1,2,3},{4,5,6}},{{5,4,3},{4,6,8}}};
        int[][][] array1 =
                {
                        {
                                {1, 2, 3},
                                {4, 5, 6},
                                {7, 8, 9, 10}
                        },

                        {
                                {11, 12, 13},
                                {14, 15, 16},
                                {17, 18, 19, 20}
                        }
                };
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                //System.out.print(array1 [0][0][2]+ " \n");
                System.out.print(Arrays.toString(array1[i][j]) + " \n");

            }
        }

        System.out.println("================");
        int[][][] array2 = new int[2][3][5];
        Random random = new Random();
        for (int i = 0; i < array2.length; i++)
        {
            for (int j = 0; j < array2[i].length; j++)
            {
                for (int k = 0; k < array2[i][j].length; k++)
                {
                    array2[i][j][k]= random.nextInt(99);
                }
            }
        }
        for (int i = 0; i < array2.length; i++)
        {
            for (int j = 0; j < array2[i].length; j++)
            {
                System.out.print(Arrays.toString(array2[i][j]) + " \n");
            }
        }
    }
}