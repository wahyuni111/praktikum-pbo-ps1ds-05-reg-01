package com.caca.guided.guided02.main;

import com.caca.guided.guided02.hargapulsa.hargaPulsa;
import com.caca.guided.guided02.hargatoken.hargaToken;

public class main {
    public static void main(String[]args){
        hargaPulsa pulsa = new hargaPulsa();
        pulsa.info();

        hargaToken token = new hargaToken();
        token.info();
    }
}
