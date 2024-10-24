/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.forum5;

/**
 *
 * @author fmaul
 */
public class Forum5 {

    public static void main(String[] args) {
        Hewan kucing = new Hewan("Momo", "Jantan", "Jacob", 3);
        Anjing buddy = new Anjing("Pitbull", "Buddy", "Betina", "Joshua", 5);
        Kucing brown = new Kucing("Persia", "Brown", "Betina", "Orlando", 1);
        Burung lukas = new Burung("Kakatua", "Lukas", "Jantan", "Asep", 3);

        buddy.tambahRiwayatMedis("Vaksin Parvovirus");
        buddy.tambahRiwayatMedis("Operasi kaki");
        
        lukas.tambahRiwayatMedis("Suntik rabies");
        
        kucing.infoHewan();
        System.out.println("--------------");
        
        buddy.infoHewan();
        buddy.tampilkanRiwayatMedis();
        System.out.println("--------------");
        buddy.menggonggong();
        System.out.println("--------------");
        
        brown.infoHewan();
        brown.tampilkanRiwayatMedis();
        System.out.println("--------------");
        
        lukas.infoHewan();
        lukas.tampilkanRiwayatMedis();
    }
}
