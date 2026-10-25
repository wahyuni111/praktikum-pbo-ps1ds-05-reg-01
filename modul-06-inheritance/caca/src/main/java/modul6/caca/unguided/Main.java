package modul6.caca.unguided;

public class Main {
    public static void main(String[] args) {
        ModelRegresi m1 = new ModelRegresi("Regresi Linier", 500, 4);
        ModelKlasifikasi m2 = new ModelKlasifikasi("Decision Tree", 800, 3);
        ModelDeepLearning m3 = new ModelDeepLearning("Neural Network", 1000, 5, 3);

        ModelML[] listModel = new ModelML[3];
        listModel[0] = m1;
        listModel[1] = m2;
        listModel[2] = m3;

        int total = 0;

        for (int i = 0; i < listModel.length; i++) {
            listModel[i].tampilInfo();
            int biaya = listModel[i].hitungBiaya();
            System.out.println("Biaya komputasi: " + biaya);
            System.out.println("---");
            total = total + biaya;
        }

        System.out.println("Total biaya: " + total);
        System.out.println("Biaya 10 epoch (Neural Network): " + listModel[2].hitungBiaya(10));
        System.out.println("Biaya 10 epoch (Regresi Linier): " + m1.hitungBiaya(10));
        System.out.println("Biaya 10 epoch batch 50 (Regresi Linier): " + m1.hitungBiaya(10, 50));
    }
}