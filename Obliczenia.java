package com.company;

public class Obliczenia {

    public double wynik;

    public Obliczenia(){
        this.wynik = wynik;
    }

    public void wynik(Gramatura g, Obszar o){
        wynik = g.getIloscGramatury() / o.getWielkoscObszaru();
    }

    public void wypiszWynik(Gramatura g, Obszar o){
        java.text.DecimalFormat df=new java.text.DecimalFormat();
        df.setMaximumFractionDigits(4);
        df.setMinimumFractionDigits(4);
        wynik(g,o);
        //System.out.print(df.format(wynik) + " ");
        System.out.print(wynik + " ");
        System.out.print(g.getGramatura());
        System.out.print("/");
        System.out.print(o.getObszar());
        System.out.println();
    }

}
