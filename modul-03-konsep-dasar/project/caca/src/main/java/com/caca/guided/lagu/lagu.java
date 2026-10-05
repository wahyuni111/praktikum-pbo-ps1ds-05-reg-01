package com.caca.guided.lagu;

class LaguModel {
    private String pencipta;
    private String judul;

    public void isiParam(String judul, String pencipta) {
        this.judul = judul;
        this.pencipta = pencipta;
    }

    public void cetakKeLayar() {
        if (judul == null && pencipta == null) {
            return;
        }
        System.out.println("Judul : " + judul + ", Pencipta : " + pencipta);
    }
}

public class lagu {
    public static void main(String[] args) {
        LaguModel a = new LaguModel();
        a.isiParam("God Will Make A Way", "Don Moen");
        a.cetakKeLayar();
    }
}