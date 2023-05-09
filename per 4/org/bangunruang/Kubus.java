/**
*	File 		: Kubus.java 15/03/2023
*	Penulis		: Maulana Pasya Zefanya
*	Deskripsi	: Method untuk merangkai kubus
*/

package org.bangunruang ;

import org.bangundatar.BujurSangkar ;

public class Kubus {
	private BujurSangkar permukaan ;
	public Kubus(BujurSangkar permukaan){
		 this.permukaan = permukaan ;
	}
	public double hitungVolume(){
		double panjangSisi = permukaan.getPanjangSisi() ;
		return panjangSisi * panjangSisi * panjangSisi ;
	}

	public double hitungLuasAlas(){
		double panjangSisi = permukaan.getPanjangSisi() ;
		return panjangSisi * panjangSisi ;
	}
}