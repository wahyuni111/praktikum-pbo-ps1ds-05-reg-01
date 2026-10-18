
package modul5caca.guided.agregrasi;

public class Mahasiswa {
    private String NIM, Nama;

    public Mahasiswa(String NIM, String Nama) { //ini constructor
        this.NIM = NIM;
        this.Nama = Nama;
    }
    //getter 
    public String getNIM() {
        return this.NIM;
    }
    public String getNama() {
        return this.Nama;
    }
    //setter
    public void setNIM(String NIM) {
        this.NIM = NIM;
    } 
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
}
