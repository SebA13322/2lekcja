import java.util.Scanner;
public class zadanie4 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double test1;

        System.out.println("podaj wynik z testu 1 ");
        test1 = klawiatura.nextDouble();
        klawiatura.nextLine();

        double test2;

        System.out.println("podaj wynik z testu 2 ");
        test2 = klawiatura.nextDouble();
        klawiatura.nextLine();

        double test3;

        System.out.println("podaj wynik z testu 3 ");
        test3 = klawiatura.nextDouble();
        klawiatura.nextLine();



        double wynik;
        wynik = (test1 + test2 + test3) / 3;

        if(wynik < 60)
        {
            System.out.println("dostałeś 1 ");
        }

        if(wynik >=60 && wynik <70)
        {

            System.out.println("dostałeś 2 ");

        }


        if(wynik>=70 && wynik < 80)
        {

            System.out.println("dostałeś 3 ");

        }

        if(wynik >=80 && wynik < 90)
        {

            System.out.println("dostałeś 4 ");

        }

        if(wynik >=90 && wynik < 100)
        {

            System.out.println("dostałeś 5 ");

        }


    }
}