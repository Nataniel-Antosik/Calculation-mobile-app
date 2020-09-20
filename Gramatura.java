package com.company;

import java.util.Scanner;

public class Gramatura {
    public double iloscGramatury;
    public String gramatura;
    public static Scanner scan = new Scanner(System.in);

    public Gramatura(){
    this.gramatura = gramatura;
    this.iloscGramatury = iloscGramatury;
    }

    public void setGramatura(String in) { gramatura = in; }
    public void setIloscGramatury(double in) { iloscGramatury = in; }

    public String getGramatura(){ return gramatura; }
    public double getIloscGramatury() { return iloscGramatury; }

    public void ustawGramature(){
        Boolean koniec = true;
        while(koniec == true){
            System.out.println("Wybierz gramature: ");
            System.out.println("1) g");
            System.out.println("2) dag");
            System.out.println("3) kg");
            char wynik = '0';
            int wybor = scan.nextInt();
            switch(wybor){
                case 1:
                    setGramatura("g");
                    koniec = false;
                    break;
                case 2:
                    setGramatura("dag");
                    koniec = false;
                    break;
                case 3:
                    setGramatura("kg");
                    koniec = false;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }

    public void ustawIloscGramatury(){
        System.out.println("Wpisz wartosc gramatury: ");
        Boolean prawidlowy = true;
        while(prawidlowy == true){
            double ilosc = scan.nextDouble();
            if (ilosc > 0){
                prawidlowy = false;
                setIloscGramatury(ilosc);
            } else {
                System.out.println("Bledna ilosc wpisz jeszcze raz!!!");
                prawidlowy = true;
            }
        }
    }

    public void zmianaIlosciGramatury(double wartoscZmiany, Gramatura g){
        g.setIloscGramatury((g.getIloscGramatury() * wartoscZmiany));
    }

    public static void zmianaGramatury(String poprzedni, String nowy, Gramatura gramatura){
        if(poprzedni != nowy){
            if(poprzedni == "g" && nowy == "dag"){
                gramatura.zmianaIlosciGramatury(0.1, gramatura);
            } else if(poprzedni == "g" && nowy == "kg"){
                gramatura.zmianaIlosciGramatury(0.001, gramatura);
            } else if(poprzedni == "dag" && nowy == "g"){
                gramatura.zmianaIlosciGramatury(10, gramatura);
            } else if(poprzedni == "dag" && nowy == "kg"){
                gramatura.zmianaIlosciGramatury(0.01, gramatura);
            } else if(poprzedni == "kg" && nowy == "g"){
                gramatura.zmianaIlosciGramatury(1000, gramatura);
            } else if(poprzedni == "kg" && nowy == "dag"){
                gramatura.zmianaIlosciGramatury(100, gramatura);
            }
        }
    }
}
