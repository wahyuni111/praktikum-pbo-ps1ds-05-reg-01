package modul6.caca.unguided;

public class ModelML {
    private String nama;
    private int dataLatih;

    public ModelML(String nama, int dataLatih) {
        this.nama = nama;
        this.dataLatih = dataLatih;
    }

    public void tampilInfo() {
        System.out.println("Model: " + nama + " | Data latih: " + dataLatih);
    }

    public int hitungBiaya() {
        return dataLatih * 2;
    }

    public int hitungBiaya(int epoch) {
        return dataLatih * epoch;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getDataLatih() {
        return dataLatih;
    }

    public void setDataLatih(int dataLatih) {
        this.dataLatih = dataLatih;
    }
}