package com.cowsoran.imamsodikin;
import java.util.Scanner;

// Project Imam Sodikin Ganteng

public class EnkripsiDekripsi {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean kondisi = true;

        pilihan();
        System.out.print("\nSilahkan pilih : ");
        int pilih = s.nextInt();


      while (kondisi) {


          switch (pilih) {
              case 1:
                  enkripsi();
                  break;
              case 2:
                  dekripsi();
                  break;
              default:
                  System.out.println("Pilihan tidak ditemukan");
                  break;
          }

          System.out.print("\nApakah anda ingin melanjutkan ? (y/n) ");
          String i = s.next();

          if (i.equalsIgnoreCase("y")) {

          } else if (i.equalsIgnoreCase("n")) {
              break;
          } else {
              System.out.println("Silahkan pilih (y/n) ");
          }

          pilihan();
          System.out.print("Silahkan pilih : ");
          pilih = s.nextInt();


      }


    }

    public static void pilihan() {
        System.out.println("\n== SILAHKAN PILIH ==");
        String[] pilihan = {"1. Enkripsi", "2. Dekripsi"};
        for (var p : pilihan) {
            System.out.println(p);
        }
    }

    public static void menu() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("\n=== SILAHKAN PILIH ===\n");
        System.out.println("1. Enkripsi");
        System.out.println("2. Dekripsi");

    }
    public static void isLanjut(String i) {
        boolean kondisi = true;
        if (i.equalsIgnoreCase("y")) {
            menu();
        } else if (i.equalsIgnoreCase("n")) {
            kondisi = false;
        } else {
            System.out.println("silahkan pilih (y/n) ");
        }
    }

    public static void dekripsi() {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan pesan yang dienkripsi: ");
        String encryptedMessage = input.nextLine();

        System.out.print("Masukkan kunci: ");
        String key = input.nextLine();

        String decryptedMessage = "";

        for (int i = 0; i < encryptedMessage.length(); i++) {
            decryptedMessage += String.valueOf((char) (encryptedMessage.charAt(i) ^ key.charAt(i % key.length())));
        }

        System.out.println("Pesan yang didekripsi: " + decryptedMessage);
    }

    public static void enkripsi() {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nMasukkan plaintext: ");
        String plaintext = sc.nextLine();
        System.out.print("Masukkan key: ");
        String key = sc.nextLine();

        // Enkripsi plaintext menggunakan metode XOR
        String ciphertext = "";
        for (int i = 0; i < plaintext.length(); i++) {
            char p = plaintext.charAt(i);
            char k = key.charAt(i % key.length());
            char c = (char) (p ^ k);
            ciphertext += c;
        }

        System.out.println("Ciphertext: " + ciphertext);
    }
}
