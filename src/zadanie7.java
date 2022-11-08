import java.util.Scanner;
public class zadanie7 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        String imie1;

        System.out.println("Podaj imie: ");
        imie1 = klawiatura.nextLine();
        klawiatura.nextLine();

        String imie2;

        System.out.println("Podaj imie: ");
        imie2 = klawiatura.nextLine();
        klawiatura.nextLine();

       String imie3;

        System.out.println("Podaj imie: ");
        imie3 = klawiatura.nextLine();
        klawiatura.nextLine();



            if (imie1.compareToIgnoreCase(imie2) < 0 && imie1.compareToIgnoreCase(imie3) < 0)
            {
                System.out.println(imie1);

                if (imie2.compareToIgnoreCase(imie3) < 0)
                {
                    System.out.println(imie2);
                    System.out.println(imie3);
                }

                if (imie3.compareToIgnoreCase(imie2) < 0)
                {
                    System.out.println(imie3);
                    System.out.println(imie2);
                }
            }

        if (imie2.compareToIgnoreCase(imie1) < 0 && imie2.compareToIgnoreCase(imie3) < 0)
        {
            System.out.println(imie2);

            if (imie1.compareToIgnoreCase(imie3) < 0)
            {
                System.out.println(imie1);
                System.out.println(imie3);
            }

            if (imie3.compareToIgnoreCase(imie1) < 0)
            {
                System.out.println(imie3);
                System.out.println(imie1);
            }
        }

        if (imie3.compareToIgnoreCase(imie1) < 0 && imie3.compareToIgnoreCase(imie1) < 0)
        {
            System.out.println(imie3);

            if (imie1.compareToIgnoreCase(imie2) < 0)
            {
                System.out.println(imie1);
                System.out.println(imie2);
            }

            if (imie2.compareToIgnoreCase(imie1) < 0)
            {
                System.out.println(imie2);
                System.out.println(imie1);
            }
        }

        }

    }
