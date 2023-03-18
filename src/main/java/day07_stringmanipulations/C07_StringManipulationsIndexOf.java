package day07_stringmanipulations;

public class C07_StringManipulationsIndexOf {

    public static void main(String[] args) {



              String str = "Kara kara dusunme Ankara";
              //indexOf() method'u verilen character veya character'lerin "ilk gorunumunun" index'ini verir.
              int idxA1 = str.indexOf("kara");
              System.out.println(idxA1);//5



              //lastIndexOf() method'u verilen character veya character'lerin "son gorunumunun" index'ini verir.
              int idxA2 = str.lastIndexOf("kara");
              System.out.println(idxA2);//20 (Ankara'nin kara'sini verir)



              //Example: Verilen bir String'deki bir character'in tekrarli veya tekrarsiz olup olmadigini gosteren kodu yaziniz.

              String str1 = "12344*678";
              char ch='*';//Tekrarsiz

              if (str.indexOf(ch) == str.lastIndexOf(ch)){
                  System.out.println("Tekrarsiz");
              }else
                  System.out.println("Tekrarli");
    }
}
