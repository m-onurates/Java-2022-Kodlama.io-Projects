public class Main {
    public static void main(String[] args) {
        //For döngüsü
        // ++ operatörü; İ'yi 1 arttır demek ( i=i+1) dememizin aynısı.
        // += operatörü; Örneğin i+=2 dersek bu i'yi 2'şer 2'şer arttır demek. Yani Tek sayıları yazdırmak için kullanılabilir.
        for ( int i=1; i<=10; i++){

            System.out.println(i);

        }
        System.out.println("For Döngüsü Bitti");

        //While
        int i = 1;
        while(i<10){
            System.out.println(i);
            i+=2;
        }

        System.out.println("While Döngüsü Bitti");
    }
}