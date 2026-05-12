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
        
    //Factory method uyguladım.
     Indirim indirim = IndirimFactory.olustur(indirimTuru);
        toplam = indirim.uygula(toplam);

        if (odemeTuru.equals("KART")){
            System.out.println("Kart ile ödeme yapıldı.");
        }
        else if(odemeTuru.equals("NAKIT")){
            System.out.println("Nakit ödeme yapıldı.");
        }
        return toplam;
    }
}
