package modul5caca.unguided;

public class Kasir {
    private String namaKasir;

    // Constructor
    public Kasir(String namaKasir) {
        this.namaKasir = namaKasir;
    }

    public void prosesPembayaran(Pesanan pesanan) {
        double totalSubtotal = 0;
        double totalPajak = 0;
        double totalBayar = 0;

        ItemPesanan[] itemArray = pesanan.getDaftarItem();
        for (int i = 0; i < pesanan.getJumlahItem(); i++) {
            totalSubtotal += itemArray[i].getRincian().getHargaDasar();
            totalPajak += itemArray[i].getRincian().getPajak();
            totalBayar += itemArray[i].getRincian().getHargaTotal();
        }

        System.out.println("=== STRUK PEMBAYARAN KASIR ===");
        System.out.println("Kasir Bertugas : " + this.namaKasir);
        System.out.println("Pesanan        : Meja " + pesanan.getNomorMeja());
        System.out.println("Jumlah Item    : " + pesanan.getJumlahItem());
        System.out.println("Total Subtotal : Rp " + totalSubtotal);
        System.out.println("Total Pajak    : Rp " + totalPajak);
        System.out.println("TOTAL BAYAR    : Rp " + totalBayar);
        System.out.println("==============================");
    }

    // Getter
    public String getNamaKasir() {
        return this.namaKasir;
    }

    // Setter
    public void setNamaKasir(String namaKasir) {
        this.namaKasir = namaKasir;
    }
}