package modul5caca;
import modul5caca.guided.agregrasi.*;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Mahasiswa m1 = new Mahasiswa("130118383", "Caca");
        Mahasiswa m2 = new Mahasiswa("130118384", "Al");

        Jurusan j1 = new Jurusan("SD", "Sains Data");
        j1.tambahMahasiswa(m1);
        j1.tambahMahasiswa(m2);

        j1.displayMahasiswa();
    }
}