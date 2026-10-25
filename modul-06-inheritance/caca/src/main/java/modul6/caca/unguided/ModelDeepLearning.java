package modul6.caca.unguided;

public class ModelDeepLearning extends ModelKlasifikasi {
    private int jumlahLayer;

    public ModelDeepLearning(String nama, int dataLatih, int jumlahKelas, int jumlahLayer) {
        super(nama, dataLatih, jumlahKelas);
        this.jumlahLayer = jumlahLayer;
    }

    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Jumlah layer: " + jumlahLayer);
    }

    public int hitungBiaya() {
        return super.hitungBiaya() + (jumlahLayer * 200);
    }

    public int getJumlahLayer() {
        return jumlahLayer;
    }

    public void setJumlahLayer(int jumlahLayer) {
        this.jumlahLayer = jumlahLayer;
    }
}