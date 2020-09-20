package com.company;

import java.util.Scanner;

public class Obszar {
    public double wielkoscObszaru;
    public String obszar;
    public static Scanner scan = new Scanner(System.in);

    public Obszar(){
        this.obszar = obszar;
        this.wielkoscObszaru = wielkoscObszaru;
    }

    public void setObszar(String in){ obszar = in; }
    public void setWielkoscObszaru(double in){ wielkoscObszaru = in; }

    public String getObszar(){ return obszar; }
    public double getWielkoscObszaru(){ return wielkoscObszaru; }

    public void ustawObszar(){
        Boolean koniec = true;
        while(koniec == true){
            System.out.println("Wybierz obszar: ");
            System.out.println("1) mm^2");
            System.out.println("2) cm^2");
            System.out.println("3) dm^2");
            System.out.println("4) m^2");
            char wynik = '0';
            int wybor = scan.nextInt();
            switch(wybor){
                case 1:
                    setObszar("mm^2");
                    koniec = false;
                    break;
                case 2:
                    setObszar("cm^2");
                    koniec = false;
                    break;
                case 3:
                    setObszar("dm^2");
                    koniec = false;
                    break;
                case 4:
                    setObszar("m^2");
                    koniec = false;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }

    public void ustawWielkoscObszaru(){
        System.out.println("Wpisz wielkosc obszaru: ");
        Boolean prawidlowy = true;
        while(prawidlowy == true){
            double wielkosc = scan.nextDouble();
            if (wielkosc > 0){
                prawidlowy = false;
                setWielkoscObszaru(wielkosc);
            } else {
                System.out.println("Bledna wielkosc wpisz jeszcze raz!!!");
            }
        }
    }

    public void zmianaWielkosciObszaru(double wartoscZmiany, Obszar o){
        o.setWielkoscObszaru((o.getWielkoscObszaru() * wartoscZmiany));
    }

    public static void zmianaObszaru(String poprzedni, String nowy, Obszar obszar){
        if(poprzedni != nowy){
            if(poprzedni == "mm^2" && nowy == "cm^2"){
                obszar.zmianaWielkosciObszaru(0.01, obszar);
            } else if(poprzedni == "mm^2" && nowy == "dm^2"){
                obszar.zmianaWielkosciObszaru(0.0001, obszar);
            } else if(poprzedni == "mm^2" && nowy == "m^2"){
                obszar.zmianaWielkosciObszaru(0.000001, obszar);
            } else if(poprzedni == "cm^2" && nowy == "mm^2"){
                obszar.zmianaWielkosciObszaru(100, obszar);
            } else if(poprzedni == "cm^2" && nowy == "dm^2"){
                obszar.zmianaWielkosciObszaru(0.01, obszar);
            } else if(poprzedni == "cm^2" && nowy == "m^2"){
                obszar.zmianaWielkosciObszaru(0.0001, obszar);
            } else if(poprzedni == "dm^2" && nowy == "mm^2"){
                obszar.zmianaWielkosciObszaru(10000, obszar);
            } else if(poprzedni == "dm^2" && nowy == "cm^2"){
                obszar.zmianaWielkosciObszaru(100, obszar);
            } else if(poprzedni == "dm^2" && nowy == "m^2"){
                obszar.zmianaWielkosciObszaru(0.01, obszar);
            } else if(poprzedni == "m^2" && nowy == "mm^2"){
                obszar.zmianaWielkosciObszaru(1000000, obszar);
            } else if(poprzedni == "m^2" && nowy == "cm^2"){
                obszar.zmianaWielkosciObszaru(10000, obszar);
            } else if(poprzedni == "m^2" && nowy == "dm^2"){
                obszar.zmianaWielkosciObszaru(100, obszar);
            }
        }
    }
}
