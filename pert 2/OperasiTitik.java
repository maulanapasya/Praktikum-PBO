/*
* File 		: OperasiTitik.java 8/03/23
* Penulis	: Maulana Pasya Zefanya (24060121140175)
* Deskripsi	: Kelas yang berisi konstruktor untuk membuat data koordinat titik dan menampilkan ke layar
*/

class OperasiTitik{

	private void refleksiSumbuX(Titik t){ //prosedur
		double y;
		y = t.getOrdinat();
		y = y * -1;
		t.setOrdinat(y);
	}

	private void refleksiSumbuY(Titik t){ //prosedur
		double x;
		x = t.getAbsis();
		x = x * -1;
		t.setAbsis(x);
	}

	public double refleksiX(Titik t){ //fungsi, memanggil nilai
		double xFinal;
		refleksiSumbuX(t); //panggil nilai yg sudah direfleksi
		xFinal = t.getAbsis();
		return xFinal;
	}

	public double refleksiY(Titik t){ //fungsi
		double yFinal;
		refleksiSumbuY(t); //panggil nilai yg sudah direfleksi
		yFinal = t.getOrdinat();
		return yFinal;
	}
}