/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan49.biayaemaskawin;

/**
 *
 * @author Aditya
 * NAMA                 : Aditya Nur Iskandar
 * KELAS                : PBO2/IF2
 * NIM                  : 10117070
 * Deskripsi Program    : Program ini berisi program untuk menghitung harga emas
 * kawin
 */
public class Kawin {
    private double emasKawin;
    private double hargaSatuGram;

    public double getEmasKawin() {
        return emasKawin;
    }

    public void setEmasKawin(double emasKawin) {
        this.emasKawin = emasKawin;
    }

    public double getHargaSatuGram() {
        return hargaSatuGram;
    }

    public void setHargaSatuGram(double hargaSatuGram) {
        this.hargaSatuGram = hargaSatuGram;
    }
    
    public double hitungTotalPembayaran(double e, double h) {
        return e * h;
    }
    
}
