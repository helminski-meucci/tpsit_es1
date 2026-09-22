package com;

import java.util.Random;

public class Cavallo extends Thread {
    private String nome;
    private int distanza;
    private int percorsa;

    public Cavallo(String n, int d){
        nome = n;
        distanza = d;
        percorsa = 0;
    }

    public String getNome(){ return nome; }

    public void run(){
        Random random = new Random();
        while(percorsa < distanza){
            try {
                int tempoSleep = random.nextInt(400) + 400; // Tra 400 e 800 ms
                Thread.sleep(tempoSleep);
            } catch (InterruptedException e) {
                System.out.println("Il thread è stato interrotto");
            }
            percorsa += random.nextInt(10) + 1;
            System.out.println("[" + nome + "] ha percorso " + percorsa + " metri");
        }
        System.out.println("[" + nome + "] ha terminato il percorso!");
    }

}
