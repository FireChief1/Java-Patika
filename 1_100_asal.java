import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        /*
           1-100 arası asal sayılar

         */
        /*Scanner inp = new Scanner(System.in);
        int number, sum = 0;

        System.out.print("Sayı gir:");
        number = inp.nextInt();*/
        boolean isPrime = true;

        for (int i = 1; i <= 100; i++) {

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }


            }
            if (isPrime == true)
                System.out.printf(i + " asal\n");
            isPrime = true;
        }
    }
}
