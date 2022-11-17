import java.util.Scanner;
public class zadanie16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double ksiazki;
        double pkt = 0;

        System.out.println("Podaj ilość książek zakupionych w danym miesiącu: ");
        ksiazki = klawiatura.nextDouble();
        klawiatura.nextLine();

        if (ksiazki == 1)
        {
            pkt = 5;
        }

        if (ksiazki == 2)
        {
            pkt = 15;
        }

        if (ksiazki == 3)
        {
            pkt = 30;
        }
        if (ksiazki >= 4)
        {
            pkt = 60;
        }
        System.out.println("Przy zakupie " + ksiazki + " książek klient otrzyma: " + pkt+ " punktów");
    }
}