package com.caca.guided.guided1.manusia;

public class manusia {
    // definisi atribut
    private String nama;
    private int umur;

    //constructor ini 
    public manusia(){} //ini default constructor, kalau mau bikin constructor yang lain harus bikin default constructor juga
    public manusia(String nama){
        this.nama=nama;
    }
    public manusia(String nama, int umur){
        this.nama=nama;
        this.umur=umur;
    }

    // definisi Method ini setter
    public void setNama(String a) {
        nama = a; //kalau mau set atau assign sebuah isi harus pake setter ini
    }
    public void setUmur(int a) {
        umur = a;
        //atau bisa juga this.umur=umur; //this itu menunjuk ke atribut yang ada di class ini
    }

    //ini masuk ke method getter. 
    //method getter itu untuk mengambil isi dari atribut yang ada di class ini
    public int getUmur() {
        return umur;
    }
    public String getNama() {
        return nama;
    }
}