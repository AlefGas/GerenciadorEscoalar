package br.fiap.com.GerenciadorEscoalar.Model;



public class Aluno {
    private int Rm;
    private String nome;
    private String turma;



    
    public Aluno(int rm, String nome, String turma) {
        Rm = rm;
        this.nome = nome;
        this.turma = turma;
    }
    public int getRm() {
        return Rm;
    }
    public void setRm(int rm) {
        Rm = rm;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }

    private int fazerRm(){
        this.setRm();

    }

    
    
}
