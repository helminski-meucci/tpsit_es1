package com.example;

import java.util.List;

import com.Cavallo;

public class Main {
    public static void main(String[] args) {
        int distanzaCorso = 100;
        
        Cavallo c1 = new Cavallo("Fulmine", distanzaCorso);
        Cavallo c2 = new Cavallo("Freccia", distanzaCorso);
        Cavallo c3 = new Cavallo("Raggio", distanzaCorso);
        Cavallo c4 = new Cavallo("Scheggia", distanzaCorso);
        Cavallo c5 = new Cavallo("Veloce", distanzaCorso);
        List<Cavallo> cav = List.of(c1,c2,c3,c4,c5);

        System.out.println("Pronti? Via!!!");
        for(Cavallo c : cav) c.start();

        boolean vincitore = false;
        while (!vincitore) {
            for(Cavallo c : cav){
                if(!c.isAlive()){
                    System.out.println(c.getNome() + " HA VINTO LA CORSA!!!!");
                    vincitore = true;
                    break;
                }
            }
        }
    }
}