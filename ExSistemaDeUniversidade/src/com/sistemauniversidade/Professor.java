package com.sistemauniversidade;

public class Professor {
    private String nome;
    private String nomeDisciplina;
    private int idInstituicao;

    public Professor(String nome, String nomeDisciplina, int idInstituicao){
        this.nome = nome;
        this.nomeDisciplina = nomeDisciplina;
        this.idInstituicao = idInstituicao;
    }
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNomeDisciplina(){
        return this.nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getIdInstituicao(){
        return this.idInstituicao;
    }

    public void setIdInstituicao(int idInstituicao){
        this.idInstituicao = idInstituicao;
    }

}
