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


# AI vs Benim Analizim Karşılaştırması

## Benim tespit ettiğim problemler:
- God Class problemi
- if-else zincirleri
- Open/Closed Principle ihlali
- düşük esneklik
- test edilebilirlik sorunu

## AI’ın tespit ettiği problemler:
- Single Responsibility Principle (SRP) ihlali
- yüksek coupling (sınıflar arası bağımlılık)
- düşük cohesion (sınıf içi dağınıklık)
- genişleyen koşul yapıları
- bakım ve genişletme zorluğu

## Karşılaştırma:
Benim analizim daha çok kod seviyesinde ve gözle görülebilir problemleri tespit etmeye odaklandı.

AI ise aynı problemleri SOLID prensipleri üzerinden daha soyut ve mimari seviyede ifade etti.

## Sonuç:
Her iki analiz de aynı temel sorunları işaret etmektedir.
Fark, bakış açısı seviyesindedir:
- Benim analizim: pratik / kod tabanlı
- AI analizi: teorik / tasarım prensibi tabanlı
