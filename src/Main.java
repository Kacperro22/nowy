import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner skaner = new Scanner(System.in);

        System.out.println("KALKULATOR");

        System.out.println("Podaj pierwsza liczbę");
        int one = skaner.nextInt();

        System.out.println("Podaj druga liczbe");
        int two = skaner.nextInt();

        int suma = one+two;

        System.out.println("SUMA: " + (one+two));

    }
}