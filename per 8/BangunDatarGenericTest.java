// File         : BangunDatarGenericTest.java
// Deskripsi    : main class untuk generic bangun datar
// Nama         : Maulana Pasya Zefanya
// NIM          : 24060121140175

public class BangunDatarGenericTest {
    public static void main(String[] args){
        Lingkaran l = new Lingkaran(2); //instansiasi lingkaran l
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>(); //instansiasi bangun datar generik (yang dipakai lingkaran)
        bdg.set(l); //instansiasi bangun datar generik di-set ke lingkaran l, sebelumnya sudah di-set di BangunDatarGeneric jika parameter merupakan instansiasi bangun datar
        System.out.println("keliling lingkaran: "+bdg.hitungKeliling()); //menjalankan method hitungKeliling pada kelas lingkaran (sesuai instansiasi pada parameter)
        System.out.println("tipe generic: "+bdg.get().getClass().getName()); //memanggil 
    }
}
