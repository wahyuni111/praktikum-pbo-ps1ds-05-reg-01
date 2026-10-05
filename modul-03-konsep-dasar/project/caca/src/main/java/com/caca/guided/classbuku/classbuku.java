package com.caca.guided.classbuku;

class Buku {
    private String pengarang;
    private String judul;

    public Buku() {
        this("Rumah Kita", "GoodBles");
    }

    public Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public void cetakKeLayar() {
        System.out.println("Judul : " + judul + " Pengarang : " + pengarang);
    }
}

public class classbuku {
    public static void main(String[] args) {
        Buku a, b;
        a = new Buku("Jurassic Park", "Michael Chricton");
        b = new Buku();
        a.cetakKeLayar();
        b.cetakKeLayar();
    }
}