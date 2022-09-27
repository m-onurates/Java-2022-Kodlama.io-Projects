public class Main {
    public static void main(String[] args) {
        /* System.out.println("Öğrenci Sayım : 9");
        System.out.println("Öğrenci Sayım : 9");
        System.out.println("Öğrenci Sayım : 9");
        System.out.println("Öğrenci Sayım : 9");
         Burada birden fazla kez öğrenci sayısı kullanılmaktadır.
         Bu kullanım ileride artarsa tümünü elimizle güncellemek zor olacağı için
         bir değişken atamamız işimizi kolaylaştıracaktır ve kodun kapladığı alanı da küçültecektir */

        /* int ogrenciSayisi = 10;
        System.out.println("Öğrenci Sayım : "+ogrenciSayisi);
        System.out.println("Öğrenci Sayım : "+ogrenciSayisi);
        System.out.println("Öğrenci Sayım : "+ogrenciSayisi);
         Bu kısımda da müşteri ilerleyen aşamalarda Öğrenci Sayım yerine "Öğrenci Sayısı" yazsın diye istekte bulunabilir
        Bu aşamada bizim için zor olacağı için Öğrenci Sayım kısmına da bir değişken atamak yine işimizi kolaylaştıracaktır
         */


        String mesaj = "Öğrenci Sayısı : ";
        int ogrenciSayisi = 10;

        System.out.println(mesaj + ogrenciSayisi);
        System.out.println(mesaj + ogrenciSayisi);
        System.out.println(mesaj + ogrenciSayisi);
        // Bu şekilde kullanım en doğrusu olacaktır.



    }
}