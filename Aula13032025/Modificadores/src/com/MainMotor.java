package com;
import com.motor.Motor;
public class MainMotor {
    public static void main(String[] args){

        Motor motor = new Motor();
        System.out.println("O estado atual do motor é: " + ((motor.isLigado())?"Ligado":"Desligado"));

        //Ligar o motor
        System.out.println("Ligando motor... ");
        motor.ligar();
        System.out.println("O estado atual do motor é: " + ((motor.isLigado())?"Ligado":"Desligado"));

        //Desligar o motor
        System.out.println("Desligando motor... ");
        motor.desligar();
        System.out.println("O estado atual do motor é: " + ((motor.isLigado())?"Ligado":"Desligado"));


    }
}
