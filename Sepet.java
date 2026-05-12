import java.util.ArrayList;
public class Sepet{
    ArrayList<Urun> urunler = new ArrayList<>();

    public void urunEkle(Urun urun){
        urunler.add(urun);
    }
    public double odemeYap(String indirimTuru, String odemeTuru){
        double toplam = 0;

        for(Urun urun : urunler){
            toplam += urun.fiyat;
        }
        
        if(indirimTuru.equals("OGRENCI")){
            toplam = toplam * 0.90;
        }
        else if(indirimTuru.equals("VIP")){
            toplam = toplam * 0.80;
        }
        else if(indirimTuru.equals("YILBASI")){
            toplam = toplam * 0.85;
        }

        if (odemeTuru.equals("KART")){
            System.out.println("Kart ile ödeme yapıldı.");
        }
        else if(odemeTuru.equals("NAKIT")){
            System.out.println("Nakit ödeme yapıldı.");
        }
        return toplam;
    }
}
