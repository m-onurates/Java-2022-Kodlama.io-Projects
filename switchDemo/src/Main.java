public class Main {
    public static void main(String[] args) {

        /* Switch bloklarıyla dallandırmalar gerçekleştirilmektedir.*/
        //grade = not demektir.
        // case = durum demektir.
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel Not : Geçtiniz");
                break;

            case 'B':
                System.out.println("Çok Güzel Not : Geçtiniz");
                break;

            case 'C':
                System.out.println("İyi Not : Geçtiniz");
                break;

            case 'D':
                System.out.println("Fena Değil Not : Geçtiniz");
                break;

            case 'F':
                System.out.println("Maalesef : Kaldınız");
                break;

            default:
                System.out.println("Geçersiz Not Girdiniz");
        }


    }
}