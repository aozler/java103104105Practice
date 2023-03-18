package day01_variables;

public class C04_Java_Variables {

    public static void main(String[] args) {

       // 1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin

        String okulIsmi = "Emin";
        System.out.println("okulIsmi = " + okulIsmi);

        char ilkHarf = 'K';
        System.out.println("ilkHarf = " + ilkHarf);

        int sayi1 = 20;
        System.out.println("sayi1 = " + sayi1);


        // 2- isim ve soyisim icin iki variable olusturun ve bunlari
        //    isminiz : Arthur
        //    soyisminiz : Ozler
        //    seklinde yazdiriniz

        String isim="Arthur";
        String soyisim="Ozler";
        System.out.println("isim = " + isim);
        System.out.println("soyisim = " + soyisim);


        // 3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin

            short deger1=10;
            int deger2=20;
            System.out.println("Iki farkli data turunun toplami = "+(deger1+deger2));

        // 4- Bir tamsayi ve bir ondalikli variable olusturun
        // bunlarin toplamini yazdirin

            int deger3=40;
            double deger4=0.8;
            System.out.println("deger4 = " + deger4);


        // 5- char data turunde bir variable olusturun ve yazdirin

              char sembol='*';
              System.out.println("sembol = " + sembol);

        // 6- Peki bir tamsayi ile bir harfi toplayabilirmiyiz.

              int deger5=20;
              char harf='m';

              //1.Yol
                int toplam=deger5+harf;
                System.out.println("toplam = " + toplam);//129 askii karsiligini aldi

              //2.Yol
                System.out.println(deger5+harf);//129

              //3.Yol
                int sayi7=0;
                char harf2='s';
                System.out.println(sayi7+harf2);//115

        // Initalizing Variable  (variable baslangic degeri verme)
               int age=32;




    }
}
