/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LiveKuis;

/**
 *
 * @author inteL
 */
public class Mobil {
    private String merk;
    private Mesin mesin;
    private boolean mesinNyala; // Menyimpan status mesin (nyala atau mati)

    public Mobil(String merk, Mesin mesin) {
        this.merk = merk;
        this.mesin = mesin;
        this.mesinNyala = false; // Awalnya mesin dimatikan
    }

    public boolean isMesinNyala() {
        return mesinNyala;
    }

    public void nyalakanMobil() {
        if (!mesinNyala) {
            mesin.nyalakanMesin();
            mesinNyala = true; // Set status mesin menjadi nyala
            System.out.println("Mobil " + merk + " dinyalakan.");
        } else {
            System.out.println("Mobil " + merk + " sudah dinyalakan.");
        }
    }

    public void matikanMobil() {
        if (mesinNyala) {
            mesin.matikanMesin();
            mesinNyala = false; // Set status mesin menjadi mati
            System.out.println("Mobil " + merk + " dimatikan.");
        } else {
            System.out.println("Mobil " + merk + " sudah dimatikan.");
        }
    }

    public void tambahKecepatan() {
        if (mesinNyala) {
            mesin.tambahKecepatan();
        } else {
            System.out.println("Mesin belum dinyalakan.");
        }
    }

    public void kurangKecepatan() {
        if (mesinNyala) {
            mesin.kurangKecepatan();
        } else {
            System.out.println("Mesin belum dinyalakan.");
        }
    }
}


