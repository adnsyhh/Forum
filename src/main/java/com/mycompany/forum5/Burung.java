/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forum5;

/**
 *
 * @author fmaul
 */
public class Burung extends Hewan{
    private String ras;

    public Burung(String ras, String nama, String jenisKelamin, String pemilik, int umur) {
        super(nama, jenisKelamin, pemilik, umur);
        this.ras = ras;
    }
    
    public void infoHewan() {
        System.out.println("Nama dari burung adalah: " + nama);
        System.out.println("Burung memiliki ras: " + ras);
        System.out.println("Burung berjenis kelamin: " + jenisKelamin);
        System.out.println("Nama pemilik burung adalah: " + pemilik.getNama());
        System.out.println("Burung berumur: " + umur + " tahun");
    }
    public void berkicau() {
        System.out.println("Burung berkiacau");
    }
}
