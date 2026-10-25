package modul6.caca.guided.gd3;

public class Main {
    public static void main(String[] args) {
        Lagu d,e;
        d=new Lagu();
        e=new Lagu();

        d.IsiParam("Lagu1");
        e.IsiParam("Lagu2","aku");
        d.tampilkan();
        e.tampilkan();
    }
}
