/**
 * MLingkaran.java 01/04/23
 * Penulis : Maulana Pasya Zefanya
 * Deskripsi : implementasi cara menghitung luas lingkaran        
 * 
 */ 

import java.util.Scanner;
 
 public class MLingkaran{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan panjang jari-jari lingkaran : ")
		double jari_jari = scan.nextDouble();
		Lingkaran l = new Lingkaran(jari_jari)
		System.out.println("Luas lingkaran dengan jari-jari "+ jari_jari + "adalah ="+ l.hitungLuas());
	}
 }
  