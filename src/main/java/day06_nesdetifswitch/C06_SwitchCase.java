package day06_nesdetifswitch;

import java.util.Scanner;

public class C06_SwitchCase {

    public static void main(String[] args) {


        //Example : Girilen pozitif 3 basamakli bir sayiyi yazi ile yazdiriniz
        //          568
        //          Besyuzaltmissekiz


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pozitif 3 basamakli bir sayi giriniz");
        int sayi = input.nextInt();

        int birlerBas=(sayi%10);
        int onlarBas=(sayi/10)%10;
        int yuzlerBas=(sayi/100);

        if(sayi>99 && sayi<1000){

            ////100 LER BASAMAGI
            switch (yuzlerBas){
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("Yuz");
                    break;
                case 2:
                    System.out.println("Ikiyuz");
                    break;
                case 3:
                    System.out.println("Ucyuz");
                    break;
                case 4:
                    System.out.println("Dortyuz");
                    break;
                case 5:
                    System.out.println("Besyuz");
                    break;
                case 6:
                    System.out.println("Altiyuz");
                    break;
                case 7:
                    System.out.println("Yediyuz");
                    break;
                case 8:
                    System.out.println("Sekizyuz");
                    break;
                case 9:
                    System.out.println("Dokuzyuz");
                    break;
                }

                ////////10 LAR BASAMAGI/////////////
            switch (onlarBas){
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("on");
                    break;
                case 2:
                    System.out.println("yirmi");
                    break;
                case 3:
                    System.out.println("otuz");
                    break;
                case 4:
                    System.out.println("kirk");
                    break;
                case 5:
                    System.out.println("elli");
                    break;
                case 6:
                    System.out.println("altmis");
                    break;
                case 7:
                    System.out.println("yetmis");
                    break;
                case 8:
                    System.out.println("seksen");
                    break;
                case 9:
                    System.out.println("doksan");
                    break;
                }

                ////////BIRLER BASAMAGI/////////
            switch (birlerBas){
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("uc");
                    break;
                case 4:
                    System.out.println("dort");
                    break;
                case 5:
                    System.out.println("bes");
                    break;
                case 6:
                    System.out.println("alti");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.println("sekiz");
                    break;
                case 9:
                    System.out.println("dokuz");
                    break;
                }

            }else System.out.println("Lutfen 3 basamakli bir sayi giriniz");
    }
}
