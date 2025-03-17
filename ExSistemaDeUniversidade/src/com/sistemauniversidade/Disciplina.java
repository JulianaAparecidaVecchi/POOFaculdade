package com.sistemauniversidade;

public class Disciplina {
    private Aluno aluno;
    private Professor professor;

    public Disciplina(Aluno aluno, Professor professor){
        this.aluno = aluno;
        this.professor = professor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String mostrarAluno(){
        return "Nome do aluno: " + aluno.getNome() + "\nMatícula do aluno: " + aluno.getMatricula() ;
    }

    public String mostrarProfessor(){
        return "Nome do professor: " + professor.getNome() + "\nNome da disciplina: " + professor.getNomeDisciplina() + "\nNúmero da instituição: " + professor.getIdInstituicao();
    }
}
