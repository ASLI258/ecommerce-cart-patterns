# Factory Method Pattern

## Nerede kullandım?
Sepet sınıfındaki indirim sisteminde kullandım.

## Neden kullandım?
if-else yapısını kaldırmak ve sistemi daha genişletilebilir hale getirmek için kullandım.

## Ne kazandım?
- Kod daha temiz oldu.
- Yeni indirim eklemek kolaylaştı.
- OCP prensibi sağlandı.



## UML Öncesi
Sepet sınıfının içinde indirim hesaplama işlemi if-else yapısıyla yapılıyordu.

## UML Sonrası
- Sepet sınıfı sadece toplam hesaplama işini yapıyor.
- IndirimFactory nesneleri oluşturuyor.
- İndirim türleri ayrı sınıflara ayrıldı. (VIP, OGRENCI, YILBASI)

## Nerede kullandım?
Sepet içindeki indirim sisteminde kullandım.

## Neden kullandım?
if-else yapısını kaldırıp sistemi daha genişletilebilir hale getirmek için kullandım.

## Ne kazandım?
- Kod daha düzenli oldu.
- Yeni indirim eklemek kolaylaştı.
- OCP prensibini sağlamış oldum.
