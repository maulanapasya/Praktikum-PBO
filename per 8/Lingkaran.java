// File         : Lingkaran.java
// Deskripsi    : implementasi lingkaran sebagai bangun datar
// Nama         : Maulana Pasya Zefanya
// NIM          : 24060121140175

public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    public double hitungKeliling(){
        return 2*jejari*3.14;
    }
}
