package modul6.caca.unguided;

public class ModelKlasifikasi extends ModelML {
    private int jumlahKelas;

    public ModelKlasifikasi(String nama, int dataLatih, int jumlahKelas) {
        super(nama, dataLatih);
        this.jumlahKelas = jumlahKelas;
    }

    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Jumlah kelas: " + jumlahKelas);
    }

    public int hitungBiaya() {
        return super.hitungBiaya() * jumlahKelas;
    }

    public int getJumlahKelas() {
        return jumlahKelas;
    }

    public void setJumlahKelas(int jumlahKelas) {
        this.jumlahKelas = jumlahKelas;
    }
}