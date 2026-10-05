package unguided;

public class PengolahSuhu {
    public static final double NILAI_KOSONG = -1.0;
    private double[] suhuHarian;

    public PengolahSuhu(double[] suhuHarian) {
        this.suhuHarian = suhuHarian;
    }
    public void tampilkanData() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                System.out.println("Hari " + (i + 1) + " : (kosong)");
            } else {
                System.out.printf("Hari %d : %.1f°C\n", (i + 1), suhuHarian[i]);
            }
        }
    }
    public int cariIndexKosong() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                return i;
            }
        }
        return -1;
    }
    public void isiDataKosong() {
        int index = cariIndexKosong();
        if (index != -1 && index > 0 && index < suhuHarian.length - 1) {
            suhuHarian[index] = (suhuHarian[index - 1] + suhuHarian[index + 1]) / 2.0;
        }
    }
    public double hitungRataRata() {
        double total = 0;
        for (int i = 0; i < suhuHarian.length; i++) {
            total += suhuHarian[i];
        }
        return total / suhuHarian.length;
    }
    public static void main(String[] args) {
        double[] suhuHarian = { 30.4, 24.3, 26.8, -1.0, 31.4, 30.8, 32.9 };

        PengolahSuhu pengolah = new PengolahSuhu(suhuHarian);

        System.out.println("Data suhu awal sebelum pengisian:");
        pengolah.tampilkanData();
        System.out.println("\nIndex hari kosong (dimulai dari 0): " + pengolah.cariIndexKosong());
        pengolah.isiDataKosong();

        System.out.println("Data Suhu Setelah Pengisian:");
        pengolah.tampilkanData();
        System.out.printf("\nRata-rata : %.2f°C\n\n", pengolah.hitungRataRata());

        System.out.println("Isi array suhuHarian di main setelah isiDataKosong() dijalankan:");
        System.out.print("[");
        for (int i = 0; i < suhuHarian.length; i++) {
            System.out.print(suhuHarian[i]);
            if (i < suhuHarian.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("(ikut berubah: constructor menyimpan referensi array yang sama)");
    }
}