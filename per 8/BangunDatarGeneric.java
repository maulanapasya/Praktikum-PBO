// File         : BangunDatarGeneric.java
// Deskripsi    : Kelas konstruksi generic untuk BangunDatar
// Nama         : Maulana Pasya Zefanya
// NIM          : 24060121140175

public class BangunDatarGeneric<T1234 extends BangunDatar> {
    private T1234 bangunDatar;

    public void set(T1234 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T1234 get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}
