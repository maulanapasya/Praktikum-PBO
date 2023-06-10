// File         : ArrayListTest.java
// Deskripsi    : Program penggunaan objek ArrayList sebagai collection class
// Nama         : Maulana Pasya Zefanya
// NIM          : 24060121140175

import java.util.ArrayList;

public class ArrayListTest{
    public static void main (String[] args){
        //insialisasi ArrayList yang hanya dapat berisi objek string
        ArrayList<String> strings = new ArrayList<String>();

        //menambah elemen (proses tidak di print di hasil run)
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        
        //menghapus elemen (proses tidak di print di hasil run)
        strings.remove("praktikum");

        //iterasi pada keseluruhan ArrayList (print hanya yg masih ada, yg blm di remove)
        for(String s : strings){
            System.out.print(s+" ");
        }
    }
}
