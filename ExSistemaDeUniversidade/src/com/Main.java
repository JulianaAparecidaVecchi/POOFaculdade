package com;

import com.sistemauniversidade.Professor;
import com.sistemauniversidade.Aluno;
import com.sistemauniversidade.Disciplina;

public class Main {
    public static void main(String[] args){
        //Instanciar um professor
        Professor abimael = new Professor("Abimael Junior", "Programação Orientada a Objetos", 1234);

        //Instanciar um aluno
        Aluno juliana = new Aluno("Juliana Aparecida", 7777);

        // Intanciar uma disciplina
        Disciplina poo = new Disciplina(juliana, abimael);

        //Mostrar informações
        System.out.println("-----| Dados do Aluno |-----");
        System.out.println(poo.mostrarAluno());
        System.out.println("-----| Dados do Professor |-----");
        System.out.println(poo.mostrarProfessor());

    }
}




