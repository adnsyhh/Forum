/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forum5;

/**
 *
 * @author fmaul
 */
public class Kucing extends Hewan{
    private String ras;
    

    public Kucing(String ras, String nama, String jenisKelamin, String pemilik, int umur) {
        super(nama, jenisKelamin, pemilik, umur);
        this.ras = ras;
    }
    
    public void infoHewan(){
        System.out.println("Nama dari kucing adalah: " + nama);
        System.out.println("Kucing memiliki ras: " + ras);
        System.out.println("Kucing berjenis kelamin: " + jenisKelamin);
        System.out.println("Nama pemilik kucing adalah: " + pemilik.getNama());
        System.out.println("Kucing berumur: " + umur + " tahun");
    }
    public void mengeong() {
        System.out.println("Kucing mengeong");
    }
}
