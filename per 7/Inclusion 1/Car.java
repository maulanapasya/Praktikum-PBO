/**
 * File      	: Car.java 04/05/23
 * Penulis 		: Maulana Pasya Zefanya
 * Deskripsi 	: Class untuk Car
 * 
 */

package com.oracle.training;

public class Car extends Vehicle{
	void calRent(int jarak, float harga){ 
		float fare=jarak*harga;
		fare=fare-1000.00f;
		System.out.println("harga sewa mobil = "+fare);
	}
}

