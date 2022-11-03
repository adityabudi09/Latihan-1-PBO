/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasLatihan2;

/**
 *
 * @author DWI ADITYA BUDI
 */
import java.util.Scanner;
public class AkunBank {
    public static void main(String[] args) {
        AkunBankApp ba = new AkunBankApp();
        Scanner inputkey = new Scanner(System.in);
        int menu;
        System.out.println("======== Latihan 2 ========");
        System.out.println("======== Akun Bank ========");
        System.out.println("Menu");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Simpan Uang");
        System.out.println("3. Ambil Uang");
        System.out.println("4. Keluar");
        boolean f = false;
        do {
            System.out.println("Pilih Menu");
            menu = inputkey.nextInt();
            switch (menu){
                case 1:
                    ba.saldoAwal();
                    break;
                case 2:
                    ba.simpanUang ();
                    break;
                case 3:
                    ba.ambilUang ();
                    break;
                default:
                    System.exit(0);
            }
        } while(!f);  
    }
}
