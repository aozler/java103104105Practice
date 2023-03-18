package day13_overriddingoverloadigstatickeywords;

public class C02_Overloadig {

    public static void main(String[] args) {


        //Ayni classta ayni isimde method olusturmak icin method signature degistirilir

        cikarma(98, (float) 52.666);
        cikarma(14.5, 3);//ikinciyi olusturmaya izin vermedi onun icin yoruma aldik, sonra acinca kabul ediyor
        toplama(55, 66);
        toplama(2.3, 4.5);
        carpma(2, 3);
        carpma(8.9, 32);
    }//main

    //data type lari degistirilerek
    private static void carpma(double v, int i) {
        System.out.println("double ile int carpma yapildi " + (v * i));
    }

    private static void carpma(int i, int i1) {
        System.out.println("iki int deger carpildi " + (i * i1));
    }

    private static void toplama(double v, double v1) {
        System.out.println("iki double deger toplandi " + (v + v1));
    }

    private static void toplama(int i, int i1) {
        System.out.println("Iki int deger toplandi " + (i + i1));
    }

    private static void cikarma(double v, int i) {
        System.out.println("double ile int cikarma yontemi " + (v - i));
    }

    private static void cikarma(int i, float v) {
        System.out.println("int bir deger ile float cikarma yontemi " + (i - v));
    }

    //parametrelerin sayisi artirilarak
    private static void toplama(double v, double v1, double v2) {
        System.out.println("uc double deger toplandi " + (v + v1 + v2));
    }

    private static void toplama(double v, double v1, double v2, double v3) {
        System.out.println("dort double deger toplandi " + (v + v1 + v2 + v3));
    }

    //data turleri farkli oldugunda parametrelerin yerini degistirerek
    private static void carpma(Float a, double b) {
        System.out.println("Ilki float ikincisi double deger carpildi " + (a * b));
    }

    private static void carpma(double a, Float b) {
        System.out.println("Ilki double ikincisi Float deger carpildi " + (a * b));
    }
}
