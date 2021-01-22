package com.example.kotlin101_helloworld

fun main() {

    // nullable Veri Tipleri
    // Bir değişken nullable tipinde değilse null değeri alamaz

    // Temel veri tipleri null değeri alamaz ( Temel Veri Tipleri : Int, String, Float, Double, Char, Boolean)


    //Aşağıda yer alan String tipindeki değişken nullable olmadığı için hata verir.
    //var isim : String = null


    // Aşağıda yer alan Boolean tipindeki değişken nullable olmadığı için hata verir.
    // var yasiyor : Boolean = null

    /* NullPointerException

     Milyar Dolarlık Hata
     https://en.wikipedia.org/wiki/Tony_Hoare#Apologies_and_retractions

     Diğer programlama dillerinde (Java, C#) bir değişkenin değeri null iken bu değişkene ait bir
     fonksiyon ya da özelliğe erişmek istersek çalışma anında NullPointerException hatası alırız.

     Örneğin aşağıdaki java kodu çalışma anında NullPointerException hatası verecektir.
     String isim = null
     isim.length()
    */


    /* Kotlin dili null safety özelliği taşır. Null değeri alabilen tiplere nullable tipler denir.
    * Nullable olan değişkenler ? ile kullanılır.
    */

    var soyad: String? = null

    /* null olan bir veriyi direk kullandırtmaz.
     Aşağıdaki gibi nullable olan bir değişkenin metod ya da özelliğine direkt olarak erişilemez.
    Aşağıdaki yorum satırını açarsak "Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?"
    hatası alırız */

    // print(soyad.length)


    // Safe Call
    /* Nullable olan bir değişkene ait method ya da özelliğe erişmek için aşağıdaki gibi
     değişken adının sonuna ? konularak güvenli çağırım yapılır.
     */


    //Aşağıdaki örnekte soyad değişkenin değeri null ise direk null döner, değilse length fonksiyonu çağırır.

    println(soyad?.length)
    soyad = "Aca"
    println(soyad?.length)


    /* Safe Call kullanımında geri dönüş değeri null ya da başka bir tip olacağı için
    nullable bir tipe atanmalıdır. */

    var uzunluk: Int? = soyad?.length
    print(uzunluk)


    /* not-null assertion operator !!
     Sonuna kullanılan değişkenin tipini nullable olmayan tipe dönüştürür.
     Örneğin
     var sayi : Int? = null
     sayi!! kullanıldığında değeri Int tipine dönüştürür. Bu örnekte sayi değişkenimizin değeri
     null ve bu null değeri Int tipine atmaya çalıştığı için NullPointerException hatası alırız.
     Ancak içindeki değer null'dan farklı ise hata vermez. Bu yüzden değerin null olmadığından
     emin olduğumuz durumlarda kullanmalıyız.
      */


    /*
       // Örneğin aşağıdaki kod NullPointerException hatası alır.
       var dev : String? = null
       print(dev!!.length)

      */


    // Kontrol Yapıları
    // if else syntax yapısı Java ile aynıdır.

    //if else Örnekler

    // Örnek : Yaşı 18 den büyük ise ekrana "Evlenebilir" , değilse "Evlenemez" yazdıran kod parçası.
    val yas = 18

    if (yas >= 18) {
        println("Evlenebilir")
    } else {
        println("Evlenemez")
    }


    //Verilen iki sayıdan maximum olanı bulan ve ekrana yazdıran kod parçası

    val a: Int = 3
    val b: Int = 7

    var max: Int

    if (a > b) {
        max = a
    } else {
        max = b
    }

    println(max)


    // Bir değişkenin değeri null değil ise metod ya da özelliğine erişim örneği

    // Aşağıdaki örnekte String bir değişkenin length metoduna güvenli şekilde erişiyoruz

    var surname: String? = null

    var surnameLength: Int?

    if (surname != null) {
        surnameLength = surname.length
    } else {
        surnameLength = null
    }

    print(surnameLength)


    // Yukarıda if else ile yazdığımız güvenli çağırımı Kotlin aşağıdaki kod parçası ile otomatik şekilde yapmaktadır.

    var surnameLength2: Int? = surname?.length
    print(surnameLength2)




    //Örnek : && operatörünün if else içerisinde kullanımı
    /* kullaniciAdi Mehmet ve şifre Aca ise  "Başarılı Giriş" yazan , değil ise "Başarısız Giriş" yazan kod parçası */

    val kullaniciAdi = "Mehmet"
    val sifre = "Aca"

    if (kullaniciAdi == "Mehmet" && sifre == "Aca") {
        println("Başarılı Giriş")
    } else {
        println("Başarısız Giriş")
    }



    // when kullanımı
    // Java'daki switch case yapsının karşılığıdır.


    // 1 ile 5 arasındaki not değerine göre ekrana notun geçerliliğini yazan kod parçası
    val not: Int = 3

    when(not)
    {
        1 ->
        {
            println("Zayıf")
        }
        2 -> println("Geçer")
        3 -> println("Orta")
        4 -> println("İyi")
        5-> println("Pekiyi")

        else -> println("yanlış giriş")
    }


    // When Expression Kullanımı
    // when sonucunu değişkene atama

    var puanSonucu = when (not) {
        1 -> "Zayıf"
        2 -> "Geçer"
        3 -> "Orta"
        4 -> "İyi"
        5 -> "Pekiyi"

        else -> "yanlış giriş"
    }

    println(puanSonucu)


}