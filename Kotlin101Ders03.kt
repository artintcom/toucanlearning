package com.example.kotlin101_helloworld

fun main() {

    // Collections

    // Array
    /* Boyutu belli ve değişmeyecek verileri tutmak için uygundur.
     Dizilerin boyutu değiştirilemez, eleman eklenip çıkarılamaz.
    */


    // Aşağıda tip belirtilmeden bir dizi tanımlaması yapılmıştır. Dolayısıyla dizi farklı tipteki verileri barındırabilir.
    var arrSehirler = arrayOf("Mardin", "Bursa", "İstanbul")

    // Tipe özel dizi tanımlayabiliriz. Aşağıda int tipinde dizi tanımlanmıştır. Sadece int tipinde veriler alabilir.
    var arrRakam = intArrayOf(1, 2, 3)

    // int tipinde bir diziye String tipinde değişken atadığımızda hata alır.
    // var arrRakamHatali = intArrayOf(1,2,3,"a")

    // Dizinin boyutu değişemeyeceği için add ve remove metodları yoktur.

    // Dizinin elemanlarına index veya get methodu ile erişilir.

    println(arrSehirler[0])
    println(arrSehirler.get(1))

    // Dizinin belirli indexteki elemanına yeni değer atanabilir.
    arrSehirler[0] = "Yozgat"
    println(arrSehirler[0])


    // Dizinin belirli indexteki elemanına set(index,value) metoudu ile de değer atılabilir.
    arrSehirler.set(1, "Konya")


    // size özelliği ile dizinin eleman sayısını alırız.
    println("Şehirler Dizisinin Eleman Sayısı  " + arrSehirler.size)


    // Dizinin boş olup olmadığını isEmpty methodu ile kontrol ederiz.
    val sehirlerDizisiBosMu: Boolean = arrSehirler.isEmpty()
    println(sehirlerDizisiBosMu)


    // Bir değerin dizinin içerisinde yer alıp almadığını contains methodu ile kontrol ederiz.
    val bursaSehirDizisindeVarMi: Boolean = arrSehirler.contains("Bursa")

    if (bursaSehirDizisindeVarMi) {
        println("Bursa Şehri dizide var")
    } else {
        println("Bursa Şehri dizide yok")
    }


    // ArrayList
    // ArrayList'e dinamik olarak veri ekleyip çıkarılabilir. Özel tipte bir arrayList oluşturulmadığı
    // sürece farklı tipteki verileri içinde barındırabilir.


    // arrayListOf metodu ile tanımlanır

    var alSehirler = arrayListOf("Mardin", "Bursa")

    // String tipinde arrayList tanımı
    var alSehirlerStr = arrayListOf<String>("Mardin", "Bursa")

    // ArrayList'in elemanlarına index veya get methodu ile erişilir
    println(alSehirler.get(0))
    println(alSehirler[0])

    // add methodu ile arrayList'e yeni eleman eklenir. Eklenen eleman listenin sonuna eklenir.
    alSehirler.add("İstanbul")
    println(alSehirler)


    // istenilen indexe veri eklemek için add metodunun birinci parametresine index değeri verilir,
    // ikinci parametresine eklemek istenilen değer yazılır.
    alSehirler.add(0, "Yozgat")
    println(alSehirler)


    // remove metodu ile istediğimiz elemanı arrayList'ten sileriz.
    alSehirler.remove("İstanbul")
    println(alSehirler)


    // ArrayList eleman sayısını size özelliği ile erişiriz
    println(alSehirler.size)


    // + operatörü iki String'i birleştirdiği gibi iki arrayList'i birleştirebilir.
    var isim = "Hasibe"
    var soyAd = "Zafer"
    var tumIsim = isim + soyAd
    println(tumIsim)


    var alSayi1 = arrayListOf<Int>(1, 2, 3, 4, 5)
    var alSayi2 = arrayListOf<Int>(6, 7, 8, 9, 10)


    var alTumSayilar = alSayi1 + alSayi2
    println(alTumSayilar)


    // Döngüler
    // for Döngüsü


    // for döngüsü belli bir koleksiyon ya da değer aralığında dönmemizi sağlar.

    // Aşağıdaki örnekte 1'den 10'a kadar olan sayılar ekrana yazdırılır.
    for (i in 1..10) {
        println(i)
    }

    // Aşağıdaki örnekte 1. Merhaba, 2. Merhaba şeklinde 10'a kadar yazdırılır.
    for (i in 1..10) {
        println("$i.Merhaba ")
    }


    // Aşağıdaki örnekte 1' den 100 e kadar olan sayıların toplamı bulunup ekrana yazdırılır.
    var total = 0

    for (i in 1..100) {
        total = total + i
    }

    println("1 den 100'e kadar olan sayıların toplamı = $total")


    // Aşağıdaki örnekte dizi içerisinde yer alan String değerlerinden a harfinin dizide kaç defa
    // geçtiği bulunup ekrana yazdırılır.

    var arrHarf = arrayOf("a", "a", "b", "a")

    var sayacA = 0

    for (h in arrHarf) {
        if (h == "a") {
            sayacA = sayacA + 1
        }
    }

    println(sayacA)


    // Listelerde Döngüler

    // ArrayList içerisindeki tüm elemanları ekrana yazdırıyoruz
    var alMeyve = arrayListOf("Elma", "armut", "üzüm")

    for (meyve in alMeyve) {
        println(meyve)
    }

    // String tipi Char tipindeki bir arraydir.
    // Aşağıdaki örnekte String tipindeki bir değerin tüm karakterleri ekrana yazdırılır.
    var name: String = "Mehmet"

    for (i in name) {
        println(i)
    }


    // Aşağıdaki örnekte içerisinde e harfi bulunduran isimler ekrana yazdırılır

    var arrName = arrayOf("Mehmet", "Murat", "Esra", "Gizem", "Sena", "Hasibe", "Fatma")


    for (name in arrName) {
        if (name.contains('e') == true || name.contains('E')) {
            println(name)
        }
    }


    // ArrayList içerisindeki tüm elemanları index ile beraber ekrana yazdırılır

    var alMeyve2 = arrayListOf("Elma", "armut", "üzüm")

    for ((sira, deger) in alMeyve2.withIndex()) {
        println("$sira = $deger ")
    }


    // while Döngüsü

    // Aşağıdaki örnekte 0 dan 10 a kadar olan sayı toplamı bulunup ekrana yazdırılır
    var x = 10
    var toplam: Int = 0

    while (x > 0) {
        toplam = toplam + x
        x = x - 1
    }

    println(toplam)


}