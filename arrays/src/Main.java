public class Main {
    public static void main(String[] args) {
        String[] ogrenciler = new String[3];
        ogrenciler[0]="Engin";
        ogrenciler[1]="Onur";
        ogrenciler[2]="Ferman";

         //for (int i=0;i<ogrenciler.length;i++){
            /* i sıfırdan başlayacak ve öğrencilerin eleman sayısından küçük olacak.
             Öğrencilerin eleman sayısı ise 3'tür.
             Index'ler sıfırdan başlamaktadır*/


            //System.out.println(ogrenciler[i]);
                //YAYGIN KULLANIM AŞAĞIDAKİ GİBİDİR;

        for (String ogrenci : ogrenciler){
            System.out.println(ogrenci);
        }

        }
    }