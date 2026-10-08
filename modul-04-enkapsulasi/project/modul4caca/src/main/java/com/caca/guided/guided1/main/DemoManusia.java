package com.caca.guided.guided1.main;

import com.caca.guided.guided1.manusia.manusia;
public class DemoManusia {
    public static void main(String[] args) {
        manusia arrMns[] = new manusia[3];

        //constructor pertama
        manusia objMns1 = new manusia();
        //constructor kedua
        manusia objMns2 = new manusia("John");
        //constructor ketiga
        manusia objMns3 = new manusia("Bujuri", 44);
        arrMns[0] = objMns1;
        arrMns[1] = objMns2;
        arrMns[2] = objMns3;
        for (int i=0; i<3; i++){
            System.out.println("Nama : "+arrMns[i].getNama());
            System.out.println("Umur : "+arrMns[i].getUmur());
            System.out.println();
        }
    }
}
