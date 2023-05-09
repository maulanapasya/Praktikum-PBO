/**
 * File      	: Vehicle.java 04/05/23
 * Penulis 		: Maulana Pasya Zefanya
 * Deskripsi 	: class sebagai superclass dari Car dan Bus
 *
 */

package com.oracle.training;

public class Vehicle {
	void calRent(int distance,float price){
		float fare=distance* price;
		System.out.println("vehicle price = "+fare);
	}
}
