/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LiveKuis;

/**
 *
 * @author inteL
 */
public class Mesin {
    private String merk;
    private int kecepatan;

    public Mesin(String merk) {
        this.merk = merk;
        this.kecepatan = 0;
    }

    public void nyalakanMesin() {
        System.out.println("Mesin " + merk + " dinyalakan.");
    }

    public void matikanMesin() {
        System.out.println("Mesin " + merk + " dimatikan.");
    }

    public void tambahKecepatan() {
        if (kecepatan < 300) {
            if (merk.equals("Honda")) {
                kecepatan += 10;
            } else if (merk.equals("Suzuki")) {
                if (kecepatan + 15 <= 150) {
                    kecepatan += 15;
                } else {
                    kecepatan = 150;
                }
            } else if (merk.equals("Nissan")) {
                kecepatan += 20;
            }
            System.out.println("Kecepatan ditambahkan menjadi " + kecepatan + " km/jam.");
        } else {
            System.out.println("Kecepatan maksimum telah tercapai.");
        }
    }

    public void kurangKecepatan() {
        if (kecepatan > 0) {
            if (merk.equals("Honda")) {
                kecepatan -= 5;
            } else if (merk.equals("Suzuki")) {
                kecepatan -= 10;
            } else if (merk.equals("Nissan")) {
                kecepatan -= 15;
            }
            System.out.println("Kecepatan dikurangkan menjadi " + kecepatan + " km/jam.");
        } else {
            System.out.println("Mobil sudah berhenti.");
        }
    }
}

