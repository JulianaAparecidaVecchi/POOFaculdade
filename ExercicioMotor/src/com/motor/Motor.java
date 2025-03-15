package com.motor;

public class Motor {
    private boolean ligado;
    private int rpm;

    public Motor(){

        this.ligado = false;
    }

    public boolean isLigado(){
        return this.ligado;
    }

    public void ligar(){
        this.ligado = true;
        this.rpm = 1000;
    }

    public void desligar(){
        this.ligado = false;
        this.rpm = 0;
    }

    public int getRpm(){
        return this.rpm;
    }

    public void calcularRpm(int aceleracao) {
        if (ligado = true) {
            if (rpm <= 0) {
                this.rpm = 0;
                this.ligado = false;
            } else {
                int novoRpm = rpm + (aceleracao * 1000);
                if (novoRpm > 8000){
                    this.rpm = 8000;
                } else{
                   this.rpm = novoRpm;
                }
            }
        }
    }
}
