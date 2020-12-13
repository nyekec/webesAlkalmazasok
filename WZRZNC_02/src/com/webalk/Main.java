package com.webalk;

public class Main {

    public static void main(String[] args) {

        int a=160, b=8;
        Kivonas k= new Kivonas();
        Szorzas s= new Szorzas();
        Osszeadas o= new Osszeadas();
        Osztas h=new Osztas();
        System.out.println("Kulonbseg: "+k.kulonbseg(a,b));
        System.out.println("Szorzat: "+s.szorzat(a,b));
        System.out.println("Osszeg: "+o.osszeg(a,b));
        System.out.println("Hanyados: "+h.hanyados(a,b));
    }
}
