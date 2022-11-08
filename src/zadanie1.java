import java.util.Scanner;
public class zadanie1 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double liczba;

        System.out.println("Podaj liczbę: ");
        liczba = klawiatura.nextInt();
        klawiatura.nextLine();

        if(liczba==1)
        {
            System.out.println("liczba rzymska: I ");
        }
        if(liczba==2)
        {
            System.out.println("liczba rzymska: II ");
        }
        if(liczba==3)
        {
            System.out.println("liczba rzymska: III ");
        }
        if(liczba==4)
        {
            System.out.println("liczba rzymska: IV ");
        }
        if(liczba==5)
        {
            System.out.println("liczba rzymska: V ");
        }
        if(liczba==6)
        {
            System.out.println("liczba rzymska: VI ");
        }
        if(liczba==7)
        {
            System.out.println("liczba rzymska: VII ");
        }
        if(liczba==8)
        {
            System.out.println("liczba rzymska: VIII ");
        }
        if(liczba==9)
        {
            System.out.println("liczba rzymska: IX ");
        }
        if(liczba==10)
        {
            System.out.println("liczba rzymska: X ");
        }
        if(liczba>10)
        {
            System.out.println("Błąd");
        }
    }
    }