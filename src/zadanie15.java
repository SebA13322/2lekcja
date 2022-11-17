import java.util.Scanner;
public class zadanie15 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double czeki;
        double oplata = 0;

        System.out.println("Podaj ilość czeków zakupionych w danym miesiącu: ");
        czeki = klawiatura.nextDouble();
        klawiatura.nextLine();

        if (czeki < 20)
        {
        oplata = (0.1*czeki+10);
        }

        if (czeki >= 20 && czeki < 40)
        {
            oplata = (0.08*czeki+10);
        }
        if (czeki >= 40 && czeki < 60)
        {
            oplata = (0.06*czeki+10);
        }
        if (czeki >= 60)
        {
            oplata = (0.04*czeki+10);
        }
        System.out.println("Opłaty pobrane przez bank wynoszą: " + oplata+ " w miesiącu");
    }
}