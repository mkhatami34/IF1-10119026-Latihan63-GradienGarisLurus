/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan63.gradiengarislurus;

/**
 *
 * @author Asus
 * NAMA     : Muhammad Khatami
 * KELAS    : IF-1
 * NIM      : 10119026
 * Deskripsi : program ini menampilkan hasil hitung dari koordinat
 */
public class IF110119026Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat koordinat1, koordinat2;
        koordinat1 = new Koordinat(2, 10,5,7);
        System.out.println("Garis yang melalui titik ("+ koordinat1.getX1()+", "+ koordinat1.getY1()+") dan ("+ koordinat1.getX1() +", "+ koordinat1.getX2()+")");
	System.out.println("memiliki gradien sebesar "+koordinat1.hitungGradien());
        
	koordinat2 = new Koordinat(5,1,3,12);
        System.out.println("Garis yang melalui titik ("+ koordinat2.getX1()+", "+ koordinat2.getY1()+") dan ("+ koordinat2.getX1() +", "+ koordinat2.getX2()+")");
        System.out.println("memiliki gradien sebesar "+koordinat2.hitungGradien());
    }
    
}
