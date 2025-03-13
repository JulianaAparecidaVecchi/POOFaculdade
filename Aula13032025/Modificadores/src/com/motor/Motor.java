package com.motor;

public class Motor {
    private boolean ligado;

    public Motor(){
        this.ligado = false;
    }

    public boolean isLigado(){
        return this.ligado;
    }

    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        this.ligado = false;
    }
}
