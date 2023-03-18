package day16_collectionsmap;

import java.util.HashMap;

public class C02_Map {

    public static void main(String[] args) {


        //  Ad ve soyad bulunduruan iki ayrı array'i ad=soyad  seklinde yazdırınız.
        // input : {"Ahmet", "Alev", "Gulay"};  {"Yilmaz", "Erdem", "Kaleli"};
        // output : {Ahmet=Yilmaz, Alev =Erdem, Gulay=Kaleli};

        String ad[]= {"Ahmet", "Alev", "Gulay"};
        String soyAd[]={"Yilmaz", "Erdem", "Kaleli"};
        HashMap<String,String> adSoyad = new HashMap<>();
        for (int i=0; i< ad.length; i++){
            adSoyad.put(ad[i],soyAd[i] );
        }
        System.out.println("Ad Soyad "+adSoyad);//Ad Soyad {Ahmet=Yilmaz, Alev=Erdem, Gulay=Kaleli}
    }
}
