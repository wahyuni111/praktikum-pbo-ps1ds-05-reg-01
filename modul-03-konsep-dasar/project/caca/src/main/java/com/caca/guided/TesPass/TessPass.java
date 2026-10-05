package com.caca.guided.TesPass;

class TestPass {
    int i, j;

    TestPass(int a, int b) {
        i = a;
        j = b;
    }

    void calculate(int m, int n) {
        m = m * 10;
        n = n / 2;
    }

    void calculate(TestPass e) {
        e.i = e.i * 10;
        e.j = e.j / 2;
    }
}

public class TessPass {
    public static void main(String[] args) {
        TestPass obj = new TestPass(50, 100);

        int m = 10, n = 20;

        // Uji Pass by Value (variabel m dan n tidak akan berubah nilainya di main)
        obj.calculate(m, n);
        System.out.println("Nilai m dan n setelah calculate: " + m + ", " + n);

        // Uji Pass by Reference (nilai i dan j di dalam object obj bakal ikut berubah)
        obj.calculate(obj);
        System.out.println("Nilai obj.i dan obj.j setelah calculate: " + obj.i + ", " + obj.j);
    }
}