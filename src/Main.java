import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner skaner = new Scanner(System.in);

        System.out.println("Hello World");

        System.out.println("Podaj swoje imię");
        String name = skaner.nextLine();

        System.out.println("Podaj swoj wiek");
        int age = skaner.nextInt();

        System.out.println("Czesc mam na imie " + name + " i mam " + age + " lat.");





    }
}