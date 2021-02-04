/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no3;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Kendaraan {
 
    public static void a(){
        //input
        Scanner input = new Scanner(System.in);
        System.out.println("- Kendaraan -");
        
        System.out.print("Masukkan jenis kendaraan  : ");
        String jenis = input.nextLine();
        System.out.print("Masukkan merk kendaraan   : ");
        String merk = input.nextLine();
        System.out.print("Masukkan brand kendaraan  : ");
        String brand = input.nextLine();
        System.out.print("Masukkan warna kendaraan  : ");
        String warna = input.nextLine();
        System.out.print("Masukkan cc kendaraan     : ");
        int cc = input.nextInt();
        
        //output
        System.out.println("\n===============================\n");
        System.out.println("Jenis           : "+jenis);
        System.out.println("Merk            : "+merk);
        System.out.println("Brand           : "+brand);
        System.out.println("Warna Kendaraan : "+warna);
        System.out.println("CC              : "+cc+" cc");
    }
}
