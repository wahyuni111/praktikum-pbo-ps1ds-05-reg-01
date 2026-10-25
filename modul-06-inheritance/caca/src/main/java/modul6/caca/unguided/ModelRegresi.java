package modul6.caca.unguided;

public class ModelRegresi extends ModelML {
    private int jumlahFitur;

    public ModelRegresi(String nama, int dataLatih, int jumlahFitur) {
        super(nama, dataLatih);
        this.jumlahFitur = jumlahFitur;
    }

    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Jumlah fitur: " + jumlahFitur);
    }

    public int hitungBiaya() {
        return super.hitungBiaya() + (jumlahFitur * 10);
    }

    public int hitungBiaya(int epoch, int batch) {
        return getDataLatih() * epoch / batch;
    }

    public int getJumlahFitur() {
        return jumlahFitur;
    }

    public void setJumlahFitur(int jumlahFitur) {
        this.jumlahFitur = jumlahFitur;
    }
}