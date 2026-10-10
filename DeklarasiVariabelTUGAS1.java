package STRUKTURDATA;

import java.util.LinkedList;

public class DeklarasiVariabelTUGAS1 {
    

public static void main(String[] args) {

        // 1. Variabel integer
        int StrukturBaris = 0;

        // 2. Variabel String berisi nama awal
        String KataBaru = "Darren";

        // 3. Array satu dimensi (2 digit NIM Awal saya "05")
        int[] empatAngka = {5, 10, 20, 51};

        // 4. Array dua dimensi 3 x 3 bertipe String (2 digit NIM Awal saya "05") (2 digit NIM Akhir saya "51")
        String[][] Angka = {
            {"05", "3",  "5"},
            {"14", "19", "20"},
            {"22", "27", "51"}
        };

        // 5. Linked list
        LinkedList<Integer> listAngka = new LinkedList<>();
        listAngka.add(5);
        listAngka.add(19);
        listAngka.add(44);
        listAngka.add(60);
        listAngka.add(51);

        // Menampilkan hasil
        System.out.println("StrukturBaris : " + StrukturBaris);
        System.out.println("KataBaru      : " + KataBaru);

        System.out.print("empatAngka    : ");
        for (int i = 0; i < empatAngka.length; i++) {
            System.out.print(empatAngka[i] + " ");
        }
        System.out.println();

        System.out.println("Angka (2D)    :");
        for (int i = 0; i < Angka.length; i++) {
            for (int j = 0; j < Angka[i].length; j++) {
                System.out.print(Angka[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("listAngka     : " + listAngka);
    }
}
