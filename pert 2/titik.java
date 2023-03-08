/**
 * File : Titik.java 21/02/23
 * Penulis : Asisten Praktikum Lab D, Maulana Pasya Zefanya (24060121140175)
 * Deskripsi : kelas yang berisi program untuk membuat data koordinat Titik dan menampilkannya ke layar
 * 
 */ 
 
 class Titik{
	double absis; //absis
	double ordinat; //ordinat
	static int counterTitik; //penghitung objek titik yang telah dibuat
	
	Titik(double x, double y){
		counterTitik++;
		absis = x;
		ordinat = y;
	}

	Titik(){
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}

	void setAbsis(double a){
		absis = a;
	}
	
	void setOrdinat(double o){
		ordinat = o;
	}
	
	double getAbsis(){
		return absis;
	}
	
	double getOrdinat(){
		return ordinat;
	}
	
	int getCounterTitik(){
		return counterTitik;
	}

 }