package com.company;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Obliczenia obliczenia = new Obliczenia();
        Gramatura gramatura = new Gramatura();
        Obszar obszar = new Obszar();
        menu(obliczenia, gramatura, obszar);
    }

    public static void menu(Obliczenia obliczenia, Gramatura gramatura, Obszar obszar){
        while(true) {
            System.out.println("Witam wybierz jedna z opcji: ");
            System.out.println("1) Wporwadz dane");
            System.out.println("2) Zmodyfikuj dane");
            System.out.println("3) Wypisz aktualny wynik");
            System.out.println("4) Wyjdz");
            int wybor = scan.nextInt();
            switch(wybor){
                case 1:
                    gramatura.ustawIloscGramatury();
                    gramatura.ustawGramature();
                    obszar.ustawWielkoscObszaru();
                    obszar.ustawObszar();
                    obliczenia.wypiszWynik(gramatura, obszar);
                    break;
                case 2:
                    System.out.println("Co chcesz zmodyfikowac?");
                    System.out.println("1) Ilosc gramatury");
                    System.out.println("2) Gramature");
                    System.out.println("3) Ilosc obszaru");
                    System.out.println("4) Obszar");
                    System.out.println("5) Wroc");
                    int wybor2 = scan.nextInt();
                    switch(wybor2){
                        case 1:
                            gramatura.ustawIloscGramatury();
                            break;
                        case 2:
                            String poprzedniaGramatura = gramatura.getGramatura();
                            gramatura.ustawGramature();
                            String nowaGramatura = gramatura.getGramatura();
                            gramatura.zmianaGramatury(poprzedniaGramatura, nowaGramatura, gramatura);
                            break;
                        case 3:
                            obszar.ustawWielkoscObszaru();
                            break;
                        case 4:

                            String poprzedniObszar = obszar.getObszar();
                            obszar.ustawObszar();
                            String nowyObszar = obszar.getObszar();
                            obszar.zmianaObszaru(poprzedniObszar, nowyObszar, obszar);
                            break;
                        case 5:
                            System.out.println("Wracam");
                            break;
                        default:
                            System.out.println("ERROR");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Wynik: ");
                    if(gramatura.getIloscGramatury() == 0 && obszar.getWielkoscObszaru() == 0){
                        System.out.println("Brak danych");
                    } else {
                        obliczenia.wypiszWynik(gramatura, obszar);
                    }
                    break;
                case 4:
                    System.out.println("Wyjscie");
                    return;
                default:
                    System.out.println("ERROR");
                    break;
            }
        }
    }

}
