/**
*	File 		: MKubus.java 15/03/2023
*	Penulis		: Maulana Pasya Zefanya
*	Deskripsi	: Untuk menjalankan kelas dan method kubus
*/

package org.main;

import org.bangunruang.*;
import org.bangundatar.*;

public class MKubus{
	public static void main(String[] args){
		BujurSangkar bujurSangkar = new BujurSangkar(4);
		Kubus kubus = new Kubus(bujurSangkar);
		System.out.println("Luas Kubus dengan panjang sisi 4 = "+kubus.hitungLuasAlas());
		System.out.println("Volume Kubus dengan panjang sisi 4 = "+kubus.hitungVolume());
	}
}