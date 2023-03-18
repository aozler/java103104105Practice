package day07_stringmanipulations;

public class C03_StringManipulationsReplace {

    public static void main(String[] args) {


        /*
          replace()
          Metin icerisindeki karakter yada karakterlerin, istenilen karakter ya da metinle degistirilmesi saglar.
          sonuc String'dir.
         */

        /*
        Regular Expression(regex) :Belli turdeki karakterleri secebilmemize yarar.
        1) \\d  ==> tum rakamlar
            \\D ==> tum rakam disi karakterler
        2) \\w  ==> A->Z     a->z      0->9   _tum buyuk, kucuk harf ve rakamlar
            \\W ==> A->Z     a->z      0->9   _disindaki hersey
        3) \\s  ==> space tum bosluklar
           \\S  ==> space disindaki hersey
         */


        //rakam haricindekileri silin
        String str1="$45.99";
        str1=str1.replaceAll("\\D","");
        System.out.println("str1 = " + str1);

        //Verilen cumleyi * ile gizleyi, 10 karakterden sonrasini yazdirin.
        String cumle="Her dert Java gibi olsa";
        System.out.println(cumle.replaceAll("\\w","*")+cumle.substring(10));

        //a harfini @ isareti ile degistirin.
        String ders="olaganustu";//ol@g@nustu
        System.out.println(ders.replace("a","@"));

        //ReplaceFirst : Replace ile ayni sadece ilk bulunan karakteri degistirir.
        String txt = "Merhaba Dunya";
        //txt'deki butun 'a' lari 'e' ile degistirin
        System.out.println(txt.replace("a","e"));//Merhebe Dunye

        //txt'deki ilk bulunan 'a' yi 'e' ile degistirin.
        System.out.println(txt.replaceFirst("a","e"));//Merheba Dunya



        /*
          replaceAll()
          Metin icerisindeki bir dizi kumesini degistirmedir. Sonuc String'dir.
         */

        //Example: Bir dizi kumesini degistirme>>>>>>>>>> Kalem yerine biber yazdiriniz.
        String str="Dolma Kalem";
        System.out.println(str.replaceAll("Kalem","biber"));//Dolma biber




    }
}