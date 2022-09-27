public class Main {
    public static void main(String[] args) {

        //while döngüsünden farkı ise şart sağlanmasa bile yapılan işlemi bir kez de olsa çalıştıracaktır.
       int i=2;

        do{
           System.out.println(i);
           i+=2;

       }while(i<10);
            System.out.println("Döngü bitti" +i);
    }
}