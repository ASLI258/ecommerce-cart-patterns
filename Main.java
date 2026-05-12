public class Main {

    public static void main(String[] args) {

        Sepet sepet = new Sepet();

        sepet.urunEkle(new Urun("Laptop", 30000));
        sepet.urunEkle(new Urun("Mouse", 500));

        double toplam = sepet.odemeYap("VIP", "KART");

        System.out.println("Toplam Tutar: " + toplam);
    }
}
