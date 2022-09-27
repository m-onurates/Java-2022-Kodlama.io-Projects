public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        System.out.println(mesaj);
       /*  .length elememan sayısını vermektedir.
         charAt String ifadenin 5.karakterini buldurur. Bir metindeki belirli bir karakteri yakalamakta da kullanılır.
        System.out.println("Eleman Sayısı :" + mesaj.length());
        System.out.println("5.Eleman :" + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));

        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("l"));

        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        .indexOf Belirtilen karakterin kaçıncı eleman olduğunu bulmaya yarar.
        System.out.println(mesaj.indexOf('a'));
        lastIndexOf sondan kaçıncı olduğunu bulur
        System.out.println(mesaj.lastIndexOf('e'));
        .replace bir karakteri diğeri ile değiştirir*/
        System.out.println(mesaj.replace(' ', '-'));

        //subString bir metnin içerisinden parça almaktır. 2 dersek; 2'den itibaren alır ve parçalar
        //2,4 dersek 2'den başla, 4'e kadar al şeklinde yapar
        System.out.println(mesaj.substring(2,4));

        //split for döngüsüne yazılır ve sting olan kelimeleri birbirinden ayırır
        for ( String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }
          //.toLowerCase kelimeleri küçük harlerle yazdırır. toUpperCase ise büyük olarak yazdırır
        // bir datada özellikle arama yapacak isek ve büyük küçük harfe duyarlıysa bunu önce küçük harfe çevirip bu şekilde arama yapabiliriz.
        System.out.println(mesaj.toLowerCase());
    }
}