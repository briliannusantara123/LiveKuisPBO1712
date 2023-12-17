/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LiveKuis;

/**
 *
 * @author inteL
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Mesin mesinHonda = new Mesin("Honda");
        Mesin mesinSuzuki = new Mesin("Suzuki");
        Mesin mesinNissan = new Mesin("Nissan");

        Mobil mobilHonda = new Mobil("Honda Civic", mesinHonda);
        Mobil mobilSuzuki = new Mobil("Suzuki Swift", mesinSuzuki);
        Mobil mobilNissan = new Mobil("Nissan GT-R", mesinNissan);

        Mobil mobilAktif = mobilHonda; // Mobil Honda aktif awalnya

        System.out.println("Masukkan perintah untuk mengelola mobil (contoh: nyalakan, matikan, tambah, kurang, next, selesai)");

        while (true) {
            System.out.print("Perintah: ");
            String perintah = scanner.nextLine();

            switch (perintah.toLowerCase()) {
                case "nyalakan":
                    mobilAktif.nyalakanMobil();
                    break;
                case "matikan":
                    mobilAktif.matikanMobil();
                    break;
                case "tambah":
                    mobilAktif.tambahKecepatan();
                    break;
                case "kurang":
                    mobilAktif.kurangKecepatan();
                    break;
                case "next":
                    if (mobilAktif == mobilHonda) {
                        mobilAktif = mobilSuzuki;
                        System.out.println("Beralih ke mobil Suzuki.");
                    } else if (mobilAktif == mobilSuzuki) {
                        mobilAktif = mobilNissan;
                        System.out.println("Beralih ke mobil Nissan.");
                    } else {
                        mobilAktif = mobilHonda;
                        System.out.println("Beralih ke mobil Honda.");
                    }
                    break;
                case "selesai":
                    System.out.println("Program selesai.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Perintah tidak valid. Silakan coba lagi.");
            }
        }
    }
}


