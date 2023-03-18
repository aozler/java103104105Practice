package day04_IfStatement;


import java.util.Scanner;

public class C03_IfStatement {

    public static void main(String[] args) {

        //Kullanicidan bir gun alin
        // eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal  gun” yazdirin.
        // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
        // “Pazar”  ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin

        //String'lerde == neden kullanilmaz. Onun yerine equals kullaniriz.
        // Cunku Javada 2 tane memory var. Stack ve Heap.
        // String'de referans degerinede bakildigi icin == yerine eguals kullanilir.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz");

        //1.Yol
    /*    String gun = input.next().toLowerCase();// toLowerCase==kucuk harf yapar.

        if (gun.equals("cuma")){
            System.out.println("Muslumanlar icin kutsal gun");
        }
        if(gun.equals("cumartesi")){
            System.out.println("Yahudiler icin kutsal gun");
        }
        if (gun.equals("pazar")){
            System.out.println("Hristiyanlar icin kutsal gun");
        }
        if (!gun.equals("cuma") && !gun.equals("cumartesi")&& !gun.equals("pazar")){
            System.out.println("Kutsal gun degil");
        } */


        //2.Yol
    /*    String gun = input.next();
        if (gun.equalsIgnoreCase("cuma")){
            System.out.println("Muslumanlar icin kutsal gun");
        }
        if (gun.equalsIgnoreCase("cumartesi")){
            System.out.println("Yahudiler icin kutsal gun");
        }
        if (gun.equalsIgnoreCase("pazar")) {
            System.out.println("Hristiyanlar icin kutsal gun");
        }
        if (!gun.equalsIgnoreCase("cuma")&& !gun.equalsIgnoreCase("cumartesi")&& !gun.equalsIgnoreCase("pazar")) {
            System.out.println("Kutsal Gun Degil");
        } */


        //3.Yol
          String gun = input.next().toLowerCase();

          if (gun.equals("cuma")) {
              System.out.println("Muslumanlar icin kutsal gun");
          }else if (gun.equals("cumartesi")) {
              System.out.println("Yahudiler icin kutsal gun");
          }else if (gun.equals("pazar")) {
              System.out.println("Hristiyanlar icin kutsal gun");

          }else System.out.println("Kutsal Gun Degil");

        }
    }


