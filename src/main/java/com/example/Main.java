package com.example;

import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int distanzaCorso = 100;
        Classifica cl = new Classifica();
        
        Cavallo c1 = new Cavallo("Fulmine", distanzaCorso, cl);
        Cavallo c2 = new Cavallo("Freccia", distanzaCorso, cl);
        Cavallo c3 = new Cavallo("Raggio", distanzaCorso, cl);
        Cavallo c4 = new Cavallo("Scheggia", distanzaCorso, cl);
        Cavallo c5 = new Cavallo("Veloce", distanzaCorso, cl);
        List<Cavallo> cav = List.of(c1,c2,c3,c4,c5);

        System.out.println("Pronti? Via!!!");
        for(Cavallo c : cav) c.start();
        for(Cavallo c : cav) c.join();

        cl.stampa();
    }
}