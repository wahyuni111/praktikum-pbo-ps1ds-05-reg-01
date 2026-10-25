package modul6.caca.guided.gd3;

public class Lagu {
    String pencipta;
    String judul;

    void IsiParam(String param1){
        judul = param1;
        pencipta ="Tidak dikenali";
    }
    void IsiParam(String param1, String param2){
        judul = param2;
        pencipta = param2;
    }
    void tampilkan(){
        System.out.println("Judul :"+ judul + ", pencipta:"+ pencipta);
    }

}
