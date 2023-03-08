/**
* Titik.java 2023
*/
public class MOperasiTitik{
	public static void main(String[] args){
		Titik t = new Titik(4,4);
		OperasiTitik o = new OperasiTitik();
		System.out.println("Titik awal : ("+t.getAbsis()+","+t.getOrdinat()+")");
		o.refleksiX(t); // hasil ?
		System.out.println("Titik X setelah direfleksi : ("+t.getAbsis()+","+t.getOrdinat()+")");
		o.refleksiY(t); // hasil ?
		System.out.println("Titik Y setelah direfleksi : ("+t.getAbsis()+","+t.getOrdinat()+")");
	}
}