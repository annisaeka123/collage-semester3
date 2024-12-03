/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frontend;

import backend.*;
/**
 *
 * @author USER
 */
public class TestBackend {
    public static void main(String[] args){
        Kategori katl = new Kategori ("Novel", "Koleksi buku novel");
        Kategori kat2 = new Kategori ("Referensi", "Buku referensi ilmiah");
        Kategori kat3 = new Kategori ("Komik", "Komik anak-anak");

        // test insert
        katl.save();
        kat2.save();
        kat3.save();

        // test update
        kat2.setKeterangan ("Koleksi buku referensi ilmiah");
        kat2.save();

        // test delete
        kat3.delete();

        // test select all
        
        System.out.println("============Tampil Data ================");
        for (Kategori k : new Kategori().getAll())
        {
            System.out.println("Nama: "+k.getNama() + ", Ket: " + k.getKeterangan());
        }
         System.out.println("============Cari Data ================");
        
        // test search
        for (Kategori k : new Kategori().search("ilmiah"))
        {
            System.out.println("Nama: "+ k.getNama ()+", Ket: "+ k.getKeterangan());
        }
    }
}
