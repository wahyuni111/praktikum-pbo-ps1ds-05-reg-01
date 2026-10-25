package modul6.caca.guided.gd2;

public class Manager extends employee {
    private String alamat;

    public Manager(String name, String alamat){ //cara membuat constructor dalam subclass, harus memanggil constructor superclass dengan super()
        super(name);
        this.alamat = alamat;
    }
    public void tampilInformasi(){
        super.tampilNama();
        System.out.println("Alamat: "+alamat);
        System.out.println("Departemen: "+super.departemen);
    }
}
