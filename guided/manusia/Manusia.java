package guided.manusia;

public class Manusia {

    private String nama;
    private int tinggi;

    void setInfo(String nama, int tinggi) {
        this.nama = nama;
        this.tinggi = tinggi;
    }

    void info() {
        System.out.println(this.nama + " Memiliki Tinggi " + this.tinggi + "cm");
    }

    public static void main(String[] args) {
        Manusia manusia = new Manusia();

        manusia.setInfo("Hermawan", 180);
        manusia.info();
    }
}