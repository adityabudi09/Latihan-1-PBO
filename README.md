# Tugas PBO Pertemuan 4
# Tugas Latihan 1 PBO
Praktikum pertemuan 4 membahas mengenai Membuat Class, Objek dan memanggil Atribut. Ada dua file yaitu,
- Person.java
- Atribut.java

Di dalam class Person.java terdiri dari Kelas dan Objek,
    
    public class Person {
    String nama;
    char jenisKelamin;
    int umur;
    }
    
Dan memanggil Atribut pada file class Atribut.java   

    public class Atribut {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.nama = "Anton";
        person2.nama = "Riko";

        person1.jenisKelamin = 'L';
        person2.jenisKelamin = 'L';

        person1.umur = 20;
        person2.umur = 25;

        System.out.println("======== Latihan 1 ========");

        // BUAT ANTON
        System.out.println("Nama: " + person1.nama+
                            "\nJenis Kelamin: " + person1.jenisKelamin +
                            "\nUmur: " + person1.umur);

        // BUAT RIKO
        System.out.println("\nNama: " + person2.nama+
                "\nJenis Kelamin: " + person2.jenisKelamin +
                "\nUmur: " + person2.umur);
        }
    }

Kemudian Run dan Hasilnya sebagai Berikut

![image](https://user-images.githubusercontent.com/115923969/199664809-1a906044-628f-40d6-97c3-788c2ab8fd9b.png)

# Tugas Latihan 2 PBO
# Tugas Membuat Akun Bank
Pada tugas ini di minta untuk membuat program Akun Bank yaitu,

![image](https://user-images.githubusercontent.com/115923969/199666380-aa6f78f5-3bf5-4ae2-a38e-0434e8580732.png)

Pada Tugas ini Saya Mebuat 2 file  yaitu :
- AkunBank.Java
- AkunBankApp.Java

Di dalam class AkunBankApp.java terdiri dari Kelas dan Objek,

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

Di dalam class AkunBank.java terdiri dari Atribut dan Cetak Info().

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
Kemudian Run dan hasilnya sebagai berikut,

![image](https://user-images.githubusercontent.com/115923969/199668156-0946a7c7-6d9a-4800-958b-05a99000af50.png)


