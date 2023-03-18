package day03_ifStatement;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {


        /*  Problem Tanimi
        Bir iscinin isi bitirme suresini ve toplam isci sayisini alarak, isin bitme suresini hesaplayan kodu yaziniz.
        Ornegin, Bir isci bir isi 10 gunde yapabilmektedir.
        Buna gore 2 isci ayni isi kac gunde yapar?

        Ornek Ekran Ciktisi
          Bir isci isi kac gunde bitirmektedir? 10
          Toplam kac isci calisacak?  2
          Isin bitme suresi 5 gundur.
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Bir isci bir isi kac gunde bitirmektedir :");
        double bitmeSuresi=input.nextDouble();

        System.out.println(" Toplam kac isci calisacak : ");
        double isciSayisi=input.nextDouble();

        double birlikteBitirmeSuresi=bitmeSuresi/isciSayisi;
        System.out.println("birlikteBitirmeSuresi = " + birlikteBitirmeSuresi);
    }
}
