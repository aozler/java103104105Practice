package day12_localdatetimeVarargsOverloadingOverridding;



public class C03_Varargs {

    public static void main(String[] args) {


        //Varargs kullanarak verilen Stringleri birlestiren concat() isimli bir method olusturunuz.

        concat("Safran", "bolu", "evleri");
    }
    private static void concat(String...str){
        String sonuc="";
        for (String w:str){
            sonuc+=w;
        }
        System.out.println(sonuc);// Safranboluevleri
    }
}
