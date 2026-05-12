public class IndirimFactory{
    public static Indirim olustur(String tip){
      
        if(tip.equals("VIP")){
            return new VIPIndirim();
        }
        else if(tip.equals("OGRENCI")){
            return new OgrenciIndirim();
        }
        else if(tip.equals("YILBASI")){
            return new YilbasiIndirim();
        }
        return new VIPIndirim();
    }
}
