/**
*	File 		: Poligon.java 15/03/2023
*	Penulis		: Maulana Pasya Zefanya
*	Deskripsi	: Representasi dasar dari objek poligon (segi banyak)
*/

package org.poligon;

public class Poligon{
	protected int jumlahSisi;

	public void poligon(){
		this.jumlahSisi = 0; //intial state
	}
	public void setJumlahSisi(int sisi){
		this.jumlahSisi = sisi;
	}
	public int getJumlahSisi(){
		return this.jumlahSisi;
	}
}