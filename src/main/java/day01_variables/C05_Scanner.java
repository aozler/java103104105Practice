package day01_variables;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        //Kullanicidan ad, soyad, memleket, konum, yas, boy, kilo, Javayi sevdinizmi bilgilerini aliniz

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        String isim=scan.nextLine();

        System.out.println("Lutfen soyadinizi giriniz");
        String soyad=scan.nextLine();

        System.out.println("Lutfen memleketinizi giriniz");
        String memleket=scan.nextLine();

        System.out.println("Lutfen konumunuzu giriniz");
        String konum=scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        Byte yas=scan.nextByte();

        System.out.println("Lutfen boyunuzu giriniz");
        short boy=scan.nextShort();

        System.out.println("Lutfen kilonuzu giriniz");
        String kilo=scan.nextLine();

        System.out.println("Lutfen javayi sevip sevmediginizi yaziniz");
        boolean seviyormu=scan.hasNextBoolean();


    }
}
