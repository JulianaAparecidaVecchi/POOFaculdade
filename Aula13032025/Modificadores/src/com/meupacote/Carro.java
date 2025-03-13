package com.meupacote;

public class Carro {
    public String modelo;
    private int ano;
    protected String cor;
    int numeroDePortas;
    private boolean ligado;

    public Carro(String modelo, int ano, String cor, int numeroDePotas) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.numeroDePortas = numeroDePotas;
        this.ligado = false;
    }

    public void ligar(){
        System.out.println("O carro está ligado!!!");
    }

    private void acelerar(){
        System.out.println("O carro está acelerando...");
    }

    public int getAno(){
        return this.ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    protected void printarCarro(String novaCor){
        this.cor = novaCor;
        System.out.println("O carro foi printado " + novaCor);
    }

    void mostrarNumeroDePortas(){
        System.out.println("O carro tem " + numeroDePortas + "portas");
    }

    public boolean isLigado(){
        return isLigado();
    }



}
