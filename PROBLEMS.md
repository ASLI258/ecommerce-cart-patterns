# PROBLEMS.md

## 1. God Class Problemi
Sepet sınıfı çok fazla sorumluluk taşımaktadır.
Hem ürün yönetimi, hem indirim hesaplama, hem de ödeme işlemleri aynı sınıfta yapılmaktadır.


## 2. Open/Closed Principle İhlali
Yeni bir indirim türü eklemek için mevcut kod değiştirilmektedir.
Bu durum sistemi geliştirmeyi zorlaştırır.


## 3. if-else Zinciri Problemi
İndirim ve ödeme işlemleri uzun if-else bloklarıyla kontrol edilmektedir.
Kod büyüdükçe okunabilirlik azalacaktır.


## 4. Düşük Esneklik
Yeni ödeme yöntemleri veya kampanyalar eklemek mevcut sınıfı değiştirmeyi gerektirir.
Bu durum bakım maliyetini artırır.


## 5. Test Edilebilirlik Sorunu
Tüm işlemler tek sınıfta toplandığı için bağımsız test yazmak zorlaşmaktadır.


# AI Analizi
AI ayrıca şu problemleri tespit etti:
- Single Responsibility Principle ihlali
- yüksek bağımlılık (coupling)
- düşük cohesion
- genişleyen koşul yapıları
- bakım zorluğu

Benim analizim ile AI analizinin büyük kısmı benzerdi.
Ancak AI özellikle SOLID prensiplerine daha fazla vurgu yaptı.
