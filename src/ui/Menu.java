package ui;

import java.util.Scanner;

public class Menu {

    public void wyswietl() {

        Scanner wejscie = new Scanner(System.in);

        System.out.println("1 - dodaj alkohol");
        System.out.println("2 - usun alkohol");
        System.out.println("3 - wyswietl alkohol");
        System.out.println("q - wyjscie");
        String wybor;
do {


        System.out.println("Twoj wybor: ");
        wybor = wejscie.nextLine();

/*
       if (wybor.equals("1")) {
           System.out.println(" Dodaj");
       }
       if (wybor.equals("2")) {
           System.out.println(" Usun");
       }
       if (wybor.equals("3")) {
           System.out.println("Wyswietl");
       }

*/


switch (wybor) {
    case "1":
        System.out.println("dodawanie produktu");
        break;
    case "2":
        System.out.println("usun");
        break;
    case "3":
        System.out.println("wyswietl");
        break;
    case "q" :
        System.out.println("koniec programu");
        break;

        default:
            System.out.println("Bledny wybor, sprobuj ponownie");
}
    } while (! wybor.equals("q"));

    }
}
