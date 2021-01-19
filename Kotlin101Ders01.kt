package com.example.kotlin101_helloworld

fun main() {
    println("Hello, world!!!")

    // yorum satırı
    // yorum satırı 2

    /*
     	birden
        fazla
        satır
        yorum olarak yazılabilir.
     */


    // değişken tanımı

    // var veya val


    // String tipinde değişken tanımı
    var isim = "mehmet"

    println(isim)

    var soyAd: String = "aca"

    println(soyAd)

    println("Merhabalar")

    // Char tipinde değişken tanımı

    var ilkHarf = 'M'

    println(ilkHarf)

    // Int tipinde değişken tanımı
    var yas = 20

    yas = yas + 1

    println(yas)


    // Double tipinde değişken tanımı

    var ucret = 99.9

    println(ucret)

    // Boolean tipinde değişken tanımı
    var ogrenciMi = true

    var asklerlikYaptiMi: Boolean = false

    println(ogrenciMi)

    println(asklerlikYaptiMi)


    // Tip dönüşümü
    // • toDouble() , toFloat() , toLong() , toInt() , toShort() , toByte() , toChar() , toString()


    var puan: String = "82"

    var puanDegeri: Int = puan.toInt()

    println(puanDegeri)


    var yumurtaSayisi = "5"

    var kalanYumurtaSayisi = yumurtaSayisi.toInt() - 2

    println(kalanYumurtaSayisi)


    // val kullanımı
    // değer atandıktan sonra değiştirilemez.

    val pi = 3.14
    // val tipinde tanımlanan bir değişkene tekrar değer atanamayacağı için aşağıdaki satır hata verir.
   // pi = 3.13

    // print ve println

    print("yan")
    print("yana")

    // Bir satır boş bırakalım
    println("")

    println("alt")
    println("alta")

    //print fonksiyonu içerisinde $ ifadesi ile değişkenin değerini alma

    var name = "Suzan"
    var surName = "Sezgin"

    println("$name $surName Turkcell'de çalışır.")

}
