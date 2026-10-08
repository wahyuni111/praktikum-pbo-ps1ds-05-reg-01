package com.caca.unguided.main;

import com.caca.unguided.model.Dataset;
import com.caca.unguided.laporan.LaporanDataset;

public class Main {
    public static void main(String[] args) {
        Dataset ds1 = new Dataset();
        ds1.setNama("Titanic");
        ds1.setJumlahBaris(891);
        ds1.setJumlahKolom(12);
        ds1.setJumlahMissing(866);

        Dataset ds2 = new Dataset("Wine Quality");

        Dataset ds3 = new Dataset("Iris", 150, 5, 0);

        Dataset[] listData = {ds1, ds2, ds3};
        LaporanDataset view = new LaporanDataset();

        for (int i = 0; i < listData.length; i++) {
            view.cetak(listData[i]);
        }

        System.out.println("Total dataset dibuat : " + Dataset.getTotalDataset());
    }
}
