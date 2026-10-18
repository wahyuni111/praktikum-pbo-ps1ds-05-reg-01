package modul5caca.guided.agregrasi;

public class Jurusan {
    private static int jumlahMahasiswa;
    private String kodeJurusan, NamaJurusan;
    private Mahasiswa[] daftarMahasiswa= new Mahasiswa[32];

    //constructor
    public Jurusan(String kodeJurusan, String NamaJurusan){
        this.kodeJurusan = kodeJurusan;
        this.NamaJurusan = NamaJurusan;
    }
    //behaviour
    public void tambahMahasiswa(Mahasiswa m){
        daftarMahasiswa[jumlahMahasiswa] = m;
        jumlahMahasiswa++;
    }
    public void displayMahasiswa(){
        System.out.println("Kode Jurusan: " + this.kodeJurusan);
        System.out.println("Nama Jurusan: " + this.NamaJurusan);

        System.out.println("Daftar Mahasiswa: ");

        for (int i = 0; i < jumlahMahasiswa; i++){
            System.out.println(i+1 + ". " + daftarMahasiswa[i].getNIM() + " - " + daftarMahasiswa[i].getNama());

        }
    }
    //getter 
    public String getKodeJurusan() {
        return this.kodeJurusan;
    }
    public String getNamaJurusan() {
        return this.NamaJurusan;
    }
    //setter 
    public void setKodeJurusan(String kodeJurusan) {
        this.kodeJurusan = kodeJurusan;
    }
    public void setNamaJurusan(String NamaJurusan) {
        this.NamaJurusan = NamaJurusan;
    }
    // Method main untuk menjalankan dan menguji relasi agregasi
    public static void main(String[] args) {
        // 1. Buat objek Jurusan
        Jurusan informatika = new Jurusan("IF01", "Informatika");

        // 2. Buat objek Mahasiswa (konsep agregasi: mahasiswa dibuat mandiri di luar jurusan)
        Mahasiswa mhs1 = new Mahasiswa("22001", "Caca");
        Mahasiswa mhs2 = new Mahasiswa("22002", "Andi");

        // 3. Masukkan mahasiswa ke jurusan
        informatika.tambahMahasiswa(mhs1);
        informatika.tambahMahasiswa(mhs2);

        // 4. Tampilkan daftar mahasiswa dalam jurusan
        informatika.displayMahasiswa();
    }
}


