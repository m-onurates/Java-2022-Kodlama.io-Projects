public class Main {
    public static void main(String[] args) {
        // Şart bloklarında "Eşit mi?" olayını == çift eşittir ile yapıyoruz. Tek = sayıya değer atamak demektir.
        int sayi = 24;
        if (sayi < 20) {
            System.out.println("Sayı 20'den küçüktür Sayı = " + sayi);
        }else if (sayi==20){
            System.out.println("Sayı 20'ye eşittir. Sayı = " + sayi);
        }else{
            System.out.println("Sayı 20'den büyüktür. Sayı = " + sayi);
        }

    }
}