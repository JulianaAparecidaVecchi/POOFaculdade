package com;

import com.motor.Motor;

public class MainMotor {
    public static void main(String[] args){

        Motor motor = new Motor();
        System.out.println("O estado atual do motor é: " + ((motor.isLigado())?"Ligado":"Desligado")+ "\n");

        //Ligar o motor
        System.out.println("Ligando motor... ");
        motor.ligar();
        System.out.println("O estado atual do motor é: " + ((motor.isLigado())?"Ligado":"Desligado") + "\n");

        //Acelerar o motor
        System.out.println("O RPM atual do motor é: " + motor.getRpm());
        System.out.println("Acelerando motor (+3)... ");
        motor.calcularRpm(3);
        System.out.println("O RPM atual do motor é: " + motor.getRpm() + "\n");

        //Acelerar o motor
        System.out.println("O RPM atual do motor é: " + motor.getRpm());
        System.out.println("Acelerando motor (+5)... ");
        motor.calcularRpm(5);
        System.out.println("O RPM atual do motor é: " + motor.getRpm() + "\n");

        //Acelerar o motor
        System.out.println("O RPM atual do motor é: " + motor.getRpm());
        System.out.println("Acelerando motor (+5)... ");
        motor.calcularRpm(5);
        System.out.println("O RPM atual do motor é: " + motor.getRpm() + "\n");

        //Desacelerar o motor
        System.out.println("O RPM atual do motor é: " + motor.getRpm());
        System.out.println("Desacelerando motor (-3)... ");
        motor.calcularRpm(-3);
        System.out.println("O RPM atual do motor é: " + motor.getRpm() + "\n");

        //Desligar o motor
        System.out.println("Desligando motor... ");
        motor.desligar();
        System.out.println("O estado atual do motor é: " + ((motor.isLigado())?"Ligado":"Desligado")+ "\n");

        //Acelerar com motor desligado
        System.out.println("O RPM atual do motor desligado é: " + motor.getRpm());
        System.out.println("Acelerando motor (+3)... ");
        motor.calcularRpm(3);
        System.out.println("O RPM atual do motor é: " + motor.getRpm() + "\n");


    }
}
