package br.fiap.com.GerenciadorEscoalar.Model;



public record Aluno( long Rm, String nome, String turma) {
    
    public Aluno(Long Rm, String nome, String turma){
        this.Rm = Math.abs( new Random().nextLong() );
        this.nome = nome;
        this.turma = turma;
    }


    
    

    
    
}
