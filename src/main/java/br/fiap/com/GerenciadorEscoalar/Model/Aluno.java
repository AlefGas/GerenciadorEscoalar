package br.fiap.com.GerenciadorEscoalar.Model;

import java.util.Random;

public class Aluno( ) {
    
    public Aluno(Long Rm, String nome, String turma){
        this.Rm = Math.abs( new Random().nextLong() );
        this.nome = nome;
        this.turma = turma;
    }


    
    

    
    
}
