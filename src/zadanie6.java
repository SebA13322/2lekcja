import java.util.Scanner;
public class zadanie6 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);


        int sekundy;

        System.out.println("podaj liczbę sekund: ");
        sekundy = klawiatura.nextInt();
        klawiatura.nextLine();

        int minuty;
        minuty = sekundy / 60;

        int godziny;
        godziny = sekundy / 3600;

        int dni;
        dni = sekundy / 86400;

        if(sekundy<60)
        {
            System.out.println("liczba sekund: " + sekundy);
        }
        if(sekundy>60 && sekundy <3600)
        {
            System.out.println("liczba sekund: " + minuty);
        }

        if(sekundy>=3600 && sekundy <= 86400)
        {
            System.out.println("liczba godzin: " + godziny);
        }

        if(sekundy>86400)
        {
            System.out.println("liczba dni: " + dni);
        }

    }
}