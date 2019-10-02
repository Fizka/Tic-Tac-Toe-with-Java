package com.Game;

import javax.swing.text.StyledEditorKit;
import java.util.Random;

public class Player {

    private int count;
    private Boolean ArrayWithIndex [] = new Boolean[9];
    private Boolean check = true;
    int a, Mymove = 4, index = 0;
    Random r;

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
                r = new Random();
                // Losowanie liczby z zakresu [0,8] do zmiennej a.
                a = r.nextInt(9); // deklaracja i definicja zmiennej
                    if (ArrayWithIndex[a] == false) {
                        Mymove = a;
                        return Mymove;
                    }
            }


        return Mymove;
    }

}
