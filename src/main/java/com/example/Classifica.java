package com.example;

import java.util.ArrayList;

public class Classifica extends ArrayList<Cavallo> {
    
    public Classifica(){}

    public synchronized void segnaPosto(Cavallo c){
        this.add(c);
    }

    public void stampa(){
        int i = 0;
        for(Cavallo c : this){
            i++;
            System.out.println("#" + i + ": " + c.getNome());
        }
    }
}
