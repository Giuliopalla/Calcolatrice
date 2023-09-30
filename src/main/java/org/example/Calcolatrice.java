package org.example;

public class Calcolatrice {
    
    private int x;
    private int y;
    public Calcolatrice(){
        this.x=0;
        this.y=0;
        
    }
    
    public int somma(int x,int y){
        return x+y;
    }
    public int moltiplicazione(int x,int y){
        return x*y;
    }

    public int sottrazione (int x, int y){
        return x-y;
    }

    public double divisione(int x, int y){
        return x/y;
    }

    public int moltiper10(int x)
    {
        return x*10;
    }
}