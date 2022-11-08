import java.util.Scanner;
public class zadanie5 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);


        double masa;

        System.out.println("podaj mase w kilogramach: ");
        masa = klawiatura.nextDouble();
        klawiatura.nextLine();

        double wynik;
        wynik = masa * 9.8;

        if (wynik > 1000) {

            System.out.println("obiekt jest zbyt ciężki");

        }

        if (wynik < 10) {

            System.out.println("obiekt jest zbyt lekki");

        }

        if (wynik > 10 && wynik < 1000) {

            System.out.println("obiekt jest idealny");

        }
    }}