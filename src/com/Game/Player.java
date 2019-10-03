package com.Game;

import java.util.Random;

public class Player {

    private int count;
    private Boolean ArrayWithIndex [] = new Boolean[9];
    private Boolean check = true;
    private int temp, Mymove = 4, index = 0;
    private Random myShot;

    
    public int Move(int tab[][]) {

        for(int i=0; i<9; i++)
            ArrayWithIndex[i] = false;

        for (int i = 1; i < 4; i++)
            for (int j = 1; j < 4; j++) {
                if(tab[i-1][j-1] == 1 || tab[i-1][j-1] == 2) {
                    ArrayWithIndex[index] = true;
                }
                index++;
            }
            while (check) {
                myShot = new Random();
                temp = myShot.nextInt(9);
                    if (ArrayWithIndex[temp] == false) {
                        Mymove = temp;
                        return Mymove;
                    }
            }
        return Mymove;
    }

}
