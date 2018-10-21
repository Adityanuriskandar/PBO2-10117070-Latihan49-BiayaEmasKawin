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
public class PBO210117070Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Kawin kawin = new Kawin();
        kawin.setEmasKawin(15.7);
        kawin.setHargaSatuGram(570000);
        
        System.out.println("Hendri membeli emas kawin : " + kawin.getEmasKawin() + " gram");
        System.out.println("Harga 1 gram emas per bulan oktober ini : Rp. " + kawin.getHargaSatuGram());
        System.out.println();
        
        double emas_kawin = kawin.getEmasKawin();
        double harga_satu_gram = kawin.getHargaSatuGram();
        
        System.out.println("Total pembayaran yang harus dikeluarkan : Rp. " + kawin.hitungTotalPembayaran(emas_kawin, harga_satu_gram));
    }   
    
}
