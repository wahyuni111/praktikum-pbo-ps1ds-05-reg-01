package modul5caca.unguided;

public class Pesanan {
    private int nomorMeja;
    private ItemPesanan[] daftarItem;
    private int jumlahItem;

    // Constructor
    public Pesanan(int nomorMeja, int kapasitas) {
        this.nomorMeja = nomorMeja;
        this.daftarItem = new ItemPesanan[kapasitas];
        this.jumlahItem = 0;
    }

    public void tambahItem(ItemPesanan item) {
        if (this.jumlahItem < this.daftarItem.length) {
            this.daftarItem[this.jumlahItem] = item;
            this.jumlahItem++;
        } else {
            System.out.println("Kapasitas pesanan sudah penuh!");
        }
    }
    public void tampilkanPesanan() {
        System.out.println("=== DAFTAR PESANAN CAFE ===");
        System.out.println("Nomor Meja: " + this.nomorMeja);
        for (int i = 0; i < this.jumlahItem; i++) {
            ItemPesanan item = this.daftarItem[i];
            System.out.println((i + 1) + ". " + item.getNamaItem() + " - Rp " + item.getRincian().getHargaTotal() 
                + " (Harga: " + item.getRincian().getHargaDasar() + ", Pajak: " + item.getRincian().getPajak() + ")");
        }
    }

    // Getter
    public int getNomorMeja() {
        return this.nomorMeja;
    }

    public ItemPesanan[] getDaftarItem() {
        return this.daftarItem;
    }

    public int getJumlahItem() {
        return this.jumlahItem;
    }

    // Setter
    public void setNomorMeja(int nomorMeja) {
        this.nomorMeja = nomorMeja;
    }

    public void setDaftarItem(ItemPesanan[] daftarItem) {
        this.daftarItem = daftarItem;
    }

    public void setJumlahItem(int jumlahItem) {
        this.jumlahItem = jumlahItem;
    }
}