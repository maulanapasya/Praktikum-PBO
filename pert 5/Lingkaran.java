/**
 * Lingkaran.java 01/04/23
 * Penulis : Maulana Pasya Zefanya
 * Deskripsi : kelas implementasi IArea berupa
 *          cara menghitung luas lingkaran            
 * 
 */ 
 //mengambil konstanta yang ada di kelas java.lang.Math
 import static java.lang.Math.PI;
 
 class Lingkaran implements IArea{
	private double jejari;
	
	public Lingkaran(double r){
		jejari = r;
	}
	
	public double hitungLuas(){
		return PI*jejari*jejari;
	}
 }
 
 