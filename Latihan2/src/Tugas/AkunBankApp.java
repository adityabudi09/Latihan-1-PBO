/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author DWI ADITYA BUDI
 */
import java.util.Scanner;
public class AkunBankApp {
    public static void main(String[] args) {
    }
    private int ambil, simpan, saldo;
    Scanner inputkey = new Scanner(System.in);
    public AkunBankApp() {
        saldo = 100000;
    }
    int saldoAwal(){
        System.out.println("Saldo Anda adalah: "+ saldo);
        return saldo;
    }
    int simpanUang(){
        System.out.println("Jumlah uang yang akan Anda simpan Rp. ");
        simpan = inputkey.nextInt();
        if (simpan<0){
            System.out.println("Masukkan jumlah yang benar!");
            return 0;
        }
        saldo = saldo + simpan;
        System.out.println("Saldo Anda sekarang adalah Rp. "+ saldo);
        return 1;
    }
    int ambilUang(){
        System.out.println("Jumlah uang yang akan Anda ambil adalah Rp ");
        ambil = inputkey.nextInt();
        if(ambil > saldo){
            System.out.println("Saldo Anda tidak mencukupi");
            return 1;
        }
        if(ambil < 0){
            System.out.println("Masukkan jumlah yang benar!");
        }
        
        saldo = saldo - ambil;
        System.out.println("umlah saldo Anda adalah Rp"+ saldo);
        return 0;
    }    
}
